import java.util.ArrayList;
class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 2차원 배열 새로 만들기
        // int[][] numArr = new int[주어진 배열의 길이 / 주어진 수][주어진 수];
        // 이중 for문으로 돌리면서 이차원 배열에 넣어주자
        
        int[][] newNumArr = new int[num_list.length / n][n]; 
        int k = 0;
            for(int i = 0; i < num_list.length / n; i++){
                for(int j = 0; j < n; j++){
                    newNumArr[i][j] = num_list[k];
                    k++; // 배열이 하나씩 계속 증가된 값을 넣어줘야하니깐
                }        // 배열 인덱스 변수 하나 새로 만들어서 계속 증가시켜주자.
            }
        
        return newNumArr;
    }
}