import java.util.*; //Scanner class 사용위해 추가

public class FlowEx2 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp      = scanner.nextLine();     //입력받는 내용을 변수 tmp에 저장
		input           = Integer.parseInt(tmp);  //입력받은 문자열 tmp를 숫자로 변환해줌
		
		if(input==0) { //입력값이 0일 때
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input != 0) { //입력값이 0이 아닐 때
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
		}

	}

}
