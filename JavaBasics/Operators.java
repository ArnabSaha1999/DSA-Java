package JavaBasics;
public class Operators {
    public static void main(String[] args) {
        System.out.println("------------Arithmetic Operators------------");
        int a = 23;
        int b = 10;
        System.out.println("Addition: (" + a + " + " + b + ") = " + (a + b));
        System.out.println("Subtraction: (" + a + " - " + b + ") = " + (a - b));
        System.out.println("Multiplication: (" + a + " * " + b + ") = " + (a * b));
        System.out.println("Division: (" + a + "/ " + b + ") = " + (a / b));
        System.out.println("Modulus: (" + a + " % " + b + ") = " + (a % b));

        System.out.println();

        double c = 23.0;
        double d = 10.0;
        System.out.println("Addition: (" + c + " + " + d + ") = " + (c + d));
        System.out.println("Subtraction: (" + c + " - " + d + ") = " + (c - d));
        System.out.println("Multiplication: (" + c + " * " + d + ") = " + (c * d));
        System.out.println("Division: (" + c + "/ " + d + ") = " + (c / d));
        System.out.println("Modulus: (" + c + " % " + d + ") = " + (c % d));
        
        System.out.println();

        System.out.println("------------Unary Operators------------");
        int e = 5;
        System.out.println("Original Value: " + e);
        System.out.println("Negation: " + (-e));
        System.out.println("Positive: " + (+e));
        System.out.println("Post-Increment: " + (e++));
        System.out.println("Value after Post-Increment: " + e);
        System.out.println("Pre-Increment: " + (++e));
        System.out.println("Value after Pre-Increment: " + e);
        System.out.println("Post-Decrement: " + (e--));
        System.out.println("Value after Post-Decrement: " + e);
        System.out.println("Pre-Decrement: " + (--e));
        System.out.println("Value after Pre-Decrement: " + e);
        System.out.println("Logical NOT: " + (!true));

        System.out.println();

        System.out.println("------------Assignment Operators------------");
        int value = 43;
        System.out.println("Original Value: " + value);
        value += 5;
        System.out.println("After += 5: " + value);
        value -= 3;
        System.out.println("After -= 3: " + value);
        value *= 2;
        System.out.println("After *= 3: " + value);
        value /= 4;
        System.out.println("After /= 4: " + value);
        value %= 3;
        System.out.println("After %= 3: " + value);
        
        System.out.println();
        System.out.println("------------Relational/Comparison Operators------------");
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        System.out.println();
        System.out.println("------------Logical Operators------------");
        boolean isJava = true;
        boolean isEasy = false;
        System.out.println("isJava = " + isJava + ", isEasy = " + isEasy);
        System.out.println("isJava && isEasy: " + (isJava && isEasy));
        System.out.println("isJava || isEasy: " + (isJava || isEasy));
        System.out.println("!isJava: " + (!isJava));

        System.out.println();
        System.out.println("------------Short-Circuit Operators------------");
        int age = 25;
        boolean isAdult = (age >= 18) && (age <= 60);
        System.out.println("Age = " + age);
        System.out.println("Is Adult: " + isAdult);

        System.out.println();
        System.out.println("------------Ternary Operator------------");
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number = " + number);
        System.out.println("Result: " + result);

        int marks = 85;
        String grade = 
            marks >= 90 ? "A+" :
            marks >= 80 ? "A" :
            marks >= 70 ? "B" :
            marks >= 60 ? "C" :
            marks >= 50 ? "D" : "F";
        System.out.println("Marks = " + marks);
        System.out.println("Grade: " + grade);

        System.out.println();
        System.out.println("------------Instance of Operator------------");

        String str = "Hello, World!";
        if (str instanceof String) {
            System.out.println("The variable 'str' is an instance of the String class.");
        } else {
            System.out.println("The variable 'str' is NOT an instance of the String class.");
        }
        int num = 42;
        if (Integer.valueOf(num) instanceof Integer) {
            System.out.println("The variable 'num' is an instance of the Integer class.");
        } else {
            System.out.println("The variable 'num' is NOT an instance of the Integer class.");
        }

        System.out.println();
        System.out.println("------------Operator Precedence------------");
        int result1 = 10 + 5 * 2; // Multiplication has higher precedence than addition
        System.out.println("10 + 5 * 2 = " + result1);
        int result2 = (10 + 5) * 2; // Parentheses change the order of evaluation
        System.out.println("(10 + 5) * 2 = " + result2);
        int result3 = 10 - 5 + 2; // Left to right evaluation for operators of the same precedence
        System.out.println("10 - 5 + 2 = " + result3);
        int result4 = 10 - (5 + 2); // Parentheses change the order of evaluation
        System.out.println("10 - (5 + 2) = " + result4);   
        
        System.out.println();
        System.out.println("------------Mixed Operators------------");
        int mixedResult = 10 + 5 * 2 - 3 / 1; // Multiplication and division have higher precedence than addition and subtraction
        System.out.println("10 + 5 * 2 - 3 / 1 = " + mixedResult);
        int mixedResult2 = (10 + 5) * (2 - 3) / 1; // Parentheses change the order of evaluation
        System.out.println("(10 + 5) * (2 - 3) / 1 = " + mixedResult2);

        System.out.println();
        System.out.println("------------Integer Division Operators------------");
        int numerator = 7;
        int denominator = 3;
        System.out.println("Numerator = " + numerator + ", Denominator = " + denominator);
        System.out.println("Integer Division: " + (numerator / denominator));
        System.out.println("Floating-point Division: " + ((double) numerator / denominator));
    }
}
