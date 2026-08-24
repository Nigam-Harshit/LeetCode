class Solution {
    int findDigit(int num){
                if (num==0){
                    return 1;
                }
                int count=0;
                while(num>0){
                    num= num/10;
                    count++;
                }
                return count;
     }

    public int findNumbers(int[] nums) {
            
        int digits[]= new int[nums.length];

        int number=0;
        for(int i=0;i<nums.length;i++){
            digits[i]=findDigit(nums[i]);
            if(digits[i]%2==0){
                number=number+1;
            }
        }
        return number;

    }
}