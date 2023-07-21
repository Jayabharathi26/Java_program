import java.util.Scanner;
public class count {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char jb=obj.next().charAt(0);
         int flag=0;
       char[]ch=a.toCharArray();


        for(int i=0;i<a.length();i++)
        {
            if(jb==ch[i])
           flag=1;
            
        }
           {
              if(flag==1)
              System.out.println("Present");
              else
              System.out.println("Not present");
           }
                
        }
    }
