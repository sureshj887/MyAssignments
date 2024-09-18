package week1.day2;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		int num[] = {1, 2, 3, 4, 5, 6, 7, 2, 8, 4, 7};
		
		//nested for loop
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]==num[j]) {
					System.out.println("Duplicate number is "+num[j]);
				}
				
			}
			
		}

	}

}
