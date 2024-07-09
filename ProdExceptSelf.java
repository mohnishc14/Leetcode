import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums){
        int count = nums.length;
        return prodHelper(0, nums, 0);
    }

    public int[] prodHelper(int idx, int[] arr, int idx1){
        int num = 1;
        for (int i = 0; i < arr.length; i++){
            if (i != idx) num *= arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.productExceptSelf(new int[]{1, 2, 3, 4})));

    }
}