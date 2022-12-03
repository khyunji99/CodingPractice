class Solution {
    public String solution(String rsp) {
        // 가위 2, 바위 0, 보 5
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rsp.length(); i++){
            switch(rsp.substring(i, i+1)){
                case "0":
                    sb.append("5");
                    break;
                case "2":
                    sb.append("0");
                    break;
                case "5":
                    sb.append("2");
                    break;
            }
        }
        return sb.toString();
    }
}