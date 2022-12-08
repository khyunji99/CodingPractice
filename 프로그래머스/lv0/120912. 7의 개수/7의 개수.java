class Solution {
    public int solution(int[] array) {
        // 1. int[]배열 원소들인 숫자 String으로 변환해서 StringBuilder에 문자열 붙이기
        // 2. split() 메서드로 한글자씩 다 쪼개서 String[]배열에 넣기
        // 3. String[]배열 하나씩 돌면서 "7" 과 같은지 확인후 같으면 count++ 해주기
        // 4. count 개수 리턴
       
        StringBuilder sb = new StringBuilder();
        
         for(int num : array){
            sb.append(Integer.toString(num));
        }
        
        int count = 0;
        
        for(int i = 0; i < sb.length(); i++){
            if(sb.substring(i, i+1).equals("7"))
                count++;
        }
        
        
        return count;
    }
}