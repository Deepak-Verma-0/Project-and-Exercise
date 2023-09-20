interface animal{
    int eyes =2;
    void walk();
}
interface herbivare{

}
class Horse implements  animal, herbivare{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
public class interface_j{
    public  static void main(String[] args){
        Horse horse = new  Horse();
        horse.walk();
    }
}
