import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int password = 0;
		
		System.out.println("패스워드를 입력하세요(숫자) :");
		password = scan.nextInt();
		
		if (password == 1234) {
			System.out.println("패스워드가 맞습니다.");
		}else {
			System.out.println("패스워드가 틀렸습니다.");
		}
		
		scan.close();  //jdk 1.7부터 나온 기능

	}

}
