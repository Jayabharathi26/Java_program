import java.util.*;
public class number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                i+=n/2;
                count++;
            }
            if(i%2!=0)
            {
                i++;
                count++;
            }
        }
        System.out.println(count);
    }
    
}