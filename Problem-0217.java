class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> vals = new HashSet<>();
        for (int num : nums) {
            if (vals.contains(num)) {
                return true;
            }
            vals.add(num);
        }
        return false;
    }
}
