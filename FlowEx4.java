import java.util.*; //Scanner class 사용위해 추가

public class FlowEx4 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를입력해주세요.>");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //input받은 값을 score변수에 저장
		
		System.out.printf("당신의 점수는 %d입니다. %n", score);
		
		if (score >= 90) {         //score이 90점 이상일 때
			grade = 'A';
			if (score >= 98) {     //GRADE가 A학점이면서 98점 이상인 경우
				opt = '+';
			}else if (score <94) { //GRADE가 A학점이면서 94점 미만인 경우
				opt = '-';
			}
		}else if (score >= 80) {   //score이 80점 이상 90점 미만일 때
			grade = 'B';
			if (score >= 88) {     //GRADE가 B학점이면서 88점 이상인 경우
				opt = '+';
			}else if (score <84) { //GRADE가 B학점이면서 84점 미만인 경우
				opt = '-';
			}
		}else {
			grade = 'C';           //score 나머지
		}
		System.out.printf("당신의 학점은 %c%c입니다. %n", grade, opt);
	}

}
