import java.util.*;

class cons{
	int id;
	String name;
	cons(int i,String n)
	{
		id=i;
		name=n;
		
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class defaultcons {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String str=sc.nextLine();
		int b=sc.nextInt();
		String str2=sc.nextLine();
     cons c1=new cons(a,str);
     cons c2=new cons(b,str2);
     c1.display();
     c2.display();

	}

}