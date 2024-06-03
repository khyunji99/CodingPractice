class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        int abInt = Integer.parseInt(ab);
        int baInt = Integer.parseInt(ba);

        return abInt > baInt ? abInt : baInt;
    }
}