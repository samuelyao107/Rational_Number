import Rational_Number.Rational;


public class Main {
    public static void main(String[] args) {

        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(2,0);

        Rational r3 = Rational.Add(r1,r2);

       String p=  r3.toString();
       System.out.println(p);

    }
}