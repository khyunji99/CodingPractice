import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        // 1. n을 0부터 n까지 반복해서 나눈 후 나머지가 0인 애들은 n의 약수임
        // 2. 그 애들을 int배열에 하나씩 넣기
        // 3. 작은애들부터 나누면서 확인하기 때문에 따로 배열정리 안해도 될것이다..
        // 배열의 크기를 알 수 없으니 ArrayList로 Integer배열 만들자
        // Collextions.sort(list) : ArrayList 정렬
        
        List<Integer> arrList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        for(i = 1; i <= n; i++){
            if(n % i == 0){
                arrList.add(j, i);
                j++;
            }
        }
        
        int[] arr = new int[arrList.size()];
        for(i = 0; i < arrList.size(); i++){
            arr[i] = arrList.get(i);
        }
        
        Arrays.sort(arr);
        // Collections.sort(arrList); -> ArrayList 오름차순으로 정렬하는 메서드
        
        return arr;
    }
}