public class G01_JavaDataTypes{
    public static void main(String[] args){
//        byte:
//        Min value: -128
//        Max Value: 127
        byte b = 10;
        System.out.println("byte: " + b);

//        short:
//        Min Value: -32,768
//        Max value: 32,767
        short s = 10000;
        System.out.println(Short.MAX);

//        int:
//        Min Value: -2,147,483,648 (-2^31)
//        Max Value: 2,147,483,647 (2^31 - 1)
        int i = 2_147_483_647;

//        long:
//        Min Value: -9,223,372,036,854,775,808 (-2^63)
//        Max Value: 9,223,372,036,854,775,807 (2^63-1)
        long l 65465465465L;

//        float: 32-bits IEEE floating points (single precision)
//        Min Value: 1.4E-45
//        Max Value: 3.4028235E38
        float f = 1.25F;  // or f

//        double: 64-bits IEEE floating points (double precision)
//        Min Value: 4.9E-324
//        Max Value: 1.7976931348623157E308
        double d = 1.25;  // or 1.25D (not needed)

        // char: character or unicode
        char c = 'c';

        //boolean: true or false
        boolean bool = false;
    }
}