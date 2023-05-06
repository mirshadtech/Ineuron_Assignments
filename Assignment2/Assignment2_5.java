import java.util.Scanner;

public class Assignment2_5 {

	public static void main(String[] args) {
		// Selection sort
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("After sorting:-Selection Sort");
		//int min=0;
		for(int i=0;i<arr.length-1;i++) {
			
			int min=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int  temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" "); 
		}

	}

}
/*OUTPUT--
 Enter the size of Array:
5
4
7
2
6
5
Sorted array:
2 4 5 6 7  
*/