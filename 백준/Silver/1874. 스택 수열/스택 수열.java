import java.util.Scanner;
import java.util.Stack;

/* stack 클래스 및 생성자 구성하기 */

public class P1874_스 {

    public static void main(String[] args) {
        // 자연수들을 스택에 넣어 주어지는 수열대로 뽑을 수 있는지 알아보고
        // 오름차순 수열을 만들기 위한 연산 순서를 pop()은 - 로, push() +로 표현하여 출력하라.
        // 수열대로 뽑을 수 없다면 NO를 출력하라.
        // (스택에 값을 넣을 때 오름차순으로만 넣어야한다.)

        /* 문제 푸는 방식
         * 1부터 자연수를 증가시키면서 입력으로 주어진 수열들의 숫자와 비교하여
         * 증가시킨 자연수를 스택에 추가하거나 빼는 방식으로 푼다.
         *
         * 1) 현재 수열 값 >= 자연수 값
         * - 현재 수열 값이 자연수 값보다 크거나 같을 때까지 자연수를 1씩 증가시키며
         *   자연수를 스택에 PUSH 한다. 그렇게 PUSH 가 끝나면 스택의 맨 위에 있는 값은
         *   우리가 구하려는 수열의 값과 같은 값이므로 그 값을 뽑기 위해 1번만 POP 을 한다.
         *   EX) 현재 수열의 값이 4일 때,
         *       1,2,3,4를 스택에 PUSH 하고 마지막 스택 맨 위에 있는 값 4를 빼기 위해
         *       1회만 POP 을 하여 4를 출력하고 조건문을 빠져나온다. 그러고 자연수는 5가 된다.
         *
         * 2) 현재 수열 값 < 자연수
         * - 현재 수열 값보다 자연수 값이 크다면 POP 으로 스택에 있는 값을 꺼낸다.
         *   꺼낸 값이 현재 수열 값이거나 아닐 수 있다.
         *   만약 꺼낸 값이 현재 수열 값이 아니라면 후입선출 원리에 따라 수열을 표현할 수 없다.
         *   즉, 이미 현재 수열 값보다 꺼낸 값이 크다면 우리가 원하는 수열의 값은 스택 아래에 넣어져 있다는 것인데
         *   스택은 맨 나중에 넣은 값부터 뺄 수 있기 때문에 수열을 표현할 수가 없다. 그러므로 NO 를 출력한 후
         *   문제를 종료한다.
         *   또는 꺼낸 값이 현재 수열 값이라면 그대로 조건문을 빠져나오면 된다.
         *   EX) 앞의 예제를 이어서 보자면 수열 값 4 다음인 수열 값은 3이고 자연수는 5가 된다.
         *       우리가 원하는 수열의 값 3이 스택 맨 위에 위치하고 있으므로 스택에서 3 을 꺼낸다.
         *       현재 수열값과 스택에서 꺼낸 값이 같으므로 계속해서 스택 연산을 수행할 수 있다.
         *       (스택에 남아있는 자연수 1, 2 / 스택에 넣을 자연수 5)
         *  */


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 수열의 개수 N 변수에 입력 받기
        int[] sequence = new int[N]; // 수열 값 저장할 배열 선언

        for (int i = 0; i < N; i++) { // 수열 배열 sequence 에 수열 값 저장하기
            sequence[i] = sc.nextInt();
        }


        Stack<Integer> stack = new Stack<>(); // 스택클래스로 객체 생성

        StringBuffer bf = new StringBuffer();
        // pop 하게되면 - 붙이고, push 하게 + 붙여주고 최종적으로 출력할 아이

        int num = 1; // 오름차순 자연수
        boolean result = true;

        for(int i = 0; i < sequence.length; i++){
            int sNum = sequence[i]; // sNum : 현재 수열의 수
            // 1. 현재 수열 값 >= 자연수 값
            if(sNum >= num) {
                // --> 현재 수열 값과 자연수 값이 같아질 때까지 스택에 push() 해주기
                while(sNum >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            // 2. 현재 수열 값 < 오른차순 자연수 : pop() 수행해서 수열 원소 꺼냄
            else {
                int top = stack.pop();
                // 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 더 출력하더라도 수열을 만들 수 없다.
                if(top > sNum) {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    bf.append("-\n");
                }
            }
        }
        if(result)
            System.out.println(bf.toString());

    }
}
