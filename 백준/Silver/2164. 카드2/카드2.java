import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        /* 1. 1부터 주어지는 카드의 수까지 큐에 추가하기(넣기) */
        for(int i = 1; i <= N; i++) {  // ex) N=6  --> 큐에 1~6까지 집어넣기
            queue.add(i);
        }

        /* 2. 카드 1장 남을때까지 큐의 맨 앞에있는 숫자 꺼내고 맨 앞으로 오는 숫자 꺼내서 큐의 맨 뒤로 옮기기 */
        while(queue.size() > 1) {    // 카드가 1장만 남을때까지
            queue.poll();            // 큐의 맨 앞에 있는 카드 꺼내기(꺼내서 버리는것임)
            queue.add(queue.poll()); // 그 다음으로 오는 맨 위의 카드 꺼내서 큐의 맨 뒤로 옮기기(추가하기)
        }

        /* 3. 마지막으로 남은 카드(숫자) 꺼내서 출력하기 */
        System.out.println(queue.poll());
    }
}