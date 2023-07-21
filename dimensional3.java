import java.util.*;
public class dimensional3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		int brr[]=new int[a];
		int ans[]=new int[a];
		for(int i=0;i<a;i++)
		{
				arr[i]=sc.nextInt();			
		}
		for(int i=0;i<a;i++)
		{
			brr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			if(i==1||i==2||i==3||i==4||i==5||i==6)
			{
				ans[0]=brr[0]+arr[1];
				ans[1]=arr[1]+brr[2];
				ans[2]=arr[4]+brr[2];
				ans[3]=arr[4]+brr[5];
				ans[4]=arr[5]+brr[6];

			}
           
			System.out.print(ans[i]+" ");
		}
        // System.out.println();
		// for(int i=0;i<a;i++)
		// {
		// 	if(ans[i]<10)
		// 	{
		// 		System.out.print("s ");
		// 	}
		// 	else
		// 	{
		// 		System.out.print("D ");
		// 	}
		// }
    }
}
              