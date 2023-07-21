import java.util.*;
 class user {
    public static void main (String args[])
    {
        Scanner obj= new Scanner (System.in);
        int num=obj.nextInt();
        int a=obj.nextInt();

        for (int i=num;i>0;i--) 
{
    for (int j=a;j>i;j--) 
        System.out.print(j); 
 
    for (int j=i;j>0;j--) 
        System.out.print(i); 
 
    System.out.println(); 
}

         
    }
}