package day_3;

public class Second_larg_array {

	public static void main(String[] args) {
		int[] arr = {10,17,7,2};
		int larg = Integer.MIN_VALUE;
		int slarg = Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>larg) {
				slarg=larg;
				larg=num;
		}
			else if(num>slarg&&num!=larg){
				slarg=num;
			}
		}
		System.out.println("Second largest : "+slarg);
	}

}
