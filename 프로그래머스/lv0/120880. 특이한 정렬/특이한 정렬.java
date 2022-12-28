import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        int[] answer = new int[numlist.length];
        List<Integer> numList = new ArrayList<Integer>();
        // numlist 배열 복사할 용도인 arrayList;
        List<Integer> list = new ArrayList<Integer>();
        // 정렬해서 넣어줄 ArrayList
        
        // 1. 주어진 배열 numlist 원소값들에서 n을 뺀 값을 numList배열에 넣어준다.
        //    이때 뺀 값이 0보다 작은 수 즉 음수이면 Math.abs() 함수를 사용하여 절댓값으로 해서 양수로 만들어서 넣어주자.
        int num = 0;
        for(int i = 0; i < numlist.length; i++){
            num = numlist[i] - n;
            if(num < 0)
                num = Math.abs(num);
            numList.add(num);
        }
        
        
        // 2. list배열에 numList 배열을 복사해서 numList를 오름차순 정렬하자.
        for(int nb : numList){
            list.add(nb);
        }
        
        Collections.sort(list);
        
        // 3. 정렬된 값 들어있는 list원소들을 하나씩 꺼내서 확인하면서 numList배열을 돌면서 값이 같은게 있는지 확인하면서
        // 값이 같은것의 인덱스를 가져와 그 인덱스에 있는 numlist의 값을
        // answer 배열에 차례대로 넣어준다.
       // [600,400,300,200,700,800,100,900] = numlist / n = 500
        // [100,100,200,300,200,300,400,400] = numList
        // [100,100,200,200,300,300,400,400] = list
        // [600, 400, ] = answer
        // i = 2, j = 0, 
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < numList.size(); j++){
                if(list.get(i).equals(numList.get(j))){
                    if(i > 0 && answer[i - 1] == numlist[j])
                        continue;
                    if(answer[i] > numlist[j]) continue;
                    answer[i] = numlist[j];
                    System.out.println(numlist[j]);
                }
            }
        }
        
        /*
        이 부분에서 Integer 타입을 == 연산자로 비교하고 있는데, Integer는 참조 타입입니다.
        참조 타입을 == 로 비교한다는 것은 참조 변수의 실제 값을 비교하는 것이 아니라
        참조 변수에 저장된 실제 데이터의 주소 값을 비교하게 됩니다.
        그래서 같은 값을 가진 Integer 변수를 비교해도 false가 나올 수 있습니다.*/
        
        
        return answer;
    }
}