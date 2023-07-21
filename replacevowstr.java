import java.util.*;
public class user
{
  public static void main(String args[]) 
  {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the string");
    String str = obj.nextLine();
    System.out.println(str.replaceAll("[AaEeIiOoUu]", " "));
  }
}