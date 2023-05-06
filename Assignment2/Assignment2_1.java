import java.util.Arrays;
import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		// duplicate element present in array

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]); 
		}

		boolean flag = false;
		for (int i = 0; i < n-1; i++) {
			if (arr[i] == arr[i + 1]) {
				flag=false;
				
				break;
			} else {
				flag = true;
				
			}
		}
		if (flag) {
			System.out.println("Duplicate element not present");
			}
		else {
			System.out.println("Duplicate element present");
		}

	}

}
