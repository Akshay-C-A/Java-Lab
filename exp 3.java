/**Author  : Akshay C A
   RollNo  : 12 **/


package lab1;
import java.util.*;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int r1,r2,c1,c2,i,j,k;
		System.out.println("Enter the number of rows and columns of Matrix 1\n");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the number of rows and columns of Matrix 2\n");
		r2=sc.nextInt();
		c2=sc.nextInt();
		
		int[][] matrix1 = new int[r1][c1];
		int[][] matrix2 = new int[r2][c2];
		int[][] matrix3 = new int[r1][c2];
		
		if(r2!=c1) {
			System.out.println("The multiplication is not possible");
		}
		
		else {
			
			System.out.println("Enter the elements of matrix 1");
			for(i=0;i<r1;i++) {
				for(j=0;j<c1;j++) {
					matrix1[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Enter the elements of matrix 2");
			for(i=0;i<r2;i++) {
				for(j=0;j<c2;j++) {
					matrix2[i][j]=sc.nextInt();
				}
			}
			
			//matrix3 will b ZERO MATRIX
			for(i=0;i<r1;i++) {
				for(j=0;j<c2;j++) {
					matrix3[i][j]=0;
				}
			}
			
			//Matrix Multiplication
			
			for(i=0;i<r1;i++) {
				for(j=0;j<c2;j++) {
					for(k=0;k<c1;k++)
					matrix3[i][j]=matrix3[i][j]+(matrix1[i][k]*matrix2[k][j]);
				}
			}
			
			System.out.println("The product of matrix is ");
			for(i=0;i<r1;i++) {
				for(j=0;j<c2;j++) {
					System.out.print(matrix3[i][j]+"\t");
				}
				System.out.println("");
			}

			
			
		}
	
	}

}
