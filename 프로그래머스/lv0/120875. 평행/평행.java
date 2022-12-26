class Solution {
    public int solution(int[][] dots) {
        // 두 직선이 평행하는 경우
        // -> 기울기가 같고, y절편이 다르면 평행하다.
        // -> 기울기가 같고, y절편이 같으면 일치한다.
        // 즉! 기울기가 같은지만 확인하면 된다.
        // 기울기 m : (y1 - y2) / (x1 - x2)
        // [1,4],[3,8]을 지나는 직선의 기울기 m1
        // --> m1 : (1-3)/(4-8) = 1/2 = 0.5
        // [9,2],[11,6]을 지나는 직선의 기울기 m2
        // --> m2 : (9-11)/(2-6) = 1/2 = 0.5
        // 직선 l1과 l2는 서로 기울기는 0.5로 같지만 y절편이 다르므로 평행하다.
        
        // 비교할 수 있는 경우의수 3가지
        // (1) dots[0][i],dots[1][i] 직선과 dots[2][i],dots[3][i] 직선 비교
        // (2) dots[0][i],dots[2][i] 직선과 dots[1][i],dots[3][i] 직선 비교
        // (3) dots[0][i],dots[3][i] 직선과 dots[1][i],dots[2][i] 직선 비교
        double m1 = 0.0, m2 = 0.0; // 기울기 m1과 m2 = (y끼리의 차) / (x끼리의 차)
        
        m1 = (double)(dots[0][1]-dots[1][1]) / (double)(dots[0][0]-dots[1][0]);
        m2 = (double)(dots[2][1]-dots[3][1]) / (double)(dots[2][0]-dots[3][0]);
        System.out.println("m1 : " + m1 + ", m2 : " + m2);
        if( m1 == m2 ) // (1) 인 상황, 기울기가 같은 경우 -> 평행 또는 일치
            return 1;
        else{ // 기울기가 같지 않는 경우 -> (2) 상황으로 바꿔준다.
            m1 = (double)(dots[0][1]-dots[2][1]) / (double)(dots[0][0]-dots[2][0]);
            m2 = (double)(dots[1][1]-dots[3][1]) / (double)(dots[1][0]-dots[3][0]);
        }
        
        System.out.println("m1 : " + m1 + ", m2 : " + m2);
        
        if(m1 == m2) // (2)인 상황, 기울기가 같은 경우
            return 1;
        else{ // 기울기 같지 않는 상황 -> 마지막 (3) 상황으로 바꿔준다.
            m1 = (double)(dots[0][1]-dots[3][1]) / (double)(dots[0][0]-dots[3][0]);
            m2 = (double)(dots[1][1]-dots[2][1]) / (double)(dots[1][0]-dots[2][0]);
        }
        
        System.out.println("m1 : " + m1 + ", m2 : " + m2);
        
        if(m1 == m2)
            return 1;
        else
            return 0;
        
    }
}