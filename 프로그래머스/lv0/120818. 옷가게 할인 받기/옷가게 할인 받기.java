class Solution {
    public int solution(int price) {
        // 10만원 이상 -> 5% 할인
        // 30만원 이상 -> 10%할인
        // 50만원 이상 -> 20%할인
        if(price >= 500000){
            return (int)(price*0.8);
        }else if(price >= 300000){
            return (int)(price*0.9);
        }else if(price >= 100000){
            return (int)(price*0.95);
        }else{
            return price;
        }
    }
}