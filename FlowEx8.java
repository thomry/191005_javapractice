import java.util.*; //Scanner class 사용위해 추가

public class FlowEx8 {

	public static void main(String[] args) {
		System.out.print("당신의 주민번호를 입력하세요.(011231-1111222)>");
		
		Scanner scanner = new Scanner(System.in);
		String   regNo  = scanner.nextLine();     //input받은 값을 regNo에 저장
		
		char gender = regNo.charAt(7);           //input받은 번호의 8째 문자를 gender에 저장
		
		switch(gender) {
		case '1': case '3':
			System.out.println("당신은 남성입니다.");
			break;
		case '2': case '4':
			System.out.println("당신은 여성입니다.");
			break;
		default:
			System.out.println("유효하지않은 주민등록번호입니다.");
		}

	}

}
