import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sixth{
        public static List<List<Integer>> generate(int numRows) {
                List<List<Integer>> result = new ArrayList<>();
                if (numRows == 0) return result;
                if (numRows >= 1) result.add(Arrays.asList(1));
                if (numRows >= 2) result.add(Arrays.asList(1, 1));

                for (int row = 2; row < numRows; row++) {
                        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1));
                        List<Integer> lastRow = result.get(row - 1);
                        int end = row - 1;
                        for (int i = 1; i <= end; i++) {
                                list.add(i, lastRow.get(i) + lastRow.get(i - 1));
                        }
                        result.add(list);
                }
                return result;
        }
        public static void main(String[] args) {
                int numRows= 3;
                List<List<Integer>> result=generate(numRows);
                System.out.println(result.size());
                for (List x :result )
                {
                        System.out.println(x);
                }


        }
}
