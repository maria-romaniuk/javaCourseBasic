package homeworks.homework07.task1;

public class StringDemo {
    public static void main(String[] args) {

    String myStr = new String("I study Basic Java!");

        System.out.println(myStr.charAt(myStr.length() - 1));

        System.out.println("==========================");

        //работа с методом

        StringMethod methodWithText = new StringMethod("I study Basic Java!");
        methodWithText.strMethod();
        methodWithText.checkWord();
        methodWithText.replaceLetter();
        methodWithText.upperCase();
        methodWithText.lowerCase();
        methodWithText.sub();




    }

}
