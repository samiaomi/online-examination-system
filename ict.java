/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlineexaminationsystem;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ict{// extends Student1 {
    public int m1=0;
    Scanner scanner=new Scanner(System.in);
    void math()
    {
        System.out.println("1.	What is 20 percent off of 30 dollars?");
        String q1=scanner.nextLine();
        if("6".equals(q1))
        {
            m1++;
            System.out.println(m1);
        }
        System.out.println("2.	What are all the prime numbers between 20 and 30?");
        String q2=scanner.nextLine();
        if("23 and 29".equals(q2))
        {
            m1++;
            System.out.println(m1);
        }
        System.out.println("3.	What is the square root of 16?");
        String q3=scanner.nextLine();
        if("4".equals(q3))
        {
            m1++;
            System.out.println(m1);
        }
        System.out.println("4.	State the value of pie.");
        String q4=scanner.nextLine();
        if("3.1416".equals(q4))
        {
            m1++;
            System.out.println(m1);
        }
        System.out.println("5.	What is the GCD of 20 and 25?");
        String q5=scanner.nextLine();
        if("5".equals(q5))
        {
            m1++;
            System.out.println(m1);
        }
        System.out.println(m1);
    }
    void physics()
    {
        System.out.println("1. Which of the following materials will be attracted to a magnet?\n" +
"\n" +
" a) Plastic\n" +
" b) A shark\n" +
" c) Cotton\n" +
" d) Iron ");
        String q1=scanner.nextLine();
        System.out.println("2. What was the name of the man who shouted 'Eureka' when he got into the bath?\n" +
"\n" +
" a) Leonardo da Vinci\n" +
" b) Archimedes\n" +
" c) Isaac Newton\n" +
" d) Harry Potter ");
        String q2=scanner.nextLine();
        System.out.println("3. Gravity is the force which pulls things down to Earth. What is true about the force of gravity on the moon compared to Earth?\n" +
"\n" +
" a) It is stronger.\n" +
" b) There is no gravity on the Moon at all.\n" +
" c) It is the same.\n" +
" d) It is weaker. ");
        String q3=scanner.nextLine();
    }
}
