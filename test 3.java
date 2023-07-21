import java.util.Scanner;

class Employee

{

getInfo()

{

Scanner in = new Scanner(System.in);

System.out.println("Enter your salary");

double salary = in.nextDouble();

System.out.println("Enter the no.of working hours");

int hours = in.nextInt();

}

AddSal()

{

double sal;

if(sal < 500)

sal = sal + 10;

System.out.println("Salary: " + sal);

}

AddWork()

{

double sal; 
int hours;

if(hours > 6)

sal =sal + 5;

System.out.println("Salary: " + sal);

}

public static void main()

{

Scanner in = new Scanner(System.in);

Employee obj = new Employee();

obj.getInfo();

obj.AddSal();

obj.AddWork();

}

}



