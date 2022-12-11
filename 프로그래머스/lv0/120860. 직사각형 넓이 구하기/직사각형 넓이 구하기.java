//import java.util.Math;
class Solution {
    public int solution(int[][] dots) {
        // int[][] dots = [[x1,y1],[x2,y2],[x3,y3],[x4,y4]];
        // 예를 들어 [x1,y1] 점을 기준점으로 잡았을때 x1과 같은 값인
        // x좌표를 가진 점을 찾아서 y값끼리 빼서 절대값구한다.
        // 그 다음 y1과 같은 값인 y좌표값을 찾고 그 점과의 x좌표끼리
        // 빼서 절댓값을 구한다.
        // 구한 두개의 절댓값을 곱하면 직사각형 넓이 구해진다.
        
        int vside = 0, rside = 0; // vside:세로 길이, rside:가로 길이
        int x = dots[0][0];
        int y = dots[0][1];
        
        for(int i = 1; i < dots.length; i++){ // dots[4][2] -> 4
                if(x == dots[i][0])
                    rside = Math.abs(y-dots[i][1]);
                if(y == dots[i][1])
                    vside = Math.abs(x-dots[i][0]);
        }
        
        return rside*vside;
    }
}