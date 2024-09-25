package Rational_Number;

public class WithPGCD extends Rational{
    public int pgcd;
    public WithPGCD(int numerator, int denominator) throws UndefinedRational {
        super(numerator, denominator);
        pgcd = WithPGCD.gcd(numerator, denominator);
    }
}
