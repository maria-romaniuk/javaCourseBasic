package homeworks.homework07.task2;

import java.util.Scanner;

public class ScannerMethod {
    public String myText (String message){
        Scanner newScanner = new Scanner(System.in);
        System.out.println(message);
        String text = newScanner.nextLine();
        return text;
    }

}
