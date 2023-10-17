class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<Integer>(0);
        List<Integer> list2 = new ArrayList<Integer>(0);

        for (int i = 0; i < nums1.length; i++) {
            int check = 0;
    
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]) {
                    check++;
                    break;    
                }
            }
            if (check==0 && !inList(list1, nums1[i])) {

                list1.add(nums1[i]);                
            }
            
        }


         for (int i = 0; i < nums2.length; i++) {
            int check = 0;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i]==nums1[j]) {
                    check++;
                    break;    
                }
            }
            if (check==0 && !inList(list2, nums2[i])) {
                list2.add(nums2[i]);                
            }
        }

        List<List<Integer>> fina = new ArrayList<>();
        fina.add(list1);
        fina.add(list2);
        return fina;
        
    }

    public static boolean inList(List<Integer> list, int x)
    {
        for (Integer integer : list) {
            if (integer==x) {
                return true;
            }
        }
        return false;
    }
}