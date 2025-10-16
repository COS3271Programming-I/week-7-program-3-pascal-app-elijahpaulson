package PascalAPP;
import java.util.Arrays;
public class PascalAPP {

	public static void main(String[] args) {
		// create the array
		int [][] pascal=new int[11][11];
		int size=pascal.length;
		// make sure that every row starts with 1 and that the correct numbers are added
		for (int i=0;i<size;i++) {
			pascal[i][0]=1;
			for (int j=0;j<=i;j++) {
				if (j>0) {
					pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
				}
				// display the triangle
				System.out.print(pascal[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
