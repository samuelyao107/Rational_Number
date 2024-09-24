package Rational_Number;

public class Rational {
    public int numerator;
    public int denominator;

    public Rational(int numerator, int denominator){
        this.numerator = numerator/ gcd(numerator, denominator);
        this.denominator = denominator/gcd(numerator, denominator);
    }

    private static int gcd(int a, int b) {
        for(int i = Math.min(a, b); i > 0; i--){
            if(a % i == 0 && b % i == 0) return i;
        }
        return 1;// never reach but make function compilable
    }

    @Override
    public String toString(){
        return "Numerator: "+ this.numerator+" and Denomintor "+ this.denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Rational r = (Rational) obj;
        return Double.compare(numerator, r.numerator) == 0
                && Double.compare(denominator, r.denominator) == 0;
        }

        public static Rational Add(Rational r1, Rational r2){
          int numerator = (r1.numerator * r2.denominator + r1.denominator * r2.numerator);
          int denominator = r1.denominator * r2.denominator;
          return new Rational(numerator, denominator);
        }

        public static Rational Multiply(Rational r1, Rational r2){
           int numerator = r1.numerator * r2.numerator;
           int denominator = r1.denominator * r2.denominator;

           return new Rational(numerator,denominator);
        }

        public static Rational Opposed(Rational r){
          return new Rational(-r.numerator, r.denominator);
        }








}
