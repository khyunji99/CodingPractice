class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;
        int i = 0;
        int j = 0;
        for (int n = 0; n < queries.length; n++) {
            i = queries[n][0];
            j = queries[n][1];
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}