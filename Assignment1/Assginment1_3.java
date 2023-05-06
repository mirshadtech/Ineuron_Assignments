import java.util.Scanner;

/*
**************
****** *******
*****   ******
****     *****
***       ****
**         ***
*           **
*            *
*            *
*            *
*            *
*            *
*            *
**************
 */

public class Assginment1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = -1;
		for (int i = 0; i < n / 2; i++) {

			for (int j = 0; j < n / 2 - i; j++) {
				System.out.print("*");
			}
			if (i > 0) {
				for (int k = 1; k <= nsp; k++) {
					System.out.print(" ");

				}
			}

			if (i == 0 || i == 1) {
				for (int l = 0; l < n / 2; l++) {
					System.out.print("*");
				}
			} else {
				for (int l = 0; l < n / 2 - i + 1; l++) {
					System.out.print("*");
				}
			}
			nsp = nsp + 2;
			// System.out.print(nsp);
			System.out.println();

		}
		for (int i = 0; i < n / 2 - 1; i++) {
			System.out.print("*");

			for (int sp = 12; sp > 0; sp--) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}

	}

}
