
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class ShapeDrawer {
    private final List<Drawable> shapes = new ArrayList<>();

    public void addShape(Drawable shape) {
        shapes.add(shape);  
    }

    public void drawAllShapes() {
        for (Drawable shape : shapes) {
            shape.draw();          
	}
    }
}


public class Main {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();

        drawer.addShape(new Circle());
        drawer.addShape(new Rectangle());

        drawer.drawAllShapes();
    }
}
