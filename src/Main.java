import Rational_Number.Rational;
import Rational_Number.UndefinedRational;
import Rational_Number.WithPGCD;


public class Main {
    public static void main(String[] args) {
        try{
            Rational r1 = new Rational(1,2);
            Rational r2 = new Rational(2,3);
            Rational r3 = r1.Add(r2);
            String p=  r3.toString();
            System.out.println(p);

            Rational r4 = new WithPGCD(1,4);
            WithPGCD r4WithPGCD = (WithPGCD) r4;
            System.out.println(r4WithPGCD.pgcd);

        }catch(UndefinedRational err){
            System.out.println(err.getError());

        }





    }
}