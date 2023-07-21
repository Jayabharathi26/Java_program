import java.util.*;
class main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=obj.nextInt();
        }
        int min=arr[0];

        for(int i=0;i<num;i++)
        {
            if(min>arr[i]){
          
           min=(arr[i]);

            }
         
        }
        System.out.println(min);
    }
}