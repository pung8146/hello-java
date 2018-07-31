package first;

public class Exam05 {

	public static void main(String[] args) {
		//1부터 100 까지 출력하시오 -> 1부터 100까지의 합을 구하시오.
		
		int i = 1;
		int sum = 0;
		while ( i <= 100 ) {
			 System.out.println(i);
			 sum = sum + i;
			 i = i + 1;
		}
		System.out.println("--------------");
		System.out.println(sum);
	}

}
