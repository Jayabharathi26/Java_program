import java.util.*;
class matrix {	
	    public static void main(String[] args) {
	        int[][] matrix = new int[3][3];
	        Scanner obj = new Scanner(System.in);
	        System.out.println("matrix elements:");
	        for (int i=0;i<3;i++) {	           
				 for (int j=0;j<3;j++) {
	                matrix[i][j]=obj.nextInt();
	            }
	        }
	        int[] output=new int[9];
	        int index = 0;
	        for (int i=0;i<3;i++) {
	            if (i%2==0) {
	                for (int j=0;j<3;j++) {
	                    output[index++] = matrix[j][i];
	                }
	            } else {
	                for (int j=2;j>=0;j--) {
	                    output[index++] = matrix[j][i];
	                }
	            }
	        }
	        System.out.println(" ");
	        for (int i=0;i<9;i++) {
	            System.out.print(output[i] + " ");
	        }
	    }
	}
