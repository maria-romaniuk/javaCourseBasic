package homeworks.homework07.task1;

public class StringMethod {
    String myStr;

    public StringMethod(String s) {
        this.myStr = s;
    }

    public char strMethod(){
        System.out.println(myStr);
        char lastSymbol = myStr.charAt(myStr.length() - 1);
        System.out.println("Последний символ: " + lastSymbol);
        return lastSymbol;
    }

    public boolean checkWord(){
        boolean check = myStr.contains("Java");
        System.out.println("слово Java а тексте: " + check);
        return check;
    }

    public String replaceLetter(){
        String replace = myStr.replace("a","o");
        System.out.println("Замена всех букв а на о: " + replace);
        return  replace;
    }

    public String upperCase(){
        String upper = myStr.toUpperCase();
        System.out.println("Верхний регистр: " + upper);
        return upper;
    }

    public String lowerCase(){
        String lower = myStr.toLowerCase();
        System.out.println("Нижний регистр: " + lower);
        return lower;
    }

    public String sub(){
        int indexStart = myStr.indexOf("J");
//      String sub = myStr.substring(myStr.indexOf("Java"));
        String sub = myStr.substring(indexStart,myStr.length()-1);
        System.out.println("Вырезали часть текста: " + sub);
        return sub;
    }
}
