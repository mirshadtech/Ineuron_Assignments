import java.util.Scanner;

public class Assignment2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int N = arr.length;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		quickSort(arr, 0, N - 1);
		System.out.println("Sorted array:");
		printArr(arr);
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			if (arr[j] < pivot) {

				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {

			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
/*
 * OUTPUT--- 
 Enter the size of Array: 5 4 7 2 6 5 
 Sorted array: 2 4 5 6 7
 */
