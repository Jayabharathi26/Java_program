import java.util.*;
 class user {
    public static void main(String args[]) {
        Scanner obj= new Scanner(System.in);
        int num=obj.nextInt();
        int arr[] =new int[num];
        for (int i=0;i<num;i++) {
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for (int i=0;i<num-1;i++) {
            if (i<num&&arr[i]==arr[i+1]) {
                count++;
                i=i+1;
            }
        }
        System.out.println(count);
 
    }
}