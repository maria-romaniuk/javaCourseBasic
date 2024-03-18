package homeworks.homework38.task1;

public class Task1Demo {
    public static void main(String[] args) {
        Task1<String> toUpper= str -> str.toUpperCase();

        String str = "touppercase";
        String result = toUpper.toUppercase(str);

        System.out.println(str);
        System.out.println(result);

    }
}
