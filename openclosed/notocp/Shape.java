package openclosed.notocp;

public class Shape {
    private ShapeType shapeType;
    private double radius;
    private double width;
    private double height;

    public Shape(ShapeType shapeType){
        this.shapeType = shapeType;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double heigth){
        this.height = heigth;
    }

    // if you need to add a new shape (e.g., a triangle), you have to modify the Shape class. This violates OCP because the class isn't closed for modification.
    public double calculateArea(){
        switch (shapeType) {
            case CIRCLE:
                return Math.PI * radius * radius;
            case RECTANGLE:
                return width * height;
            default:
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
