package edu.guilford;

public class RationalTestMain {
    
        public static void main(String[] args) {
            Rational r1 = new Rational(); // test default constructor
        System.out.println("Testing default constructor:");
        System.out.println("Input: none");
        System.out.println("Expected result: Random rational number with denominator not 0");
        System.out.println("Actual result: " + r1);
        System.out.println(); 

        Rational r2 = new Rational(3, 4); // test parameterized constructor
        System.out.println("Testing parameterized constructor:");
        System.out.println("Input: numerator = 3, denominator = 4");
        System.out.println("Expected result: Rational number with numerator = 3, denominator = 4");
        System.out.println("Actual result: " + r2);
        System.out.println(); 

        r2.negate(); // test negate method
        System.out.println("Testing negate method:");
        System.out.println("Input: " + r2);
        System.out.println("Expected result: Rational number with numerator = -3, denominator = 4");
        System.out.println("Actual result: " + r2);
        System.out.println(); 

        r2.invert(); // test invert method
        System.out.println("Testing invert method:");
        System.out.println("Input: " + r2);
        System.out.println("Expected result: Rational number with numerator = 4, denominator = -3");
        System.out.println("Actual result: " + r2);
        System.out.println(); 

        double d = r2.toDouble(); // test toDouble method
        System.out.println("Testing toDouble method:");
        System.out.println("Input: " + r2);
        System.out.println("Expected result: -1.3333333333333333");
        System.out.println("Actual result: " + d);
        System.out.println(); 

        Rational r3 = new Rational(2, 3); // create another Rational object for testing addition
        Rational sum = r2.add(r3); // test add method
        System.out.println("Testing add method:");
        System.out.println("Input: " + r2 + ", " + r3);
        System.out.println("Expected result: Rational number with numerator = 10, denominator = -9");
        System.out.println("Actual result: " + sum);
        System.out.println(); 
    }
        }
    

