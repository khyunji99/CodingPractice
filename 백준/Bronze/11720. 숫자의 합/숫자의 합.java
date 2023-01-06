import java.util.Scanner;
public class P11720_숫자의합 {
    // N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {

        // 1. 입력받은 숫자를 문자열로 받는다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 숫자의 개수로 입력받는 변수
        String strNum = sc.next(); // 입력받는 것을 통째로 받는 변수
        // sc.next() : 스페이스 즉 공백 전까지 입력받은 문자열을 리턴한다.
        // sc.nextLine() : 엔터를 치기 전까지 쓴 문자열을 모두 리턴한다.
        // nextInt() 메서드 다음 nextLine() 메서드를 실행하려고 할 때
        // nextLine() 메서드가 그냥 넘어가버리는 오류가 생겨난다.
        // 그 이유는 nextInt() 메서드를 실행할 때 20을 콘솔에 입력하고 엔터를 누를때
        // 20을 리턴시켰지만 Enter값은 그대로 남아있다. nextLine() 메서드는 Enter값을 기준으로
        // 메서드를 종료시키기 때문에 nextLine() 메서드가 실행될 때 남아있는 Enter값을
        // 그대로 읽어서 바로 종료가 된 것이다. 그래서 첫번째 문자열입력:이 넘어가고
        // 두번째 정수입력:이 출력된 것이다.
        // 만약 정수를 입력하고 그 다음 문자를 입력하려고 할 때 next() 메서드를 사용해야 한다.
        // 아니면 위의 nextLine() 메서드를 한번 더 써줘서 Enter값을 없애줘야한다.
        int sumNum = 0;


        // 2. 문자열을 하나의 문자씩 잘라서 int 형으로 형변환 후 int 형 변수에 더해준다.
        for(int i = 0; i < strNum.length(); i++) {
            // i가 문자열의 마지막 인덱스(마지막 인덱스 값 = 문자열길이-1)일때 substring(i,i+1)을 하게되면 인덱스초과가 되므로
            // if 조건절로 마지막 인덱스인 경우, 그냥 substring(i)로 처리해서 잘라주자.
            if(i == strNum.length()-1){
                sumNum += Integer.parseInt(strNum.substring(i));
                break;
            }
            sumNum += Integer.parseInt(strNum.substring(i,i+1));
        }

        System.out.print(sumNum);



        // next~() : 특정 데이터 유형의 값을 읽기 위해 사용하는함수
        // nextLine() : 문자열, 한줄을 모두 읽기 위한 함수
        // next() : 단일 문자(char) 읽기 위한 함수


    }
}
