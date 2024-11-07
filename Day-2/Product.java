import java.util.Scanner;
class Product
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int pno;
String pname;
float pcost;
float pquantity;
float bill;

System.out.println("enter Product number:");
pno=sc.nextInt();
System.out.println("enter Product name:");
pname=sc.next();
System.out.println("enter product cost:");
pcost=sc.nextFloat();
System.out.println("enter product quantity:");
pquantity=sc.nextFloat();

bill=pcost*pquantity;

System.out.println("the given Product number:"+pno);
System.out.println("the given Product name:"+pname);
System.out.println("the given Product cost:"+pcost);
System.out.println("the given Product quantity:"+pquantity);
System.out.println("the given Product bill:"+bill);
}
}




