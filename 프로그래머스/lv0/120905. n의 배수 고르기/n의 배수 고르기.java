import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        // 1. ArrayList 생성해서 int[] numlist 요소들 넣기
        // 2. ArrayList 요소들 n의 배수인지 아닌지 확인하기
        // 3. n의 배수 아닌 요소의 인덱스값 얻어서 삭제하기
        // 4. 삭제될거 다 삭제된 ArrayList 리턴..
        ArrayList<Integer> list = new ArrayList<Integer>(numlist.length);
        for(int i : numlist){
            if(i % n == 0){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}