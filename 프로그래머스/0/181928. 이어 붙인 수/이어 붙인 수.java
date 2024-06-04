class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) even.append(num_list[i]);
            else odd.append(num_list[i]);
        }
        return Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
    }
}