import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i < n+1) {
            String[] ab = br.readLine().split(" ");
            int sum = Integer.parseInt(ab[0]) + Integer.parseInt(ab[1]);
            sb.append("Case #" + i + ": " + ab[0] + " + " + ab[1] + " = " + sum + "\n");
            i++;
        }
        System.out.println(sb);
    }
}