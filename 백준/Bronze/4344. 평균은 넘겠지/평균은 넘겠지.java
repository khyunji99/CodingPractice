import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] scores;
        int testNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < testNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            scores = new int[N];
            double totalScore = 0;
            double count = 0;

            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                totalScore += scores[j]; // 총점
            }
            double avg = (totalScore / N); // 평균
            for (int j = 0; j < N; j++) {
                if (scores[j] > avg) {
                    count++; // 평균 이상 학생 수
                }
            }
            System.out.printf("%.3f%%\n", (count / N) * 100);
        }
        br.close();
    }
}