class Solution {
    public int solution(int order) {
        // 1. 주어지는 숫자 하나씩 문자열 배열에 넣기
        // 2. 배열 원소 하나씩 꺼내면서 문자 3, 6, 9 중 하나인지 확인하기
        // 3. 맞으면 count++ 해주기
        
        int count = 0;
        String[] strArr = String.valueOf(order).split("");
        
        for(String num : strArr){
            if(num.equals("3") || num.equals("6") || num.equals("9"))
                count++;
        }
        
        
        return count;
    }
}