import java.util.Arrays;

public class Main {
        public static void main(String[] args) {


// п.1
            int[] zerOne = new int[] {1, 0, 0, 1};
            for (int i = 0; i < zerOne.length; i++) {
                if (zerOne[i] == 0) {
                    zerOne[i] += 1;
                    continue;}
                if (zerOne[i] == 1) {
                    zerOne[i] -= 1;
                }
            }
            System.out.println(Arrays.toString(zerOne));




//        //п.2
            int[] fullArr = new int [8];
            fullArr[0] = 0;
            for (int i = 0; i <fullArr.length ; i++) {
                if (i>0)  {fullArr[i]= fullArr[i] + 3*i;}
            }
            System.out.println(Arrays.toString(fullArr));


//        // п. 3
            int[] arr = new int [] {1,5,3,2,11,4,5,2,4,8,9,1};
            for (int i = 0; i <=arr.length-1 ; i++) {
                if (arr[i]<6) {arr[i]*=2;}

            }
            System.out.println (Arrays.toString(arr));

            // п. 4
            int [] [] diagonal = new int [10] [10];
            for (int i = 0; i < diagonal.length; i++) {
                for (int j = 0; j < diagonal[i].length; j++) {
                    if (i==j || (i+j) == diagonal.length-1) {
                        diagonal[i][j] = 1;
                    }
                    System.out.printf ("%d ", diagonal [i][j]);
                }
                System.out.println();


            }

//       //п.5 - minMax. Есть вопрос: когда вызываешь оба метода друг за другом для одного и того же массива, такое ощущение, что во второй
//        //метод принимается уже обработанный массив с "отрезанным" значением. Не поняла, как это лечится. Если запросить мин значение для массива minMax1, ответ будет - 33?
//
            int [] minMax1 = new int[] {12,33,75,99,105};
            int [] minMax = new int[] {12,33,75,99,105};
            printMax(minMax1);
            printMin(minMax);
        }

        static void printMax (int[] minMax) {
            for (int i = 0; i < minMax.length ; i++) {
                if (minMax[i]>minMax[0]) {
                    minMax[0] = minMax [i];
                }
            }
            System.out.println("max значение" + " " + minMax[0]);

        }

        static void printMin(int [] minMax1) {
            for (int i = 0; i < minMax1.length ; i++) {
                if (minMax1[i]< minMax1[0]) {
                    minMax1[0] = minMax1 [i];
                }
            }
            System.out.println("min значение" + " " +  minMax1[0]);

//п. 9 За основу брала для сравнения две суммы элементов массива: 0-ой + 1-ый, и последний+предпоследний. Дальше сопоставляла друг с другом.
            //Java запросил в конце return true (120 строка - не поняла, почему?). Вроде в методе прописано, когда что вернуть.
            //И пока есть путаница, где ставить return (между какими фигурными скобками)...

            int [] aaLl = new int[] {1,1,1,2,1};
            int [] hhG = new int[] {7,0,2,2,1,2};
            int [] xxCC = new int[] {1,2,3,7,9};
            int [] kkGG = new int [] {77, 15, 22, 19, 0 ,2};

            if (analyzeSum(aaLl)) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

        }

        static boolean analyzeSum(int[] arr) {
            int sum = arr[0] + arr[1];
            int sum1 = arr[arr.length-1] + arr[arr.length-2];
            int k = 2;
            int m = 2;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (sum <= sum1) {
                        sum = sum + arr[i + j + 1];
                        k++;
                    }
                    if (sum > sum1) {
                        sum1 = sum1 + arr[arr.length - j - 2];
                        m++;
                    }
                    if (sum == sum1 && (m + k) == arr.length) {
                        return true;
                    } else return false;
                }

            }

            return true;}


    }
    
