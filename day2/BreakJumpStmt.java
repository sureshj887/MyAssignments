package week1.day2;

public class BreakJumpStmt {

	public static void main(String[] args) {
		int num = 10;
		System.out.println("Break Statement");
		
		for (int i = 0; i <=num; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
			
		}
		

		System.out.println("Jump/Continue Statement");
		for (int i = 0; i <=num; i++) {
			if (i==5) {
				continue;				
			}
			System.out.println(i);
		}
	}

}
