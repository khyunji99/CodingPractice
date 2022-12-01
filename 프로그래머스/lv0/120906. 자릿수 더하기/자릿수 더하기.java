class Solution {
    public int solution(int n) {
        // int -> String(숫자를 문자열로)
        // Integer.toString();
        // int배열에 String 문자 하나하나 넣기
        // int배열의 요소들 다 더하기
        String number = Integer.toString(n);
        int[] arr = new int[number.length()];
        int sum = 0;
        for(int i = 0; i<number.length(); i++){
            arr[i] = number.charAt(i) - '0';
            sum += arr[i];
        }
        
        return sum;
    }
}