package lesson4HW;

import java.util.Random;
import java.util.Scanner;

public class XOGameHW {
    static final int SIZE = 3;
    //  static final int DOTS_TO_WIN=3;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Ты победил!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }


            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }

        }

    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }

    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты вашего хода Х У");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x)); //если ячейка занята - повторить ввод координат!
        map[y][x] = DOT_X;

    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;

    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char c) {
       //такой метод работает только для сетки 3х3
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == map[i][SIZE-1] && map[i][j] == map[i][SIZE-2] && map[i][j] == c && map[i][SIZE-1] == c
                        && map[i][SIZE-2] == c) {
                    return true;
                }
                if (map[i][j] == map[SIZE-2][j] && map[i][j] == map[SIZE-1][j] && map[i][j] == c && map[SIZE-2][j] == c &&
                        map[SIZE-1][j] == c) {
                    return true;
                }
                if (map[i][j] == map[SIZE-2][SIZE-2] && map[i][j] == map[SIZE-1][SIZE-1] && map[i][j] == c &&
                        map[SIZE-2][SIZE-2] == c && map[SIZE-1][SIZE-1] == c) {
                    return true;
                }
                if (map[i][SIZE-1] == map[SIZE-2][SIZE-2] && map[i][SIZE-1] == map[SIZE-1][j] && map[i][SIZE-1] == c &&
                        map[SIZE-2][SIZE-2] == c && map[SIZE-1][j] == c) {
                    return true;
                }

            }

        }

        //Здесь пыталась сделать более универсальную проверку для большого поля, но пока затык с количеством элементов
        //в массиве. Сравнение "в лоб" i и j с  i+1 и j+1 пока не помогло.
//        for (int i = 0; i < SIZE-1; i++) {
//           for (int j = 0; j < SIZE-1; j++) {
//           if (map[i][j] == map[i][j+1] && map[i][j] == map[i][j+2] && map[i][j] == c && map[i][j+1] == c && map[i][j+2] == c) {
//               return true;
//           }
//           }
//        }



//        if (map[0][0] == c && map[0][1] == c && map [0][2] == c){
//            return true;
//        }
//        if (map[1][0] == c && map[1][1] == c && map [1][2] == c){
//            return true;
//        }if (map[2][0] == c && map[2][1] == c && map [2][2] == c){
//            return true;
//        }
//        if (map[0][0] == c && map[1][0] == c && map [2][0] == c){
//            return true;
//        }
//        if (map[0][0] == c && map[1][1] == c && map [2][1] == c){
//            return true;
//        }
//        if (map[0][2] == c && map[1][2] == c && map [2][2] == c){
//            return true;
//        }
//        if (map[0][2] == c && map[1][1] == c && map [2][0] == c){
//            return true;
//        }
//        if (map[0][0] == c && map[1][1] == c && map [2][2] == c){
//            return true;
//        }


        return false;

    }


}
