
import java.util.*;

class main {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
	        int n=obj.nextInt();
	        int[] arr=new int[n];
	        int temp=0;
	        for (int i=0;i<n;i++) {
	            arr[i]=obj.nextInt();
	        }

	    
	        for (int i=0;i<n;i++) {
	            int r=(int) Math.sqrt(arr[i]);
	            if (r*r==arr[i]) {
	                temp++;
	            }
	        }
	        int ans=temp-1;
	        	
	        System.out.println(ans);
	    }

}