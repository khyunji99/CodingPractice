class Solution {
    public String solution(int age) {
        // a b c d e f g h i j
        // 0 1 2 3 4 5 6 7 8 9
        // ba bb bc bd ... bj
        // 10 11 12 13 ... 19
        // 1. 주어지는 나이 숫자를 문자열로 만든다.
        // 2. 문자열을 문자열 배열에 하나씩 쪼개서 넣는다.
        // 3. 배열 인덱스의 원소 하나씩 확인하면서 숫자에 따른 알파벳을 StringBuilder에붙여준다.
        StringBuilder sb = new StringBuilder();
        String strAge = String.valueOf(age);
        
        String[] ageArr = new String[strAge.length()];
        
        for(int i = 0; i < ageArr.length; i++){
            String flag = strAge.substring(i, i+1);
            switch(flag){
                case "0":
                    sb.append("a");
                    break;
                case "1":
                    sb.append("b");
                    break;
                case "2":
                    sb.append("c");
                    break;
                case "3":
                    sb.append("d");
                    break;
                case "4":
                    sb.append("e");
                    break;
                case "5":
                    sb.append("f");
                    break;
                case "6":
                    sb.append("g");
                    break;
                case "7":
                    sb.append("h");
                    break;
                case "8":
                    sb.append("i");
                    break;
                case "9":
                    sb.append("j");
                    break;
            }
        }
        
        return sb.toString();
    }
}