import java.util.*;

class ValueOverRangeException extends Throwable{
    ValueOverRangeException(String s){
        super(s);
    }
}

class NegativeValueException extends Throwable{
    NegativeValueException(String s){
        super(s);
    }
}

class CustomException{
    static void NegValue(int num) throws NegativeValueException{
        if(num < 0)
            throw new NegativeValueException("Value can't be negative!");
    }
    static void ValRange(int num) throws ValueOverRangeException{
        if(num>100)
            throw new ValueOverRangeException("Value can't be above 100!");
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num;
        try{
            num = sc.nextInt();
            NegValue(num);
            ValRange(num);
        }
        catch (InputMismatchException e){
            System.out.println("Data other than integer is entered.");
            num = 0;
        }
        catch (NegativeValueException n){
            System.out.println("Negative Value Exception Occured." + n);
            num = 0;
        }
        catch (ValueOverRangeException e) {
            System.out.println("Value Over Range Exception Occured." + e);
            num = 0;
        }
        System.out.println("Entered Value is : " + num);

    }
}
