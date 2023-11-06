class Solution {
    public int solution(int[] num_list) {
        // 원소들의 합^2 > 원소들의 곱 ? 1 : 0
            int sum=0;
            int multi = 1;
            for(int i = 0; i < num_list.length; i++) {
                sum += num_list[i];
                multi *= num_list[i];
            }
            return Math.pow(sum, 2) > multi ? 1 : 0;
    }
}