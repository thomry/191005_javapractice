
public class IfTest02 {

	public static void main(String[] args) {
		//잘못된 조건제공 예제
		
		int num = 120;
		
		if(num>100) {
			System.out.println("숫자는 100보다 크다.");
		}else if (num > 110) {
			System.out.println("숫자는 110보다 크다.");
		}else {
			System.out.println("초과.");
		}

	}

}
