
// @Title: 寻找两个正序数组的中位数 (Median of Two Sorted Arrays)
// @Author: 2692203539@qq.com
// @Date: 2022-03-11 17:51:44
// @Runtime: 5 ms
// @Memory: 42.6 MB

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         List <Integer>list = new ArrayList();
//       list.addAll(Arrays.asList(nums1));
//       list.addAll(Arrays.asList(nums2));
        int sum =nums1.length+nums2.length;
        for(int i = 0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
       Collections.sort(list);
       if((nums1.length+nums2.length)%2>0){
           return list.get(sum/2);
       }else {
           return (list.get(sum/2-1)+list.get(sum/2))/2.0;
       }
    }
}
