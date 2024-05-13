import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(
                Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine())));
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr.stream().mapToInt(Integer::intValue).sum() / arr.size());
        System.out.println(arr.get(2));
    }
}