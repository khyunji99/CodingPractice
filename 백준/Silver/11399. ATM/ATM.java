import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 사람 : 1번 ~ N번,  Pi : i번째 사람이 돈을 인출하는데 걸리는 시간
        // 줄을 서는 순서에 따라 돈 인출하는데 필요한 시간의 합 달라짐
        // 줄을 서 있는 사람의 수 N과 각 사람이 돈을 인출하는 데 걸리는 시간 Pi가 주어졌을 때,
        // 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 구하는 프로그램 작성하라.
        // 예제 입력 => 사람 수 N = 5 / P1 = 3, P2 = 1, P3 = 4, P4 = 3, P5 = 2
        // P1 은 1번째 사람이 돈을 인출하는데 걸리는 시간
        // 각 사람이 돈을 인출하는데 필요한 시간의 총 합이 최솟값이 되려면
        // 맨 앞의 사람은 가장 적은 시간이 걸리는 사람이 오고 그 뒤로는 그 다음으로 적은 시간이 걸리는 사람이
        // 와야 각 사람의 필요한 시간을 구했을 때 시간이 덜 걸린다.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] tArr = new int[N]; // 자릿수별로 구분해 저장한 배열
        int[] sArr = new int[N]; // 각 사람이 인출을 완료하는 데 필요한 시간을 저장하는 tArr 합 배열

        for (int i = 0; i < N; i++) {
            tArr[i] = sc.nextInt();
        }

        /* 현재 범위에서 삽입 위치 찾기 */
        for (int i = 1; i < N; i++) {
            int insert_point = i;
            int insert_value = tArr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (tArr[i] > tArr[j]) {
                    insert_point = j + 1;
                    break;
                }
                if (j == 0)
                    insert_point = 0;

            }
            /* 삽입을 위해 삽입 위치에서 i까지 데이터를 한칸씩 뒤로 밀기 */
            for (int j = i; j > insert_point; j--) {
                tArr[j] = tArr[j - 1];
            }
            /* 삽입 위치에 현재 데이터 삽입하기 */
            tArr[insert_point] = insert_value;

        }

        /* tArr 배열을 통한 합 배열 sArr 만들기 */
        sArr[0] = tArr[0];
        for (int i = 1; i < tArr.length; i++)
            sArr[i] = sArr[i - 1] + tArr[i];

        /* 합배열 sArr 데이터 값 모두 합해서 결과 출력하기 */
        int sum = 0;
        for (int i = 0; i < N; i++)
            sum += sArr[i];

        System.out.print(sum);

    }
}