
public class SwitchTest01 {

	public static void main(String[] args) {
		int num = 88;
		
		switch(num/10) {
		case 10:
			System.out.println("만점!!");
			break;
		case 9:
			System.out.println("A!!");
			break;
		case 8:
			System.out.println("B!!");
			break;
		case 7:
			System.out.println("C!!");
			break;
		default:
			System.out.println("exam failed....");
		}

	}

}
