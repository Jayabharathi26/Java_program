import java.util.*;
class patte{
public static void main(String[]agrs){
Scanner sc=new Scanner(System.in);
int array[][]=new int[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
array[i][j]=sc.nextInt();
if(i==1&&j==1){
System.out.print(array[1][1]);}
else{
System.out.print("*");
}

}
System.out.println( );
}
}
}