class pen{
    String color;
    String type;//ballpoint,gel

    public void write(){
        System.out.println("Write  something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
public class classe{
    public static void main(String[] args)
    {
        pen pen1  = new pen();
        pen1.color ="blue";
        pen1.type = "gel";

        pen1.write();
        pen pen2 =new pen();
        pen2.color="black";
        pen2.type= "ballpoint";
        pen1.printcolor();
    }
}