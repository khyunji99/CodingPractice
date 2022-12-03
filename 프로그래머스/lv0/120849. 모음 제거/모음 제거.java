class Solution {
    public String solution(String my_string) {
        // String.relaceAll("[{바꾸고싶은 문자의 정규식}]","{치환할 문자}")
        // 주어진 정규식과 일치하는 문자열의 각 부분 문자열을
        // 바꾸는 솔루현
        my_string = my_string.replaceAll("a", "");
        my_string = my_string.replaceAll("e", "");
        my_string = my_string.replaceAll("i", "");
        my_string = my_string.replaceAll("o", "");
        my_string = my_string.replaceAll("u", "");
        return my_string;
    }
}