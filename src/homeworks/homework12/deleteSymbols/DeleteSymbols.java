package homeworks.homework12.deleteSymbols;


//Задание 1. У вас есть текст
//
//Требуется:
//
//убрать все специальные символы, такие "(", ")", "@" (методом replaceAll не пользоваться)


import lessons.lesson6.scanner.UserInput;

public class DeleteSymbols {
    public String change(String text){
        String changedText = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isNotSpecial = checkSymbol(currentChar);
            if (isNotSpecial) {
                changedText = changedText + currentChar;
            }
        }

        return changedText;
    }

    private boolean checkSymbol(char currentChar){

        boolean checkResult = true;

        if (currentChar == '(') { checkResult = false;}
        if (currentChar == ')') { checkResult = false;}
        if (currentChar == '@') { checkResult = false;}
        if (currentChar == '!') { checkResult = false;}
        if (currentChar == '&') { checkResult = false;}
        if (currentChar == '%') { checkResult = false;}

        return checkResult;
    }


}
