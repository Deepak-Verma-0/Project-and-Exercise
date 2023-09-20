abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk  4 legs ");
    }
}
class  chiken extends Animal{
    public  void walk(){
        System.out.println("walk 2 legs ");
    }
}
public  class abstract_j{
    public static void main(String[] args){
        Horse h1 = new Horse(); 
        h1.walk();
        chiken h2 =new chiken();
        h2.walk();
        
        // Animal not crate object it make already abstract
        Animal ani =new Animal(); //error
        ani.walk();
    }
}