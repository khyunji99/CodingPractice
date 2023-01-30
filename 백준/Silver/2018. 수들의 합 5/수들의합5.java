import java.util.Scanner;

public class 수들의합5 {
    public static void main(String[] args){
        // 투포인터 사용하기
        // 시작 인덱스와 종료 인덱스를 지정하여 연속된 수를 표현한다.
        // 연속된 수의 합 담는 변수 : sum
        // 연속된 자연수의 합 나타내는 가짓수 담는 변수 : count
        // 연속된 수의 합의 범위를 지정할 두개의 포인터 변수 : start, end
        // 연속된 수의 합 범위의 시작점 : start
        // 연속된 수의 합 범위의 끝점 : end

        // 1. start, end 는 먼저 숫자 1에서부터 시작한다.
        // 2. end 가 end++ 되면서 sum 변수에 더해진다.
        // 3. 이때 sum 값이 N 값 보다 작으면 end ++ 증가하고 sum = sum + end; 로 변경된다.
        //    (end 계속 ++ 시키면서 sum == N 이 될때까지 반복한다.)
        // 4. 또는 sum 값이 N 값 보다 크면 sum = sum - start 로 변경되고 start ++ 증가한다.
        //    (sum 값이 N 보다 크면 그 연속된 자연수의 범위는 더이상 볼 필요가 없어진다.)
        //    (따라서 start 를 ++ 증가시킴으로 새로운 범위의 시작점을 변경시켜 새로운 범위를 만든다.)
        // 5. 아니면 sum 값이 N 값과 같다면 count++ 해주고 end++ 해준다.
        // 6. 이렇게 end 가 N-1 까지 도달하게 될때까지 반복한다.
        //    (N 까지 가지 않는 이유는 N을 연속된 자연수의 합으로 표현하는 방법 중 하나가 N 자기자신이기 때문)
        //    (모든 자연수는 일단 본인 자기자신만으로 연속된 합을 표현할 수 있어서 가짓수는 1부터 시작한다.)


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력받은 값 N
        int sum = 1; // 현재 연속된 합 담는 변수 sum (숫자 1부터 시작하므로 1로 초기화 해줘야함. 0으로 초기화하면 틀림..)
        int count = 1; // 가짓수 담는 변수 count
        // (1부터 시작하는 이유 : 예를 들어 15가 연속된 자연수들의 합을 나타내는 방법에는 15, 7+8, .. 이렇게 있다.
        //  여기서 자기 자신으로 나타내는 방법(15)도 포함이기 때문에 가짓수가 무조건 한가지는 있는 것이다.)
        int start = 1; // 연속된 자연수의 합의 범위 시작점이 되는 변수 start
        int end = 1; // 연속된 자연수의 합의 범위 끝점이 되는 변수 end

        while (end != N) { // end_index 가 배열 끝 인덱스 되기 전까지 반복한다.
            // 1) sum == N 인 경우
            if (sum == N) {
                count++;
                end++;
                sum += end;
            }
            // 2) sum > N 인 경우
            else if (sum > N) {
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
