import java.util.*;
public class alphabet{
public static void main(String []args){
    Scanner obj=new Scanner(System.in);
    String g=obj.nextLine();
    String t=obj.nextLine();
    int count=0;
    if(g.length()==t.length() ||g.length()>t.length()||g.length()<t.length() ){
        for(int i=0;i<g.length();i++){
            if(g.charAt(i)==t.charAt(i))
            count++;
        }
       
    }   
     if(count==g.length())
        System.out.print("ZERO"); 
        else
         System.out.print(count);

}
}
// for(int i=0;i<g.length();i++){
//     for(int j=0;j<t.length();j++){
//         if()
//     }
// }