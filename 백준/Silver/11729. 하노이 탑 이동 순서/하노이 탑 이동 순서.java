import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 원판의 개수

        bw.write((int)(Math.pow(2,N) - 1) + "\n"); // 원판 이동횟수 출력

        Hanoi(N,1,2,3);

        bw.flush();
        bw.close();

    }

    /*
    * N : 원판의 개수
    * start : 출발지
    * mid : 옮기기 위해 이동하는 장소(경유지..?)
    * to : 목적지(도착지)
    */

    public static void Hanoi(int N, int start, int mid, int to) throws IOException {
        // if 이동할 원판의 개수가 1개라면, Hanoi() 메서드 종료
        if ( N == 1 ) {
            bw.write(start + " " + to + "\n");
            return;
        }

        // A -> C 기둥으로 원판을 옮긴다고 가정할 때,
        // 1. N-1개를 A -> B 기둥으로 이동 (= start 지점의 N-1개의 원판을 mid 기둥으로 옮긴다.)
        Hanoi(N-1, start, to, mid);


        // 2. 1개의 원판을 A -> C 기둥으로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
        bw.write(start + " " + to + "\n");


        // 3. N-1개를 B -> C 기둥으로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
        Hanoi(N-1, mid, start, to);

    }
}
