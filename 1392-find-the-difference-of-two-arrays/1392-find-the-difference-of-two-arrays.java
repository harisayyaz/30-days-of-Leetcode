class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<Integer>(0);
        List<Integer> list2 = new ArrayList<Integer>(0);

        for (Integer integer : nums1) {
            set1.add(integer);
        }

        for (Integer integer : nums2) {
            set2.add(integer);
        }

        for (Integer integer : nums1) {
            if (!set2.contains(integer) && !list1.contains(integer)) {
                list1.add(integer);
            }
        }

         for (Integer integer : nums2) {
            if (!set1.contains(integer) && !list2.contains(integer)) {
                list2.add(integer);
            }
        }

        List<List<Integer>> fina = new ArrayList<>();
        fina.add(list1);
        fina.add(list2);
        return fina;
    }
}