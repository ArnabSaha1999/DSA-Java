package JavaBasics;
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = 10000;
        int intValue = 100000;
        long longValue = 100000L;

        System.out.println("------------Integer Types------------");
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value: " + longValue);

        System.out.println();

        System.out.println("Byte Min Value: " + Byte.MIN_VALUE);
        System.out.println("Byte Max Value: " + Byte.MAX_VALUE);
        System.out.println("Short Min Value: " + Short.MIN_VALUE);
        System.out.println("Short Max Value: " + Short.MAX_VALUE);
        System.out.println("Integer Min Value: "  + Integer.MIN_VALUE);
        System.out.println("Integer Max Value: " + Integer.MAX_VALUE);
        System.out.println("Long Min Value: " + Long.MIN_VALUE);
        System.out.println("Long Max Value: " + Long.MAX_VALUE);

        float floatValue = 10.123456789f;
        double doubleValue = 20.13456789;

        System.out.println();
        System.out.println("------------Decimal Point Types------------");
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);

        System.out.println();

        System.out.println("Float Min Value: " + Float.MIN_VALUE);
        System.out.println("Float Max Value: " + Float.MAX_VALUE);
        System.out.println("Double Min Value: " + Double.MIN_VALUE);
        System.out.println("Double Max Value: " + Double.MAX_VALUE);
        
        char charValue = 'A';
        System.out.println();
        System.out.println("------------Character Type------------");
        System.out.println("Character Value: " + charValue);
        System.out.println("Character Code: " + (int) charValue);

        System.out.println();

        System.out.println("Character Min Value: " + (int) Character.MIN_VALUE);
        System.out.println("Character Max Value: " + (int) Character.MAX_VALUE);

        boolean booleanValue = true;
        System.out.println();
        System.out.println("------------Boolean Type------------");
        System.out.println("Boolean Value: " + booleanValue);

        System.out.println();

        System.out.println("------------Type Information------------");
        System.out.println("Size of byte: " + Byte.SIZE + " bits");
        System.out.println("Size of short: " + Short.SIZE + " bits");
        System.out.println("Size of int: " + Integer.SIZE + " bits");
        System.out.println("Size of long: " + Long.SIZE + " bits");
        System.out.println("Size of float: " + Float.SIZE + " bits");
        System.out.println("Size of double: " + Double.SIZE + " bits");
        System.out.println("Size of char: " + Character.SIZE + " bits");

        System.out.println();
        System.out.println("------------Implicit Type Casting Example------------");
        
        byte byteValue2 = 10;
        short shortValue2 = byteValue2;
        int intValue2 = shortValue2;
        long longValue2 = intValue2;
        float floatValue2 = longValue2;
        double doubleValue2 = floatValue2;

        System.out.println("Byte Value: " + byteValue2);
        System.out.println("Short Value: " + shortValue2);
        System.out.println("Integer Value: " + intValue2);
        System.out.println("Long Value: " + longValue2);
        System.out.println("Float Value: " + floatValue2);
        System.out.println("Double Value: " + doubleValue2);

        System.out.println();
        System.out.println("------------Explicit Type Casting Example------------");
        double doubleValue3 = 157.78;
        float floatValue3 = (float) doubleValue3;
        long longValue3 = (long) floatValue3;
        int intValue3 = (int) longValue3;
        short shortValue3 = (short) intValue3;
        byte byteValue3 = (byte) shortValue3;

        System.out.println("Double Value: " + doubleValue3);
        System.out.println("Float Value: " + floatValue3);
        System.out.println("Long Value: " + longValue3);
        System.out.println("Integer Value: " + intValue3);
        System.out.println("Short Value: " + shortValue3);
        System.out.println("Byte Value: " + byteValue3);
        
        System.out.println("------------Integer Overflow Example------------");
        int maxInt = Integer.MAX_VALUE;
        int overflowInt = maxInt + 1;
        System.out.println();
        System.out.println("Max Integer Value: " + maxInt);
        System.out.println("Overflowed Integer Value: " + overflowInt);

    
    }
}
