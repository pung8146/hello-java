package first;

public class Drone {
	
	// 클래스안에 선언된 변수
	// 인스턴스 변수 or 필드
	int wingCount; //날개수 자동으로 0설정
	boolean isCamera; //boolean:참 거짓을 나타냄 true/false
	
	public void fly(){
		System.out.println(wingCount + "를 이용하여 날다.");
	}
	
	public void landing(){
		System.out.println("우아하게~");
	}
	
	public void takePicture(){
		if(isCamera) { 
			System.out.println("사진을 찍다");
		}
	}
}
 