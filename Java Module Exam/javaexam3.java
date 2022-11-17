class Shape
{
    void draw()
    {
        System.out.println("Drawing_Shape");
    }
    void erase()
    {
        System.out.println("Erasing  Shape");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
    void erase()
    {
        System.out.println("Erasing Circle");
    }
}
class Triangle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Triangle");
    }
    void erase()
    {
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape
{
    void draw()
    {
        System.out.println("Drawing Square");
    }
    void erase()
    {
        System.out.println("Erasing Square");
    }
}
public class javaexam3 {
    public static void main(String[] args) {
        Circle c=new Circle();
        Triangle t=new Triangle();
        Square s=new Square();
        c.draw();
        t.draw();
        s.draw();
        c.erase();
        t.erase();
        s.erase();
    }
}
