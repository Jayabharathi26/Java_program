import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);
    System.out.print("originam string:");
 
    String originalStr = obj.nextLine();
    obj.close();
 
    String words[] = originalStr.split("\\s");
    String reversedString = "";
    for (int i = 0; i < words.length; i++) { 
            if (i == words.length - 1) 
              reversedString = words[i] + reversedString; 
            else
              reversedString = " " + words[i] + reversedString; 
        } 
 
    System.out.print("Reverse string: " + reversedString);
  }
}