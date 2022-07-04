// Каждое задание реализовать в отдельном классе. В начале класса используя “//” или “/**/” написать комментарий с описанием задачи.
// Циклы
// 1. Объявить переменные всех вам известных типов и вывести их значения на экран.

package INTECH;

public class Cycles_1_1_Variables {
    // byte 127;        //8 bit or 1 byte
    // short 32767;     //16 bit or 2 byte
    // int 2147483647;   //32 bit or 4 byte
    // long 9223372036854775807L;    //64 bit or 8 byte

    // char 'a';        //16 bit

    // float 123.4f;     //32 bit
    // double 123.4;     //64 bit

    // boolean true;    //true or false

    static byte a = 126;
    static short b = 667;
    static int c = 2_146_445_668;
    static long d = 3_349_339_393_989L;

    static char e = 'c';

    static float f = 7.12665487f;
    static double g = 6.245566992522;

    static boolean h = true;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
