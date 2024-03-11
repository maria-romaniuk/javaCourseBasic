package consultation.consulation15;

import java.util.function.Predicate;

public class RequestDemo {
    public static void main(String[] args) {
        Request request =  new Request("Password: ", 250);

//        Predicate<Request> isValid = request -> request.getText().length() <= 10;


        System.out.println();
    }

}
