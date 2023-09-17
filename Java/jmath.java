import java.util.*;
public class jmath{
    public static void main(String[] args){
        //maths
        //5,6
        System.out.println(Math.max(5,6));
        System.out.println(Math.min(5,7));

        // random number
        //when we need to automatic random number
        System.out.println((int)(Math.random()*100));
        Scanner scs= new Scanner(System.in);
       // int age=  scs.nextInt();
        //System.out.println("your age " + age);

        String name= scs.nextLine();
        System.out.println( name);  
    }
}