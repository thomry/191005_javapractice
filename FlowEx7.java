import java.util.*; //Scanner class 사용위해 추가

public class FlowEx7 {

	public static void main(String[] args) {
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();         //input받은 값을 user변수에 저장
		int com  = (int)(Math.random()*3)+1;  //com이라는 변수중 랜덤으로 1,2,3중 하나가 저장됨
		
		System.out.println("당신은 "+user+"입니다.");
		System.out.println("컴은 "+com+"입니다.");
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			//break; 마지막 문장이라서 쓸 필요가 없습니다.
		}

	}

}
