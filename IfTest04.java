
public class IfTest04 {

	public static void main(String[] args) {
		int num = 120;
		
		//and조건
		if(num > 100 && num < 110) {
			System.out.println("숫자는 100보다 크고 110보다 작다");
		}else if (num >110 && num <120) {
			System.out.println("숫자는 110보다 크고 120보다 작다.");
		}else {
			System.out.println("초과.");
		}
		//or조건
		if(num > 100 || num < 110) {
			System.out.println("숫자는 100보다 크거나 110보다 작다");
		}else if(num>110 || num <120) {
			System.out.println("숫자는 110보다 크거나 120보다 작다.");
		}else {
			System.out.println("초과.");
		}
		
		

	}
	
	

}
