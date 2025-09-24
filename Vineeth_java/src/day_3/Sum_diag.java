package day_3;

public class Sum_diag {
	public static void main(String[] args) {
		int [][] arr = {
						{1,2,3,4},
						{4,5,6,2},
						{1,2,9,0},
						{4,6,2,5}
						};
		int sum = 0;
		for(int i=0;i<=arr.length-1;i++) {
			sum += arr[i][i];
		}
		System.out.println("Sum of the diagonal elements is : "+sum);
	}
}
