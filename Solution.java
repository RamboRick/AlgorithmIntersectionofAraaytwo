package leetcode349;
import java.util.HashSet;
//349. Intersection of Two Arrays
//时间复杂度: O(nlogn)
//空间复杂度: O(n)
public class Solution {
	public int[] intersection(int[] nums1, int[] nums2){
		
		HashSet<Integer> arr = new HashSet<Integer>();
		for(int num:nums1){
			arr.add(num);
		}
		
		HashSet<Integer> resultSet = new HashSet<Integer>();
		for(int num:nums2){
			if( arr.contains(num)){
				resultSet.add(num);
			}
		}
		
		int[] res = new int[resultSet.size()];
		int index = 0;
		for(Integer num : resultSet){
			res[index++] = num;
		}
		
		return res;
		
	}
	private static void printArr(int[] arr){
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = (new Solution()).intersection(nums1, nums2);
        printArr(res);
    }
}
