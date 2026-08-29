class Solution {
    public void rotate(int[] nums, int k) {
        int d=0;
        if(nums.length>k){
            d=k;
        }
        else{
            d=k % nums.length;
        }

    for(int i=0;i<(nums.length-d)/2;i++){
        int temp =nums[i];
        nums[i] = nums[nums.length-d-1-i];
        nums[nums.length-d-1-i] = temp;
    }
    int left = nums.length-d;
        int right = nums.length-1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    for(int i = 0; i < nums.length / 2; i++){
        int temp = nums[i];
        nums[i] = nums[nums.length - 1 - i];
        nums[nums.length - 1 - i] = temp;
    }
    }
}