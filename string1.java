import java.util.*;
class charcount{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            count++;
        }
        System.out.println(count);
    }
}