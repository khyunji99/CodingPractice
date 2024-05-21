import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int maxNum = -1000001;
        int minNum = 1000001;
        
        while (st.hasMoreTokens()) {
            int value = Integer.parseInt(st.nextToken());
            if (value > maxNum) {
                maxNum = value;
            }
            if (value < minNum) {
                minNum = value;
            }
        }
        System.out.println(minNum + " " + maxNum);
    }
}
