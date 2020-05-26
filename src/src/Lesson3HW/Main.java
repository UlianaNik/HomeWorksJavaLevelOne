package Lesson3HW;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static Random random;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        random = new Random();

        System.out.println("Играем в \"Угадай число от 0 до 9?\"");
        guessNumber();
        askYes();
// ВОПРОС? Если по askYes пройтись циклом While, то игра будет непрерывной даже когда будет введен 0 с клавиатуры.
        //Как в этом случае цикл остановить?


   }
    public static void guessNumber () {
        int randomNumber = random.nextInt(10);
        int count = 3;
        System.out.println("Введите число от 0 до 9");
        for (int i = 1; i <= 3; i++) {
            int userNumber = sc.nextInt();
            if (randomNumber > userNumber) {
                count--;
                System.out.println("Число больше введенного Вами, попробуйте еще. У вас" + " " + count + " " + "попыток");

            }
            if (randomNumber < userNumber) {
                count--;
                System.out.println("Число меньше введенного Вами, попробуйте еще. У вас" + " " + count + " " + "попыток");

            }

            if (randomNumber == userNumber) {
                System.out.println("Вы угадали!");
                break;
            }
        }

    }

// Хотелось бы добавить условие, когда, например, по ошибке вводится НЕ 0 и НЕ 1, то программа бы попросила ввести заново
    //значения да или нет. Подскажите, пожалуйста? Цикл в цикле?
        public static void askYes () {
            System.out.println("Сыграем еще? Да - 1, Нет - 0");
           int x = sc.nextInt();

            while (true) {
            if (x == 1) {
               guessNumber();
                break;
                            }
            if (x == 0){
                System.out.println("Игра окончена. Всего доброго!");
                        break;}
            if (x!= 0 || x!=1) System.out.println("Повторите ввод. 1- да, 0 - нет");
            //вот здесь хотелось бы его заставить снова ввести 1 или 0 и запустить игру...совсем запуталась
            break;
            }

            }

        }





