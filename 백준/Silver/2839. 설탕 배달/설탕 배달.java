import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugarKg = Integer.parseInt(br.readLine());
        int result = 0;
        if (sugarKg % 5 == 0) {
            result = sugarKg / 5;
        } else {
            while (sugarKg > 0) {
                sugarKg -= 3;
                result++;
                if (sugarKg % 5 == 0) {
                    result += sugarKg / 5;
                    sugarKg = 0;
                    break;
                }
            }
            if (sugarKg != 0) result = -1;
        }
        System.out.println(result);
        br.close();
    }
}