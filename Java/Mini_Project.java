import java.util.Scanner;
public class Mini_Project{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int myNum= (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess my number: ");
            userNumber = input.nextInt();

            if(userNumber==myNum){
                System.out.println("Correct number");
                break;
            }
            else if(userNumber  > myNum){
                System.out.println("your num is lerge");
            }
            else{
                System.out.println("you number is small");

            }
        }while(userNumber >= 0);

        System.out.println("my number was : ");
        System.out.println(myNum);



    }
}