import java.util.*;

class LeftTriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int i, j,row;
		System.out.println("Enter number of rows:");
		row = sc.nextInt();
		
		for (i = 0; i < row; i++) {
			for (j = 0; j <= row-i; j++) {
				System.out.print("  ");
			}
			for(j=0;j<=i;j++){
			System.out.print("* ");
			
			}
			System.out.println();
		}
	}
}


//left triangle
/*

	    	* 
          * *
        * * *
      * * * *
    * * * * *

*/