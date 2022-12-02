class Solution {
    public int solution(String str1, String str2) {
        // indexOf()
        // 매개값으로 주어진 문자열이 시작되는 인덱스 리턴
        // 주어진 문자열 포함되어 있지 않으면 -1리턴
        int index = 0;
        index = str1.indexOf(str2);
        if(index == -1){
            return 2;
        }
        return 1;
    }
}