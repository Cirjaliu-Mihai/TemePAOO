
public class Circe implements Shape{
    private double radius;
    Circe(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
