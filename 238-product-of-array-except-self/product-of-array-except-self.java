class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p= 1;
        int n= nums. length;
        int[] prefix = new int [n];
        int[] suffix = new int [n];
        prefix[0] = nums [0];
        suffix[n-1] = nums [n-1];
        for(int i = 1; i<n;i++){
            prefix[i] = prefix [i-1]*nums[i];
        }
        for(int i = n-2; i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i];
        }
        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            ans[i] = 1;
            if(i > 0)ans[i] *= prefix[i-1];
            if(i < n-1)ans[i] *= suffix[i+1];
        }
        return ans;
    }
}