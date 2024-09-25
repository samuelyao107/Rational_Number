package Rational_Number;

public class UndefinedRational extends Exception{

    public String getError(){
        return "Denominator should not be null";
    }
}
