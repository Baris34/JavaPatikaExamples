package Examples;

public class TriangleWithStars {

	public static void main(String[] args) {
		for (int i = 10; i >=1; i--) {
			for (int j = 10-i; j >=1 ; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k<=2*i-1 ; k++) {
				System.out.print("*");
		
			}
			System.out.println();
		}
	}

}
