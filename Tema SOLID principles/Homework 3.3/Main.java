
public class Main {
    public static void main(String[] args) {

        AreaSum a=new AreaSum();
        a.addShape(new Circe(5.0));
        a.addShape(new Square(3.0));
        a.addShape(new Rectangle(2.0,3.5));
        System.out.println(a.sumOfAreas());
    }
}