import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 자연수를 받아 자릿수별로 정렬하는 문제
        // 1. 숫자를 각 자릿수별로 나눈다.
        // -> 입력값을 String으로 받은 후 substring() 함수를 이용해 자릿수 단위로 분리,
        //    이것을 다시 int형으로 변경한 후 배열에 저장
        // 2. 그 후 배열을 선택 정렬 알고리즘 사용하여 내림차순으로 정렬하기
        // ex) 2143 입력 받음 -> 4321 순서로 내림차순 정렬하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[str.length()];

        for(int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(str.substring(i,i+1));
        }

        for (int i = 0; i < arr.length; i++) {
            int maxNumIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                // 기준 i 인덱스 기준으로 그 나머지 인덱스 배열의 값 중에서 가장 큰 최댓값을 찾는다.
                if(arr[j] > arr[maxNumIndex]) /* 내림차순이므로 최댓값을 찾는다. */
                    maxNumIndex = j; // 인덱스 i 외의 다른 인덱스들 중 가장 최댓값을 담고 있는 인덱스 j를 maxNumIndex 변수에 넣어준다.
            }
            /* 현재의 인덱스 i가 가리키는 배열 값과 maxNumIndex 인덱스가 가리키는 배열 값 중 arr[maxNumIndex] 값이 더 크면 swap 수행하기 */
            if (arr[i] < arr[maxNumIndex]) { // 최댓값이 담겨있는 인덱스 maxNumIndex 변수
                int temp = arr[i];
                arr[i] = arr[maxNumIndex];
                arr[maxNumIndex] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}