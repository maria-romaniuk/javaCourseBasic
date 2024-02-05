package homeworks.homework06.task2;

public class Task2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
            ScannerMethod wordOne = new ScannerMethod();
            String word1 = wordOne.myText("Введите первое слово:");

            ScannerMethod wordTwo = new ScannerMethod();
            String word2 = wordTwo.myText("Введите второе слово:");

        System.out.println("Введенные слова: " + word1 + " " + word2);

        int middleIndexSecondWord = (int) Math.ceil(word2.length() / 2.0);
        String secondPartWord = word2.substring(middleIndexSecondWord);

        String finalWord = word1.substring(0, word1.length()/2) + secondPartWord;
        System.out.println("Объединенные слова: " + finalWord);

//        int even = finalWord.length();
//        System.out.println(even);

    }
}
