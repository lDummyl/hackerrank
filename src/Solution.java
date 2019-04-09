import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the matrixRotation function below.
    static void matrixRotation(List<List<Integer>> matrix, int r) {
        for (int i = 0; i < r; i++) {
            for (int col = 0; col < 4; col++) {
                for (int row = 0; row < 4; row++) {
                    if (row == 0 || row == 4) {

                    }

                }
            }
        }
        matrix.forEach(System.out::println);
    }

    private static void switchPlaces(List<List<Integer>> matrix, int x1, int y1, int x2, int y2) {
        Integer first = matrix.get(x1).get(y1);
        Integer second = matrix.get(x2).get(y2);
        matrix.get(x1).set(y1, second);
        matrix.get(x2).set(y2, first);
    }

    public static void main(String[] args) throws IOException {

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("example.txt"));

        String[] mnr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(mnr[0]);

        int n = Integer.parseInt(mnr[1]);

        int r = Integer.parseInt(mnr[2]);

        List<List<Integer>> matrix = new ArrayList<>();
        IntStream.range(0, m).forEach(i -> {
            try {
                matrix.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        matrixRotation(matrix, r);
        bufferedReader.close();
    }
}
