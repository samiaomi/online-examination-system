package onlineexaminationsystem;
import java.util.Scanner;

public class Student2 {
    void choice()
    {
        System.out.println("Enter Department: ");
    }
    public int m2=0,p2=0,c2=0,e2=0;
    Scanner scanner=new Scanner(System.in);
    void math()
    {
        System.out.println("    Mathematics:\n\n");
        System.out.println("1.	What is 20 percent off of 30 dollars?");
        String q1=scanner.nextLine();
        if("6".equals(q1))
        {
            m2++;
        }
        System.out.println("2.	What are all the prime numbers between 20 and 30?");
        String q2=scanner.nextLine();
        if("23 and 29".equals(q2))
        {
            m2++;
        }
        System.out.println("3.	What is the square root of 16?");
        String q3=scanner.nextLine();
        if("4".equals(q3))
        {
            m2++;
        }
        System.out.println("4.	State the value of pie.");
        String q4=scanner.nextLine();
        if("3.1416".equals(q4))
        {
            m2++;
        }
        System.out.println("5.	What is the GCD of 20 and 25?");
        String q5=scanner.nextLine();
        if("5".equals(q5))
        {
            m2++;
        }
    }
    void physics()
    {
        System.out.println("    Physics:\n\n");
        System.out.println("1. Which of the following materials will be attracted to a magnet?\n" +
"\n" +
" a) Plastic\n" +
" b) A shark\n" +
" c) Cotton\n" +
" d) Iron ");
        String q1=scanner.nextLine();
        if("d".equals(q1))
        {
            p2++;
        }
        System.out.println("2. What was the name of the man who shouted 'Eureka' when he got into the bath?\n" +
"\n" +
" a) Leonardo da Vinci\n" +
" b) Archimedes\n" +
" c) Isaac Newton\n" +
" d) Harry Potter ");
        String q2=scanner.nextLine();
        if("b".equals(q2))
        {
            p2++;
        }
        System.out.println("3. Gravity is the force which pulls things down to Earth. What is true about the force of gravity on the moon compared to Earth?\n" +
"\n" +
" a) It is stronger.\n" +
" b) There is no gravity on the Moon at all.\n" +
" c) It is the same.\n" +
" d) It is weaker. ");
        String q3=scanner.nextLine();
        if("d".equals(q3))
        {
            p2++;
        }
    }
    void chem()
    {
        System.out.println("    Chemistry:\n\n");
        System.out.println("1.  Pure water has a pH level of around?");
        String q1=scanner.nextLine();
        if("7".equals(q1))
        {
            c2++;
        }
        System.out.println("2.	What is the name of the element with the chemical symbol ‘He’?");
        String q2=scanner.nextLine();
        if("helium".equals(q2))
        {
            c2++;
        }
        System.out.println("3.	True or false? DNA is the shortened form of the term ‘Deoxyribonucleic acid’?");
        String q3=scanner.nextLine();
        if("true".equals(q3))
        {
            c2++;
        }
        System.out.println("4.	Is the compound ‘HCl’ an acid or base?");
        String q4=scanner.nextLine();
        if("acid".equals(q4))
        {
            c2++;
        } 
    }
    void eng()
    {
    System.out.println("    English:\n\n");
     System.out.println("1.	Jenny ___________ tired.");
        String q1=scanner.nextLine();
        if("is".equals(q1))
        {
            e2++;
        }
        System.out.println("2.	Today is Wednesday. Yesterday it ___________ Tuesday.");
        String q2=scanner.nextLine();
        if("was".equals(q2))
        {
            e2++;
        }
        System.out.println("3.	There ___________ lots of animals in the zoo.");
        String q3=scanner.nextLine();
        if("are".equals(q3))
        {
            e2++;
        }
        System.out.println("4.	Where ___________ Sarah live?");
        String q4=scanner.nextLine();
        if("does".equals(q4))
        {
            e2++;
        }
        System.out.println("5.	Jack ___________ English, Spanish and a bit of French.");
        String q5=scanner.nextLine();
        if("speaks".equals(q5))
        {
            e2++;
        }   
    }
}
