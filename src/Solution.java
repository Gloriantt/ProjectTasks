import groovy.transform.ToString;

public class Solution {
    public static int singleNumber(int[] nums) {
        boolean flag;
        int number=0;
        for (int i=0; i<nums.length; i++)
        {
            flag=false;
            for (int j=0; j<nums.length; j++)
            {
                if (nums[j]==nums[i] && i!=j)
                {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
            {
                number=nums[i];
            }
        }
        return number;

    }
    public static void main(String[] args) {
        int[] array = new int[]{1,1,2,2,5,6,6};
        int number= singleNumber(array);
        if(number!=0) {
           System.out.println(number);
        }else{
            System.out.println(number);
        }
    }
}