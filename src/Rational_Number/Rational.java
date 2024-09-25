package Rational_Number;

public class Rational {
    public int numerator;
    public int denominator;

    public Rational(int numerator, int denominator) throws UndefinedRational {
        if(denominator == 0) throw new UndefinedRational();
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator/ gcd;
        this.denominator = denominator/gcd;
    }

    public static int gcd(int a, int b) {
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

        public Rational Add( Rational r2){
         try{
             int numerator = (this.numerator * r2.denominator + this.denominator * r2.numerator);
             int denominator = this.denominator * r2.denominator;
             return new Rational(numerator, denominator);
         }catch(UndefinedRational err){
             System.out.println(err.getError());
             return null;
         }

        }

        public Rational Multiply(Rational r2){
           try{
               int numerator = this.numerator * r2.numerator;
               int denominator = this.denominator * r2.denominator;
               return new Rational(numerator,denominator);
           }catch(UndefinedRational err){
               System.out.println(err.getError());
               return null;
           }

        }

        public Rational Opposed(){
        try{
            return new Rational(-this.numerator, this.denominator);
        }catch(UndefinedRational err){
            System.out.println(err.getError());
            return null;
        }

        }








}
