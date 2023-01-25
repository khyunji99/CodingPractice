package src;

import java.util.Scanner;

public class EX2_Recursive_Function {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));

    }

    // 1 <= n <= 13
    // (n이 13을 초과할 수 없는 이유 : return 되는 값은 int 값으로
    // n 이 13을 초과하는 값이 되면 return 되는 값이 int 값의 범위를
    // 초과하게 되어 int 값으로 표현되기엔 오류가 발생할 수 있게 되기 때문이다.)
    static int fac(int n) {
        if(n <= 1)
            return 1;
        else
            return n * fac(n-1);

    }
}
