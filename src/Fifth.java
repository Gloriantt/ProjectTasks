public class Fifth {
    public static int largestPerimeter(int[] nums) {
        int P=0,P2=0,a=0,b=0,c=0;
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    a = nums[i];
                    b = nums[j];
                    c = nums[k];
                    if (a < b+c && b < c+a && c < a+b){
                        P = Math.max(P, a+b+c);
                    }
                }
            }
        }
        return P;
    }
    public static void main(String[] args) {
        int[] array = new int[] {3,2,3,4};
        System.out.println(largestPerimeter(array));
    }
}
