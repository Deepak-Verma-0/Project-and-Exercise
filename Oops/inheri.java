// inhairetance 
// when take  the properti of one  class to other then call inharitance
// there are four type of  inhari  in java
//1- single  level inharitance
//2- multi leve inheritance
//3- hierarchial inheritace -base class  to  derived class, derived class
//4 hybrid  class 

class Shape{
    String color;
}
class Triangle extends Shape{

}
public class inheri{
    public  static void main(String[] args){
        // creating object
        Triangle  t1  = new Triangle();
        t1.color="red";
        System.out.println(t1.color);


    }
}