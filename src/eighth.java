import java.math.*;
public class eighth {
    public static int removeDuplicates(int[] nums) {
        int result;
        int[] tempA = new int[nums.length];
        int j = 0;
        for (int i=0; i< nums.length-1; i++){
            if (nums[i] != nums[i+1]){
                tempA[j++] = nums[i];
            }
        }
        tempA[j++] = nums[nums.length-1];
        for (int i=0; i<j; i++){
            nums[i] = tempA[i];
        }
        for (int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        return j;
    }
    public static void main(String[] args) {
        int[] array = new int[] {0,1,1,1,2,2,2,3,4,4,5};
        System.out.println(removeDuplicates(array));
    }
}
