import java.util.*; //Scanner class 사용위해 추가

public class FlowEx3 {

	public static void main(String[] args) {
		int score = 0;    //점수를 저장하는 변수
		char grade = ' '; //학점을 저장하는 변수
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score           = scanner.nextInt(); //input 받은 값을 score에 저장
		
		if (score >= 90) {       //점수가 90점 이상일 경우
			grade = 'A';
		}else if (score >= 80) { //점수가 80점이상 90점 미만일 경우
			grade = 'B';
		}else if (score >= 70) { //점수가 70점이상 80점 미만일 경우
			grade = 'C';
		}else {                  //나머지 점수 전부 d학점
			grade = 'D';
		}
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
		

	}

}
