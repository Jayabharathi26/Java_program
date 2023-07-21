import java.util.*;
public class main{
    public static void main(String args[]){
        int a=10,b=4;
        int c=0;
        try{
            c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("error occured");
        }
        System.out.println(c);
        System.out.println("end of program");
    }
}