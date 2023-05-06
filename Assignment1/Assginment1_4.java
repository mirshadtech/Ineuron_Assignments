import java.util.Scanner;

/*
*            *
**          **
***        ***
****      ****
*****    *****
******  ******
**************
**************
 */

public class Assginment1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nsp=2*(n-1);
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=nsp;k>0;k--) {
				System.out.print(" ");
			}
			for(int l=0;l<=i;l++) {
				System.out.print("*");
			}
			nsp=nsp-2;
			System.out.println();
		}
		for(int i=0;i<2*n;i++) {
			System.out.print("*");
		}

	}

}
