import java.io.*;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(br.readLine()) % 42);
        }

        br.close();
        System.out.println(list.size());
    }
}