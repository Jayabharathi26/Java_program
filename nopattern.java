import java.util.*;
class user{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int count=1;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        } 
    }
}