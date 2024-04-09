package array.quiz;

/*
 * System.arraycopy 메소드를 사용하여 배열을 복사하세요. * 
 * 원본배열: {'a', 'b', 'c', 'd', 'e'} * 
 * 새배열: {'d', 'e'}
 * */
public class Quiz7 {

	public static void main(String[] args) {
		char[] srcArr = {'a' ,'b', 'c', 'd', 'e'}; 
		// 원본배열
		char[] newArr = new char[2]; 
		// 새배열
		
		System.arraycopy(srcArr, 3, newArr, 0, 2);
		// System.arraycopy를 사용하여 배열 복사
		// srcArr -> 원본배열임
		// "3"은 원본 배열에서 복사를 시작할 인덱스
		// "d" 의 인덱스를 나타냄
		// newArr -> 새로운 배열임
		// "0"은 새 배열에 복사를 시작할 인덱스
		// 첫번째 요소부터 복사해라 해서 "0" 으로 시작
		// "2"는 복사할 요소의 개수
		// "d", "e" 2개 요소 복사함
					
				
		for(int i=0; i<newArr.length; i++){
		// for 반목문 = "newArr"배열의 길이만큼 반복할거임
		// 결과 :  배열의 크기에 해당하는 만큼 아래의 코드 블록이 반복 실행
		// i 변수는 반복문이 진행되는 동안 배열의 인덱스			
			
			System.out.print(newArr[i] + " ");

			// newArr[i]는 배열 newArr의 i번째 요소
			// System.out.print() 함수를 사용하여 해당 요소를 화면에 출력
			//  " "는 각 요소 사이에 공백을 넣어주는 역할로 넣은거임
			//	System.out.print(newArr[i]);
			// 안넣으면 de 일케 붙어서 나옴
			// System.out.println 안쓴이유 배열이리고 했음
			// 센세가 주신 배열의 코드가 한줄로 이어져 있기에 ln으로 줄바꿈 안하고 공백을 씀
			
			
		}
	}
}
