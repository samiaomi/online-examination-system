package onlineexaminationsystem;
import java.util.Scanner;

public class OnlineExaminationSystem {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student1 s1 =new Student1();
        Welcome ob1=new Welcome();
        ob1.Statement();
        System.out.print("Name: ");
        String name1=scanner.nextLine();
        if("Student1".equals(name1))
        {
            s1.choice();
        }
        String dept1=scanner.nextLine();
        if("ict".equals(dept1))
        {
            System.out.println("There are two courses: 1.Math, 2.Physics.");
            s1.math();
            System.out.println("Marks in Math "+s1.m1);
            s1.physics();
            System.out.println("Marks in Physics "+s1.p1);
        }
        else if("es".equals(dept1))
        {
            System.out.println("There are two courses: 1.Chemistry, 2.English.");
            s1.chem();
            System.out.println("Marks in Chemistry "+s1.c1);
            s1.eng();
            System.out.println("Marks in English "+s1.e1);            
        }
        Student2 s2 =new Student2();
        System.out.print("Name: ");
        String name2=scanner.nextLine();
        if("Student2".equals(name2))
        {
            s2.choice();
        }
        String dept2=scanner.nextLine();
        if("ict".equals(dept2))
        {
            System.out.println("There are two courses: 1.Math, 2.Physics.");
            s2.math();
            System.out.println("Marks in Math "+s2.m2);
            s2.physics();
            System.out.println("Marks in Physics "+s2.p2);
        }
        else if("es".equals(dept2))
        {
            System.out.println("There are two courses: 1.Chemistry, 2.English.");
            s2.chem();
            System.out.println("Marks in Chemistry "+s2.c2);
            s2.eng();
            System.out.println("Marks in English "+s2.e2);            
        }
        
    }    
}
