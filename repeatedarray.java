import java.util.*;
    class reapted{

    public static void main(String[] args) 
    { 
       Scanner obj=new Scanner(System.in);
       int n=10;
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
          {
            arr[i]=obj.nextInt();
          }
       int temp[] = new int[arr.length];
       int count = 0;
       for(int i=0; i<arr.length; i++) 
       {
          int element = arr[i];
          boolean flag = false;
          for(int j=0; j<count; j++) {
             if(temp[j] == element) {
                flag = true;
                break;
             }
          }
          if(flag) {
             continue;
          }

          for(int j=i+1; j<arr.length; j++) {
             if(arr[j] == element) {
                temp[count++] = element;
                break;
             }
          }
       }
       System.out.println("Total Repeated elements: " + count);
       System.out.println("Repeated elements are: ");
       for (int i = 0; i < count; i++) {
          System.out.print(temp[i]+" ");
       }      
    }
}