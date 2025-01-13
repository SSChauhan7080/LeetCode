public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] x =new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    x[0]=i;
                    x[1]=j;

                }
            }

        }
        return x;

    }
}
