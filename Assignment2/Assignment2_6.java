import java.util.Scanner;

public class Assignment2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of 1st Array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Size of 2nd Array:");
		int n1 = sc.nextInt();

		int arr1[] = new int[n1];
		for (int j = 0; j < n1; j++) {
			arr1[j] = sc.nextInt();
		}
		if (subset(arr, arr1)) {
			System.out.println("Array II is the Subset of Array I");
		} else {
			System.out.println("Array II is NOT Subset of Array I");
		}

	}

	public static boolean subset(int[] arr, int[] arr2) {

		boolean flag;
		for (int i = 0; i < arr2.length; i++) {
			flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr2[i] == arr[j]) {
					flag = true;
				}
				//System.out.println(j + ":::" + flag);
			}
			if (flag == false) {
				return false;
			}

		}

		return true;

	}

}
