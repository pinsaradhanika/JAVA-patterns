import java.util.Scanner;

public class pyramid2{
	public static void main(String [] args){
	
	Scanner sc =new Scanner(System.in);
	int i,j,row,space;

	System.out.println("Enter number of rows:");
	row =sc.nextInt();
    //cols=rows*2-1

	//for rows
    for(i=1;i<=row ;i++){
        
       //inner loop
       /*Normal outerloop to print along rows.Then comes the innerloop
       here what we have done is we have calculated number of columns for a respective number of rows
       For example : if rows = 4,no of cols = 7 (2*rows-1)
       Then inside that codeif make conditional statement to print stars.
       In the first row the col number that prints the star is always equal to number of rows. In above example its 4.
       in 1st row we need to print * in 4 th col. in 2nd row we need to print from 2nd col to 5th col
       full rows = 4   i=current row no
        4-1 4  4+1
            4       i=1 4= 4-(1-1) col no = row -(i-1)
          3 4 5     i=2 3= 4-(2-1)  5=4+ (2-1) col no = row -(i-1) col no = row +(i-1)

          Reference : https://www.youtube.com/watch?v=KdM6OrvcjPI
         */ 

        for(j=1;j<=(2*row)-1;j++){
            if(j >= row-(i-1) && j <= row+(i-1)){
                System.out.print("*");
            }
            else
            System.out.print(" ");
            
        }
           System.out.println();
            
    }
   

	}
}
/*
upside
   *
  ***
 *****
*******

*/