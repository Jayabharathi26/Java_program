import java.util.*;
class user{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt();
        int col=obj.nextInt();
          int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            arr[i][j]=obj.nextInt();
        }
        for(int i=0;i<row;i++,System.out.println())
        {
            for(int j=0;j<col;j++)
            System.out.print(arr[i][j]+" ");
        }
    
    int Sum=0;
    for(int i=0;i<row;i++){
         
        for(int j=0;j<col;j++){
           Sum=Sum+arr[i][j];
        }
    }
        System.out.print(Sum);

}
}