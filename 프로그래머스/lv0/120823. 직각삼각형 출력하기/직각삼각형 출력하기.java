import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // String의 repeat(반복횟수) 메서드
        // 반복횟수만큼 문자열을 반복해준다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i < n+1; i++){
            // String s = "*";
            // s = s.repeat(i);
            // System.out.println(s);
            System.out.println("*".repeat(i));
        }
        
        // for(int i = 1; i < n+1; i++){
        //     for(int j = 1; j < i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}