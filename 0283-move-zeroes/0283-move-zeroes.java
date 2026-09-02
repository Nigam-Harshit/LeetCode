class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
       // int zer[]=new int[nums.length];
        int z=0;
       // int a=0;
        for(int i =0;i<nums.length;i++){
            if (nums[i]!=0){
                arr[z]=nums[i];
                z++;
            }
            
        }
        for(int i=z;i<nums.length;i++){
            arr[i]=0;
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

    }
}