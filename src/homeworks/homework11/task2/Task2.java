package homeworks.homework11.task2;

import lessons.lesson6.scanner.UserInput;


//проверить является ли число которое ввел пользователь - простым (делится без остатка только на 1 и на себя)


//Простым числом называется натуральное число, большее единицы, которое имеет только два делителя: единицу и самого себя.
// Например, числа 2, 3, 5, 7 и так далее являются простыми, так как они не делятся ни на какие другие числа, кроме себя
// и единицы. В отличие от простых чисел, составные числа имеют больше двух делителей.
//
//Существует несколько способов проверки числа на простоту. Один из самых простых и эффективных способов — это метод
// перебора делителей. С помощью этого метода мы последовательно делим число на все натуральные числа, начиная с 2 и
// заканчивая корнем из числа. Если мы не находим ни одного делителя, то число является простым. Если же находим хотя
// бы один делитель, то число составное

public class Task2 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();
        int number = ui.inputIntiger("Enter your number: ");
        int check = 0;
        boolean checkIsNotEven = true;

        for (int i = 2; i<=number/2; i++){
            check = number%i;
            if (check == 0){
                checkIsNotEven= false;

            }

        }

        if(checkIsNotEven){
            System.out.println("Simple number " + number );
        } else{
            System.out.println("Not simple number" + number);
        }

    }
}
