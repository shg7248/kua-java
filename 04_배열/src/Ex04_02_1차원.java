import java.util.Arrays;
import java.util.Collections;

public class Ex04_02_1차원 {
	public static void main(String[] args) {
		
		int[] score = {79,88,99,33,100,55,95};
		float leng = score.length;
		System.out.println("length : "+score.length);
		
		int i,sum=0;
		for(i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
			sum += score[i];
		}
		
		System.out.println();
		System.out.println("sum="+sum);
		System.out.printf("avg=%.2f", sum/leng);
		System.out.println();
		
		sum=0;
		for(int j:score) {
			System.out.print(j+" ");
			sum += j;
		}
		
		System.out.println();
		System.out.println("sum="+sum);
		System.out.printf("avg=%.2f", sum/leng);
		System.out.println();
		
		int max, min;
		max = score[0];
		min = score[0];
		
		for(i=1;i<score.length;i++) {
			if(max<score[i])
				max=score[i];
			if(min>score[i])
				min=score[i];
		}
		
		System.out.println("가장 큰값:"+max);
		System.out.println("가장 작은값:"+min);
		
	}
}
