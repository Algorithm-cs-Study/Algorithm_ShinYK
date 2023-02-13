package programmers.level1;

public class _006문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;

        int countP=0;
        int countY=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='p' || arr[i]=='P'){
                countP++;
            }else if(arr[i]=='y' || arr[i]=='Y'){
                countY++;
            }
        }
        if(countP!=countY){
            answer=false;
        }

        return answer;
    }
}
