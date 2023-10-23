public class c_class{

        int age=21;
        int weight=56;
    
    void eat()
    {
        System.out.println("I'm eating");
    }
    void sleep()
    {
        System.out.print("I'm sleeping");
    }

    public static void  main(String[] args){
        c_class p=new c_class();
        System.out.println(p.age);
        System.out.println(p.weight);
        p.eat(); p.sleep();
    }
}