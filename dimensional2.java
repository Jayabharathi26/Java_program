import java.util.Scanner;

public class arr {

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
			if(i==0)
			{
				ans[0]=arr[0]+brr[2];
			}
			else if(i==1)
			{
				ans[1]=arr[1]+brr[1];
			}
			else if(i==2)
			{
				ans[2]=arr[2]+brr[0];
			}
			else if(i==3) {
				ans[3]=arr[3]+brr[3];
			}
			else if(i==4)
			{
				ans[4]=arr[4]+brr[6];
			}
            else if(i==5)
			{
				ans[5]=arr[5]+brr[5];
			}else if(i==6)
			{
				ans[6]=arr[6]+brr[4];
			}
			
			System.out.print(ans[i]+" ");
		}
        System.out.println();
		for(int i=0;i<a;i++)
		{
			if(ans[i]<10)
			{
				System.out.print("s ");
			}
			else
			{
				System.out.print("D ");
			}
		}
    }
}
              