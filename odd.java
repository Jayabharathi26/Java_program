import java.util.*;
public class q1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem,rev=0,temp;
        int c=0;
        temp=n;
        while(n!=0)
        {
        rem = n%10;
        rev = rev*10+rem;
        c=c+rem;
        n/=10;
        }
        System.out.println(rev);
        if(rev%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
       System.out.println(c);

        
    }
    
}
