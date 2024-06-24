class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;
        int i = 0;
        int j = 0;
        for (int[] query : queries) {
            i = query[0];
            j = query[1];
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}