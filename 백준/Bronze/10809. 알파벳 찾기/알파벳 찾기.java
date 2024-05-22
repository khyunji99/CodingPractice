import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(str.indexOf(c) + " ");
        }
        
        System.out.println(sb);
    }
}