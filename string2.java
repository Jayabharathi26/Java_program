import java.util.*;
class vowles{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char[] ch=s.toCharArray();
        int vowel = 0;
          for (int i = 0; i < s.length(); i++) 
  { 
   if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' 
   || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i) == 'O' 
   || s.charAt(i)=='u' || s.charAt(i) == 'U') 
   vowel++; 
  }
  System.out.println(vowel);
    }
}