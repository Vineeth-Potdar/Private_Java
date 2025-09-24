package day_3;

public class Sum_of_row {

	public static void main(String[] args) {
		int[][] arr = {
						{1,2,3},
						{4,5,6}
						};
		for(int i=0;i<=arr.length-1;i++) {
			int sum = 0;
			for(int j=0; j<=arr[i].length-1;j++) {
				sum += arr[i][j];
			}
			System.out.println("The sum of row "+ i +" is : "+sum);
		}
		
	}

}
