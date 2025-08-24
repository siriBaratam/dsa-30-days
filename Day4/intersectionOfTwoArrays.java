class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> resArray = new ArrayList<>();
        int i = 0, j =0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j])
                i++;
            else if(nums1[i] > nums2[j])
                j++;
            else{
                resArray.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[resArray.size()];
        for(i=0;i< resArray.size(); i++) {
            res[i] = resArray.get(i);
        }
        return res;
    }
}