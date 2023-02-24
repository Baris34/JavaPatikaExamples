package Examples;

import java.util.Scanner;

public class DiamondWithStars {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int n=scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
                for (int j = 1; j<=(2*i)-1;j++) {
                    System.out.print("*");
                }
                System.out.println();


            }
        for (int i=n-1;i>=1;i--){
            for(int k=n-i;k>0;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
		
		
		
	}

}
