import java.util.*;
class user{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=9,c=8;
        switch(a)
        {
            case 1:
            System.out.println(b+c);
            break;
            case 2:
            System.out.println(b-c);
            break;
            case 3:
            System.out.println(b*c);
            break;
            case 4:
            System.out.println(b/c);
            break;
            default:
            System.out.println("worng");
            break;
        }
    }
}