import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력받은 값 N
        int sum = 1; // 현재 연속된 합 담는 변수 sum
        int count = 1; // 가짓수 담는 변수 count
        // (1부터 시작하는 이유 : 예를 들어 15가 연속된 자연수들의 합을 나타내는 방법에는 15, 7+8, .. 이렇게 있다.
        //  여기서 자기 자신으로 나타내는 방법(15)도 포함이기 때문에 가짓수가 무조건 한가지는 있는 것이다.)
        int start = 1; // 연속된 자연수의 합의 범위 시작점이 되는 변수 start
        int end = 1; // 연속된 자연수의 합의 범위 끝점이 되는 변수 end

        while(end != N) { // end_index 가 배열 끝 인덱스 되기 전까지 반복한다.
            // 1) sum == N 인 경우
            if(sum == N) {
                count++;
                end++;
                sum += end;
            }
            // 2) sum > N 인 경우
            else if(sum > N) {
                sum -= start;
                start++;
            }
            // 3) sum < N 인 경우
            else {
                end++;
                sum += end;
            }
        }

        System.out.print(count);
    }
}
