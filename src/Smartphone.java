import java.util.Random;

/**
* This is the SmartPhone Class, holding the basic methods and functionalities of the Smartphone.
* sellingPrice : noun -> variable
* input : recipient's contact number (long), text message to be sent (String)
* output : sent confirmation (boolean)
*/
public class Smartphone {

    private static boolean sendMessage(long[] recipientContactNumbers, String textMessage) {
        return false;
    }

    /*
    Polymorphism -> Changing the behaviour of a method based on it's input.
    How we can achieve polymorphism:
        1. we can change the number of parameters.
        2. we can change the order of the parameters.
        3. we can change the data type of the parameters.


        ** Changing the return type does not result in polymorphism. **
     */

    public void poly(){
    }

    public void poly(String abc){
    }

    public void poly(String abc, Integer pqr){
    }

    public static void main(String[] args) {
        long[] recipientContactNumber = {
                123456789L, 987654321L, 125478963L
        };

        boolean wereTheMessageSent =
                sendMessage(
                        recipientContactNumber,
                        "Hello!"
                );

        Smartphone sm1 = new Smartphone();

        sm1.poly(); //Hit Ctrl + P to see the parameter List of the method.

    }
}
