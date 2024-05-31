class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int l1 = my_string.length();
        int l2 = overwrite_string.length();
        return my_string.substring(0, s) + overwrite_string + my_string.substring(l2+s, l1);
    }
}