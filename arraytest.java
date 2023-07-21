import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int row = obj.nextInt();
		int col = obj.nextInt();
		int arr[][] = new int [row][col];
		for(int i =0; i<row;i++) {
			for(int j =0; j<col;j++) {
				arr[i][j]=obj.nextInt();
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		int m =0;
		int mcount =0;
		for(int i =0;i<row;i++) {
			int ocount =0;
			for(int j =0;j<col;j++) {
				if(arr[i][j]==1) {
					ocount++;
				}
			}
			if(ocount>mcount) {
				mcount = ocount;
				m = i;
				
			}
		}
		
		
		System.out.println("ans" + (m+1));
		
	}

}