import java.util.Scanner;
/*
**************
******
*****
****
***
**
*
**
***
****
*****
******
**************
 */

public class Assginment1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < 2 * n; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (int k = 1; k <= n - 1; k++) {
			for (int l = n - 1; l >= k; l--) {
				System.out.print("*");
			}
			System.out.println();

		}
		for(int p=1;p<n-1;p++) {
			
			for(int q=0;q<=p;q++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 2 * n; i++) {
			System.out.print("*");
		}
		
	}

}
