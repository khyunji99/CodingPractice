import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String[] num = br.readLine().split(" ");
         String result = Integer.parseInt(num[0]) == Integer.parseInt(num[1]) ? "==" 
                 : Integer.parseInt(num[0]) > Integer.parseInt(num[1]) ? ">" : "<";

         System.out.println(result);
    }
}