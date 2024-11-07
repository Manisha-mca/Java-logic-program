import java.util.Scanner;
class Emp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int eno;
String ename;
float esalary;

System.out.println("enter Employee number:");
eno=sc.nextInt();
System.out.println("enter Employee name:");
ename=sc.next();
System.out.println("enter Employee salary:");
esalary=sc.nextFloat();

System.out.println("the given Employee number:"+eno);
System.out.println("the given Employee name:"+ename);
System.out.println("the given Employee salary:"+esalary);
}
}




