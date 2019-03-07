class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map <int, int> myMap;
        for (int i = 0; i < nums.size(); i++) {
            int diff = target - nums[i];
            if (myMap.find(diff) != myMap.end()) { //fix this
                return {myMap[diff], i,};
            }
            else {
                myMap.insert(pair <int, int>(nums[i], i));
            }
        }
        return {0,0}; //could do BETTER
    }
};
