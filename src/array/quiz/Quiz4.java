package array.quiz;

import java.util.Arrays;

/*
 * 5개 크기의 정수형 배열을 생성하고, 1~10 중 짝수만 저장하세요.
 * 
 * 답: 2 4 6 8 10
 * 
 * */
public class Quiz4 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		System.out.println(Arrays.toString(arr));
//		System.out.println(arr); // [I@372f7a8d 이딴식으로 뜸
		int cnt = 0;
		
		for(int i=1; i<=10; i++){ 
			if(i%2==0) { 
				arr[cnt]=i; 
				cnt++; 
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
