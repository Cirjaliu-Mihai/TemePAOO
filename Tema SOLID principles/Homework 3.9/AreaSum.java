
import java.util.ArrayList;
import java.util.List;

public class AreaSum {
    private List<Shape> shapeList;
    AreaSum(){
        shapeList=new ArrayList<Shape>();
    };

    public void addShape(Shape s)
    {
        shapeList.add(s);
    }
    public double sumOfAreas()
    {
        double sum=0;
        for(Shape s:shapeList)
        {
            sum+=s.getArea();
        }
        return sum;
    }
}
