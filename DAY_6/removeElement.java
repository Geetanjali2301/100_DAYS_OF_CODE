package DAY_6;
/*
#Leetcode 27
*/

public class removeElement {

    public static int remove_Element(int[] nums, int val) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[]={2,3,2,3};
        int ans=remove_Element(arr, 3);
        System.out.println("Number of elements except val: "+ans);
    }
    
}
