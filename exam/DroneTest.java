package first;

// 자바프로그램은 main 메소드가 있어야만 된다
// main 메소드를 프로그램 시작점이라고 한다.
public class DroneTest {
	
	public static void main(String[] args) {
		Drone d1 = new Drone();
//		d1.wingCount = 4;
//		d1.fly();
		Drone d2 = new Drone();
		Drone d3 = new Drone();
		Drone d4 = new Drone();
		Drone d5 = new Drone();
		Drone d6 = new Drone();
		Drone d7 = new Drone();
		Drone d8 = new Drone();
		Drone d9 = new Drone();
		Drone d10 = new Drone();// 클래스는 1개, 인스터스는 10개
								// 클래스는 1개지만 해당메모리가 부족하여 죽을 수 있다.
		d1.wingCount = 4;
		d2.wingCount = 3;
		
		d1.fly();
		d2.fly();
		
		d1.isCamera = true;
		d1.takePicture();
	}

}
