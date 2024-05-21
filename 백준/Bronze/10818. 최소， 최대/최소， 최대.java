import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] number = br.readLine().split(" ");
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            result[i] = Integer.parseInt(number[i]);
        }

        Arrays.sort(result);
        br.close();
        System.out.println(result[0] + " " + result[N-1]);
    }
}