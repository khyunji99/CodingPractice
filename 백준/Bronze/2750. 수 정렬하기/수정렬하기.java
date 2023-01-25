import java.util.Scanner;

public class 수정렬하기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();      // (정렬할 수의 갯수) N 입력받기
        int[] numArr = new int[N]; // (정렬할 배열 선언) numArr 선언하기

        // 정렬할 배열 값 저장하기
        for(int i = 0; i < N; i++) {
            numArr[i] = sc.nextInt();
        }

        // 현재 numArr 배열의 값보다 1칸 오른쪽 배열의 값이 더 작으면 두 수 바꾸기
        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < N - 1 - i; j++) {
                // 상대적으로 왼쪽에 위치한 numArr[j]값이 오른쪽에 위치한 numArr[j+1]보다 값이 크면
                // 오른쪽으로 그 값을 이동시킨다. 즉, 더 큰 숫자가 오른쪽에 위치하게 만든다.
                if(numArr[j] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.println(numArr[i]);
        }

    }
}
