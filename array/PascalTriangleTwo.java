package array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwo {

    public static void main(String[] args) {
        List<Integer> result = new PascalTriangleTwo().generate(5);
        System.out.println(result);
    }

    public List<Integer> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) { // corner is always one
                    rows.add(1);
                } else {
                    List<Integer> prevRow = result.get(i - 1);
                    rows.add(prevRow.get(j - 1) + prevRow.get(j));
                }

            }
            result.add(rows);

        }

        return result.get(result.size() - 1);

    }

}
