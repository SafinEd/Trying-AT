package intech;

public class RegularHexagon implements Shape {
    private int side;


    public RegularHexagon(int s) {
        side=s;
    }

    @Override
    public int getPerimeter() {
        return side*6;
    }

    @Override
    public int getSquare() {
        return (int) (3*Math.sqrt(3)*side*side/2);
    }

    @Override
    public String getName() {
        return "Regular Hexagon";
    }
}