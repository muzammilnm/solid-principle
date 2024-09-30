package liskovsubstitution.lsp;  

public class main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        Shape square = new Square(5);
        printArea(rect);
        printArea(square);
    }

    public static void printArea(Shape shape){
        System.out.println("Area: " + shape.area());
    }
}
