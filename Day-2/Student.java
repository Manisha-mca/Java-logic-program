import java.util.Scanner;
class Student 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
      int sno,stotal;
      int smaths, sphysics, scomputer;
      String sname;
      float savrg;
    System.out.println("enter the student no:");
    sno=sc.nextInt();
    System.out.println("enter the student marks in maths:");
    smaths=sc.nextInt();
    System.out.println("enter the student marks in physics:");
    sphysics=sc.nextInt();
    System.out.println("enter the student marks in computer:");
    scomputer=sc.next();

    stotal=smaths+sphysics+scomputer;
    savrg=stotal/3;
    System.out.println("the given total of student is:"+stotal);
    System.out.println("the given student avrg is :+savrg);
  }
}
    
    
