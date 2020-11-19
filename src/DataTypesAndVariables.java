/**
 * @author fatihtastemur
 * @created 19/11/2020 - 15:51
 * @project java-101
 */
public class DataTypesAndVariables {

    public static void main(String[] args) {

        byte byteDeger = 4;
        short shortDeger = 7;
        int integerDeger = 234;
        long longDeger = 12332;

        float floatDeger1 = 34.5f;
        float floatDeger2 = 4.5F;
        double doubleDeger = 345.2;

        char charDeger1 = 65;
        char charDeger2 = 'A';

        boolean dogruDeger = true;
        boolean yanlisDeger = false;

        //byte 8-bit
        System.out.println("Byte Değer: " + byteDeger);
        //short 16-bit
        System.out.println("Short Değer: " + shortDeger);
        //integer 32-bit
        System.out.println("Integer Değer: " + integerDeger);
        //long 64-bit
        System.out.println("Long Değer: " + longDeger);

        //float-32 bit
        System.out.println("Float Deger 1: " + floatDeger1);
        System.out.println("Float Deger 2: " + floatDeger2);
        //double 64-bit
        System.out.println("Double Deger: " + doubleDeger);

        //char 16-bit
        System.out.println("Char Deger 1: " + charDeger1);
        System.out.println("Char Deger 2: " + charDeger2);

        System.out.println("Boolean Dogru: " + dogruDeger);
        System.out.println("Boolean Yanlis: " + yanlisDeger);
    }
}
