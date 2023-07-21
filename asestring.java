import java.util.*;
class asestring{
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        String str=obj.nextLine();
        System.out.println(str);
        char chararray[]=str.toCharArray();
        Arrays.sort(chararray);
        System.out.print(new String(chararray));
    }
    
}