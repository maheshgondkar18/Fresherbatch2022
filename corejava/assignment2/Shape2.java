package assignment.com;

class Shapes{
    public static void main(String[] args) {
        Shape2 rectangle =new Rectangle();
        rectangle.draw();
        Shape2 cube = new Cube();
        cube.draw();
        Shape2 line = new Line();
        line.draw();

    }
}


public abstract class Shape2 {
    abstract void draw();
}
class Rectangle extends Shape2{
    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}

class Line extends Shape2{
    @Override
    void draw() {
        System.out.println("Line");
    }
}


class Cube extends Shape2{
    @Override
    void draw() {
        System.out.println("Cube");
    }
}
