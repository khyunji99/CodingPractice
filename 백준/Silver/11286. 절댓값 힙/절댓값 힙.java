import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        // 들어오는 데이터가 많을 땐 scanner 보단 bufferedreader 사용하는 것이 자바에선 시간복잡도면에서 조금 더 유리하다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* 우선순위 큐 정렬 기준 새로 정의하기 (람다식 활용..?) */
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((o1, o2) -> { // 비교할 객체 2개 o1, o2 선언 (정렬 조건을 세분화하고 문제의 조건에 맞게 하기 위해 오버라이드 하는 느낌)
            /* 비교 객체를 어떻게 비교할건지 새로 정의 */

            int first_abs = Math.abs(o1); // o1 = 1
            int second_abs = Math.abs(o2); // o2 = -1
            if (first_abs == second_abs) { // 2. 절댓값이 작은 경우 음수 우선
                return o1 > o2 ? 1 : -1;
                // o1이 o2가크면 1 리턴, 아니면 -1 리턴
                // 1, -1이 중요한게 아니라 1을 리턴한다는 것은 양수를 리턴한다는 의미이고,
                // -1을 리턴한다는 것은 음수를 리턴한다는 것을 의미하는 것이다.
            }
            return first_abs - second_abs; // 1. 절댓값 작은 데이터 우선
            // 첫번째 데이터 o1의 절댓값 first_abs가 더 크면 양수를 리턴, 두번째 데이터 o2의 절댓값 second_abs가 더 크면 음수를 리턴한다. 는 것은 절댓값 작은 데이터가 우선으로 정렬되게 한다는 것을의미한다.
            // 이 compare 에서 따지는 것은 리턴값이 음수이냐 양수이냐로 비교하는 o1, o2 의 정렬 기준을 세우는 것
        });

        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (pQueue.isEmpty())
                    System.out.println(0);
                else
                    System.out.println(pQueue.poll());
            } else
                pQueue.add(request);
        }
    }
}
