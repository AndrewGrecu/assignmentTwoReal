package edu.guilford;

import java.util.Random;

public class Rational {
    private int numerator;
    private int denominator;
    
    //constructor that takes no arguments and sets the numerator to 0 and denominator to 1
    public Rational(){
        Random rand = new Random();
        numerator = rand.nextInt(201) - 100; // range [-100, 100]
        denominator = rand.nextInt(201) - 100; // range [-100, 100]
        while (denominator == 0) {
            denominator = rand.nextInt(201) - 100; // select new random denominator if it's 0
        }
    }
    
    //constructor that takes two arguments and sets the numerator and denominator
    public Rational(int num, int den) {
        if (den == 0) {
            System.out.println("Warning: Denominator cannot be 0. Setting denominator to 1.");
            denominator = 1;
        } else {
            numerator = num;
            denominator = den;
        }
    }
    
    //method that reverses the sign of the rational number
    //since this method modifies the existing attributes, its return type should be void
    public void negate(){
        numerator = -numerator;
    }
    
    //method that swaps the numerator and denominator
    public void invert(){
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }
    
    //toString method that displays the Rational object in a reasonable format
    public String toString(){
        return numerator + "/" + denominator;
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public Rational add(Rational other) {
        int num = numerator * other.denominator + other.numerator * denominator;
        int den = denominator * other.denominator;
        return new Rational(num, den);
    }
    
}
    

