class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        
        unordered_map<int, int> freq;
        for (int num : nums) {
            freq[num]++;
        }

        int sum = 0;

      
        for (int num : nums) {
            if (freq[num] == 1) {
                sum += num;
            }
        }

        return sum;
    }
};