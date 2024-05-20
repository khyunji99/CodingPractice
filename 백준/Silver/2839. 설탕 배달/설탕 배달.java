import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugarKg = Integer.parseInt(br.readLine());
        int result = 0;
        while (true) {
            if (sugarKg % 5 == 0) {
                result += sugarKg / 5;
                break;
            }
            sugarKg -= 3;
            result++;
            if (sugarKg < 0) {
                result = -1;
                break;
            }
        }
        System.out.println(result);
        br.close();
    }
}