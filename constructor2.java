import java.util.*;
class student
{
    int id;
    String name;
    student(int i,String n)
    {
        id=i;
        name=n;
    }
void display()
{
     System.out.println(id+" "+name);
}
}
class main
{
public static void main(String args[])
{
    student s1=new student(111,"sabaree");
    student s2=new student(222,"vasa");
    s1.display();
    s2.display();
}
}