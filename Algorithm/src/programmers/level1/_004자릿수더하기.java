package programmers.level1;
import java.util.*;

public class _004자릿수더하기 {
    public int solution(int n) {
        int answer = n;
        String nNum=Integer.toString(answer);
        String[]arr=nNum.split("");
        int sum=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++) {
        	list.add(Integer.parseInt(arr[i]));
        	sum+=list.get(i);
        }

        return sum;
    }
}
