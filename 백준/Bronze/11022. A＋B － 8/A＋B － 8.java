import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int TC = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= TC; i++) {
            String str = br.readLine();
            sb.append("Case #").append(i).append(": ").append(str.charAt(0)-'0')
                    .append(" + ").append(str.charAt(2)-'0').append(" = ")
                    .append((str.charAt(0)-'0')+(str.charAt(2)-'0'))
                    .append('\n');
        }
        System.out.println(sb);
    }
}