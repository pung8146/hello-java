package first;

public class Exam03 {

	public static void main(String[] args) {
		int 정수 = 83;
		
		//정수가 90점 이상이면 A라고 출력
		//정수가 80점 이상이고 89점 이하이면  B라고 출력
		if(정수 >= 90){
			System.out.println("A");
		}
		
		// && : 그리고(둘다 만족해야댐)
		if(정수 >= 80 && 정수 <= 89){
			System.out.println("B");
		}
		
		//정수 , 문자열
	}

}
