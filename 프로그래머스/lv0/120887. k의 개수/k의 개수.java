class Solution {
    public int solution(int i, int j, int k) {
        // 1. 주어진 k숫자 문자열로 변환하고 i부터 j까지의 숫자도 문자열로 변환후 각각 String[]배열에 넣기
        // String.valueOf(숫자) 사용하면 숫자 문자열로 변환 가능
        // 2. 문자열배열의 원소들 하나하나 주어지는 k숫자 문자열과 같은지 확인하고 같으면 count++
        // String str = "34"
        // str.contains("2") -> false 리턴
        // contains메서드 사용하면 해당 문자열을 포함하고 있는 boolean형으로 리턴
        int count = 0;
        for(int n = i; n <= j; n++){
            String s = String.valueOf(n);
            String[] stArr = s.split("");
            
            for(int x = 0; x < stArr.length; x++){
                if(stArr[x].equals(String.valueOf(k)))
                    count++;
            }   
        }
        
        return count;
    }
}
/*
int answer = 0;

        for (int num = i; num <= j; num++){
            int tmp = num;
            while (tmp != 0){
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }
        }
        return answer;
*/