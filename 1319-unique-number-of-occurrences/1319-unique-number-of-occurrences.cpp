class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int, int> map;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            if (map.count(arr[i]) > 0) {
                int incr = map[arr[i]] + 1;
                map[arr[i]] = incr;
            }
            else {
                map[arr[i]] = 1;
            }
        }

        unordered_set<int> set;
        bool ans = true;

        for (const auto& val : map) {
            if (set.count(val.second) > 0) {
                ans = false;
                break;
            }
            set.insert(val.second);
        }

        return ans;
    }
};