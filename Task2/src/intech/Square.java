package intech;

public class Square implements Shape {
    private int side;
    public Square (int s){
        side=s;

    }

    @Override
    public int getPerimeter() {
        return side+side;
    }

    @Override
    public int getSquare() {
        return side*side;
    }

    @Override
    public String getName() {
        return "Square";
    }
}
