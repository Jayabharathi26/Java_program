import java.util.*;
class user
{
        public static void main(String args[])
        {
             Scanner obj=new Scanner(System.in);
             String s=obj.nextLine();
             int i,j;
             char ch[]=s.toCharArray();
             for(i=0;i<s.length();i++)
             {
                for(j=i+1;j<s.length();j++)
                {
                    if(ch[i]==ch[j] && ch[i]!=' ')
                    {
                        System.out.println(ch[i]);
                        break;
                    }
                }
             }
        }
}