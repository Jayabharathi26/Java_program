import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int value=sc.nextInt();
        int sum=0,flag=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum=arr[i]+arr[j];
                if(sum==value){
                    flag++;
                }
                sum=0;
            }
        }
            if(flag>=1){
                System.out.print("true");
            }
                else{
                
                    System.out.print("false");
                }
    }
}