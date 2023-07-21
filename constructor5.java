import java.util.*;
public class constructor{
static int method(int x,int y){
    return x+y;
}
static double method(double x,double y){
    return x+y;
}
public static void main(String args[]){
    int mynum1=method(5,5);
    double mynum2=method(4.5,8.8);
    System.out.println("int:"+ mynum1);
    System.out.println("double:"+ mynum2);
}
}