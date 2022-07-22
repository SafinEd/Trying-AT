//1. Реализовать интерфейс «Фигура». Интерфейс содержит сигнатуры трех методов. Первый метод возвращает периметр фигуры типом int. Второй метод возвращает площадь фигуры типом int. Третий метод возвращает имя фигуры типом String.
//        2. Создать три (квадрат, прямоугольник, правильный шестиугольник) класса, которые реализуют интерфейс фигура.
//        3. В классах должен быть конструктор, который на вход принимает все необходимые параметры (стороны, имя и т.д.)
//        4. Создать Main класс, в котором в методе public static void main(String[] args) {} создать все три класса и вывести на печать результаты выполнения методов.
//
//        P.S.
//        Оказалось достаточно сложно придумать задание на "классы". Если окажется слишком легко дайте знать, попробую придумать что-нибудь еще.
//
//        В качестве справочного руководства можно использовать "Герберт Шилдт Java. Полное руководство" глава 6 и 9 или любой другой источник.
//
//        https://www.youtube.com/watch?v=uDN75SRyUzI

package intech;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Shape> shapes = new ArrayList<>();
        Shape shape = new Square(2);
        shapes.add(shape);
        shapes.add(new Rectangle(3,4));
        shapes.add(new RegularHexagon(9));

        printShapes(shapes);
    }
    public static void printShapes(ArrayList<Shape> shapes) {
        for(Shape shape : shapes) {
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Square: " + shape.getSquare());
            System.out.println("Name: " + shape.getName());
        }
    }
}