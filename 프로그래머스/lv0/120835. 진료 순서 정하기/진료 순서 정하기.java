import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        // 1. emergency배열에서 가장 큰 값max을 찾는다. Collections.max();
        // 2. 배열을 돌면서 max와 같은 값을 찾아서 인덱스를 찾는다.
        // 3. 새로운 sequence배열에 그 인덱스를 넣고 거기에 숫자 1을 넣는다.
        // 4. 이거 반복함,, 
        
        int[] sequence = new int[emergency.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : emergency){
            list.add(num);
        }
        Collections.sort(list,Collections.reverseOrder());
        // list 내림차순으로 정렬
        // list = [100, 30, 23, 10, 6]
        
        for(int i = 0; i < sequence.length; i++){
            sequence[i] = list.indexOf(emergency[i])+1;
            // 배열은 0부터 시작하는데 순위는 1부터 시작하므로 +1을 해줘야함
        }
        // indexOf("찾을 특정 문자", "시작할 위치")
        // 시작할 위치 생략 시 0번째부터 찾는다.
        // list에서 emergency배열의 i번쨰 정수의 인덱스 값을 넣음
        // emergency = [ 30, 10, 23, 6, 100]
        // sequence = [1+1, 3+1, 2+1, 4+1, 0+1]
            
        return sequence;
    }
}