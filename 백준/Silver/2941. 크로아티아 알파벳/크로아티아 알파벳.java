import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine();
        String[] croatians = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String str : croatians) {
            if (alphabet.contains(str)) {
                alphabet = alphabet.replace(str, "*");
            }
        }
        System.out.println(alphabet.length());
        br.close();
    }
}