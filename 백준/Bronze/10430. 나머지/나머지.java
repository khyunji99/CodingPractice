import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int result1 = (Integer.valueOf(num[0]) + Integer.valueOf(num[1])) % Integer.valueOf(num[2]);
        int result2 = result1 % Integer.valueOf(num[2]);
        int result3 = (Integer.valueOf(num[0]) * Integer.valueOf(num[1])) % Integer.valueOf(num[2]);
        int result4 = result3 % Integer.valueOf(num[2]);
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}