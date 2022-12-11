class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // board[가로크기(홀), 세로크기(홀)]
        // --> 오른쪽 왼쪽 갈 수 있는 길이 = 홀 / 2
        // answer[x좌표, y좌표]
        // left -> x좌표 -1
        // right -> x좌표 +1
        // up -> y좌표 +1
        // down -> y좌표 -1 // board = 9, 7 -> x, y 갈 수 있는 길이 = 9/2=4, 7/2=3
        
        int[] answer = new int[2];

        int x = 0, y = 0;
        int xLen = board[0] / 2, yLen = board[1] / 2;
        
        for(int i = 0; i < keyinput.length; i++){
            switch(keyinput[i]){
                case "left":
                    x = x > (-1)*xLen? x-=1 : x;
                    break;
                case "right":
                    x = x < xLen? x+=1 : x;
                    break;
                case "up":
                    y = y < yLen? y+=1 : y;
                    break;
                case "down":
                    y = y > (-1)*yLen? y-=1 : y;
                    break;
            }  
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}