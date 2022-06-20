class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "You can't Enter 5555";
    }
}
class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "You can't Enter 0 and 1";
    }
}
class MaxMultiplyInputException extends Exception{
    @Override
    public String toString(){
        return "Enter the below 50000";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Any Number is not divide by Zero";
    }
}

class customCalculator{
    double add(double a, double b) throws MaxInputException, InvalidInputException {
        if(a>5555 || b>5555){
            throw new MaxInputException();
        }
        else if(a==0 || b==1){
            throw new InvalidInputException();
        }
        return a+b;
    }

    double subtract(double a, double b) throws MaxInputException{
        if(a>5555 || b>5555){
            throw new MaxInputException();
        }
        return a-b;
    }

    double multiply(double a, double b) throws MaxMultiplyInputException{
        if(a>50000 || b>50000){
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }

    double divide(double a, double b) throws CannotDivideByZeroException{
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class CustomClasulatorr {
    public static void main(String[] args) throws MaxInputException,InvalidInputException,MaxMultiplyInputException,CannotDivideByZeroException{
        customCalculator c1 = new customCalculator();
      //  c1.add(5555,5555);
      //  c1.add(0,1);
      //  c1.subtract(50000,500000);
     //   c1.multiply(80000, 800000);
         c1.divide(5, 0);
    }
}
