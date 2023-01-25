import java.util.Arrays;
import java.util.Scanner;

public class P1940_주몽 {
    public static void main(String[] args) {
        // 갑옷은 2개의 재료로 만들어진다. 2가지 재료의 고유번호를 합쳐서 M이 되면 갑옷이 만들어진다.
        // N개의 재료와 M이 주어질 때 몇개의 갑옷을 만들 수 있는가
        // [ 예제 입력 ]
        // 6 : 재료의 개수(N)
        // 9 : 갑옷이 완성되는 번호의 합(standard point : sp)
        // 2 7 4 1 5 3 : 재료들

        // 1. 입력되는 재료들 값을 arr[N] 에 저장하여 오름차순으로 정렬한다.
        // 2. 투포인터 i, j 를 배열의 양쪽 끝에 위치하고 i는 증가시키고 j는 감소시키면서 다음과 같이 포인터들을 이동시킨다.
        //    이때 j는 i보다 커야한다. (i < j)
        // 1) arr[i] + arr[j] > sp 인 경우 --> j--;
        //  : 번호의 합이 충족해야하는 합인 sp 보다 크므로 큰 값을 가리키고 있는 j 인덱스를 내린다.
        // 2) arr[i] + arr[j] < sp 인 경우 --> i++;
        //  : 번호의 합이 충족해야하는 합인 sp 보다 작으므로 작은 값을 가리키고 있는 i 인덱스를 올린다.
        // 3) arr[i] + arr[j] == sp 인 경우 --> i++, j--, count++;
        //  : 충족해야하는 합인 sp 값과 같으면 두개의 포인터 i, j 를 모두 이동시키고 count 를 증가시킨다.
        // 3. i와 j가 만나기 전까지 2번 단계를 반복하고 i와 j가 만나게되면 반복문이 끝나고 count 값을 출력시킨다.


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sp = sc.nextInt();
        int[] arr = new int[N];
        arr[0] = sc.nextInt();

        for(int i = 1; i < N; i++){ // 입력받는 재료값들 배열에 저장하기
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 배열 정렬하기
        int count = 0; // 갑옷이 완성되는 번호의 합 sp 에 충족하는 경우의 수 담는 count 변수
        int i = 0; // 배열의 처음에서 시작해서 한칸씩 뒤로 움직일 포인터 i
        int j = N-1; // 배열의 마지막에서 시작해서 한칸씩 앞으로 움직일 포인터 j

        while(i < j) {
            // 1) arr[i] + arr[j] > sp 인 경우
            if(arr[i] + arr[j] > sp)
                j--;
            // 2) arr[i] + arr[j] < sp 인 경우
            else if(arr[i] + arr[j] < sp)
                i++;
            // 3) arr[i] + arr[j] == sp 인 경우
            else {
                count++;
                i++;
                j--;
            }
        }

        System.out.print(count);

    }
}
