class Solution {
    public int[] solution(int money) {
        // 1. 배열 만들기 [커피잔수, 남는 돈]
        // 2. 커피잔수 (coffeeNum) = money / 5500
        // 3. 남는 돈 (change) = money - (coffeeNum * 5500)
        int coffeeNum = money / 5500;
        int change = money - (coffeeNum * 5500);
        int[] answer = new int[2];
        answer[0] = coffeeNum;
        answer[1] = change;
        
        return answer;
    }
}