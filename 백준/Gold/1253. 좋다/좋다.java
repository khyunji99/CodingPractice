import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_좋은수 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // 주어진 N개의 수에서 다른 수의 합으로 표현되는 수가 있다면 그 수를 '좋은수' 라고 한다.
        // N개의 수중 좋은 수가 총 몇개인지 출력하라.

        // 주어진 수들 중 1과 2를 더해서 3을 나타낼 수 있으므로 3 은 좋은 수가 된다.
        // 또한 1과 4를 가지고 5를 나타낼 수 있으므로 5는 좋은 수가 된다.
        // 이렇게 좋은 수의 개수가 몇개인지 찾는 문제이다.
        // 하지만 이때, 5를 나타낼 수 있는게 1 + 4 와 2 + 3 이 되는데
        // 5를 표현하는 경우의 수를 찾는 것이 아니라 1+4 가 되었든 2+3이 되었든
        // 어떤 두 수를 더해서 5가 되어서 5가 좋은수라는 것을 그래서 이러한 좋은수가 몇개가 되는지를 찾는 것이다.

        // ex) 입력 : 10 (주어지는 숫자의 개수), 1, 2, 3, 4, 5, 6, 7, 8, 9, 10  // 출력 : 8
        // 1 + 2 = 3  --> 좋은수 : 3
        // 1 + 3 = 4  --> 좋은수 : 4
        // 1 + 4 = 5  --> 좋은수 : 5
        // 1 + 5 = 6  --> 좋은수 : 6
        // 1 + 6 = 7  --> 좋은수 : 7
        // 1 + 7 = 8  --> 좋은수 : 8
        // 1 + 8 = 9  --> 좋은수 : 9
        // 1 + 9 = 10  --> 좋은수 : 10

        // 정렬, 투 포인터 알고리즘 사용하면 시간 복잡도 최소가 된다.
        // 이때, 정렬된 데이터에서 자기 자신을 좋은 수 만들기에 포함하면 안된다 --> 이 점을 예외로 처리해야 한다는 것을 염두에 두고 문제를 풀자.

        // 예시 ) 주어진 수 : 8, 5, 11, 14, 3
        // 3 + 5 = 8
        // 3 + 8 = 11
        // 3 + 11 = 14
        // 좋은수가 8, 11, 14 총 3개이므로 답은 3이 된다.

        // 변수 : i,j (인덱스 가리키는 포인터) , sum (우리가 찾고자 하는 숫자 즉, i와 j가 가리키는 숫자를 더했을 때 sum 값이 되면 sum 은 좋은수가 된다.)
        //       count (좋은수 갯수)
        // 1. 주어지는 숫자들을 int[] numArr 배열에 넣는다.
        // 2. numArr 배열을 오름차순 정렬한다.
        // 3. i,j 두개의 포인터 i는 배열의 맨 앞, j는 맨 뒤에 위치시키고 sum 변수는 배열의 맨 처음부터 시작한다.
        //    (i는 배열의 맨 앞쪽에 있으므로 작은 숫자를, j는 맨 뒤쪽이므로 큰 숫자를 가리킨다.)
        // 4. i, j 가 numArr 배열을 순회하면서 i,j 가 가리키는 숫자의 합이 sum 이 가리키는 숫자가 되는지 찾는다.
        // 5. 이때, 다음과 같은 경우에 따라서 i,j 가 이동한다.
        //   1) numArr[i]+numArr[j] > sum 인 경우,
        //   --> j-- (찾고자하는 값 sum 보다 더한 값이 더 크므로 더해야하는 숫자를 작게 만들어야한다. 그러니 큰 숫자를 가리키고 있는 j 인덱스 -1 해주기)
        //   2) numArr[i]+numArr[j] < sum 인 경우,
        //   --> i++ (찾고자하는 값 sum 보다 더한 값이 더 작으므로 더해야하는 숫자를 크게 만들어야한다. 그러니 작은 숫자를 가리키고 있는 i 인덱스 +1 해주기)
        //   3) numArr[i]+numArr[j] == sum 인 경우,
        //   --> i++, j--, count++, 반복문 빠져나가기

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int count = 0;
        long[] numArr = new long[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            numArr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(numArr);

        for (int k = 0; k < N; k++) {
            long sum = numArr[k];
            int i = 0;
            int j = N - 1;

            // 투 포인터 알고리즘
            while(i < j) {
                if (numArr[i] + numArr[j] == sum)
                { // sum 은 서로 다른 두 수의 합이어야 함을 체크
                    if (i != k && j != k) {
                        count++;
                        break;
                    }
                    else if (i == k)
                        i++;
                    else if (j == k)
                        j--;
                }
                else if (numArr[i] + numArr[j] < sum)
                    i++;
                else
                    j--;
            }
        }


        System.out.print(count);
        bf.close();

    }
}
