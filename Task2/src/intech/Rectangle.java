package intech;

public class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle(int h, int w) {
        height=h;
        width=w;
    }

    @Override
    public int getPerimeter() {
        return height+width;
    }

    @Override
    public int getSquare() {
        return height*width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
