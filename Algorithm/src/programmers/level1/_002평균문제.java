package programmers.level1;

public class _002평균문제 {
    public double solution(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
        double answer = (double)sum/(double)arr.length;
        return answer;
    }
}