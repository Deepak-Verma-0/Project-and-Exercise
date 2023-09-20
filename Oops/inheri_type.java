// single level  inheritance
class shape{
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

// multi leve inheritance

class shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}
class EquilateraalTriangle extends Triangle{
    public void area (int l, int  h){
        System.out.println(1/2*l*h);
    }
}

//hierachial inheritance
//          base class
//  derived class   derived  class

class shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}
class circle extands Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

//Hybrid inheritance
// in hybrid inheritance make all inheritance called the hybrid