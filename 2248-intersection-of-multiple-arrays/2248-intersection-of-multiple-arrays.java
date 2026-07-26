import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] arr : nums) {
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == nums.length) {
                ans.add(entry.getKey());
            }
        }

        Collections.sort(ans);

        return ans;
    }
}