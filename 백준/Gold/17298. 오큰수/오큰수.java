import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());  // N : 수열의 갯수 (수열 배열의 크기가된다.)
        int[] seArr = new int[N];  // seArr : 수열의 배열 생성
        int[] answer = new int[N]; // answer : 정답 배열 생성(최종 정답)

        String[] nArr = bf.readLine().split(" ");  // 입력받는 수열 값들 String 배열에 저장
        // (bf.readLine().split(); 은 String[] 을 리턴하기때문에 int[] 배열이 아닌 String[] 배열에 넣어준다.)

        /* 입력 받은 수열 값들 수열 배열 seArr(int[]) 에 저장하기 */
        for(int i = 0; i < N; i++) {
            seArr[i] = Integer.parseInt(nArr[i]);
        }

        /* 스택 만들기 */
        Stack<Integer> stack = new Stack<>();

        /* 스택 초기화 해주기(이때, 수열의 값을 넣는 것이 아니라 인덱스를 넣는 것이다.) */
        stack.push(0); // 스택을 만들고 날땐 항상 비어있으므로 최초 값인 인덱스 0을 push 해서 스택에 넣어준다.

        /* 문제 푸는 반복문 */
        for(int i = 1; i < N; i++) {
            /* 스택이 비어있지 않고 들어오려는 수열의 값이 스택 top 인덱스가 가리키는 수열 값보다 클 경우에만 반복 */
            while(!stack.isEmpty() && seArr[stack.peek()] < seArr[i]) { // stack.peek() : 스택의 top 위치에 있는 인덱스 값 확인
                // 넣으려는 인덱스 i가 가리키는 수열 값 seArr[i] 가
                // 스택 top 위치에 있는 인덱스(stack.peek())가 가리키는 수열 값 seArr[stack.peek()] 보다 크면
                // seArr[i]는 seArr[stack.peek()] 의 오큰수가 되므로 seArr[i] 오큰수 값을 정답배열 answer[stack.peek()]에 넣어준다.
                // 이때 stack.peek() 인덱스값이 가리키는 수열 값에 대한 오큰수는 찾았으므로 그 인덱스는 스택에서 빼줘야한다.
                // 그래서 이때 정답배열에 넣어줄때 peek() 이 아닌 pop() 을 사용하여 아예 스택에서 빼버리는 것이다.
                /* 정답 배열에 오큰수를 현재 수열로 저장하기 */
                answer[stack.pop()] = seArr[i];
            }
            /* 새로운 인덱스 i 스택에 추가 */
            stack.push(i);
        }
        /* 반복문 다 돌고 나왔는데 스택이 비어있지 않다면 스택에 있는 인덱스가 가리키는 수열 값은 오큰수를 가지지 못한다. */
        // 오큰수를 가지지 못하므로 스택 안에 남아있는 인덱스에 해당하는 정답배열 answer 에 -1 값을 넣어준다.
        while(!stack.empty()) {
            answer[stack.pop()] = -1;
        }

        /* 정답 배열 BufferedWriter 사용해서 출력하기 */
        // BufferedWriter 사용하는 이유 : 배열의 크기가 극한으로 엄청 클 때 그냥 배열을 돌면서 값 출력하는 시간이 조금 오래 걸리기 때문에
        //                              효율적인 BufferedWriter 을 사용하여 값을 출력하는 것이다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++) {
            bw.write(answer[i] + " ");
        }

        bw.flush(); // 남아있는 데이터를 모두 출력시킴
        /* flush() 를 안해주면 버퍼에만 데이터가 존재하고 파일에서는 출력이 안될 수 있다. */
        bw.close(); // 스트림 닫음

    }
}