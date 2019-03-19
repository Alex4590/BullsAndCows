import java.util.Scanner;

public class BullsAndCows {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сложность игры(3, 4 или 5): ");

        int levelOfComplexity = scan.nextInt();

        boolean checkNumber = chek(levelOfComplexity);

        if (checkNumber) {

            if(levelOfComplexity > 0 && levelOfComplexity < 9) {

                int[] test = generatorNumber(1, 10, levelOfComplexity);

                for (int t :test) {
                    System.out.println(t);
                }

                System.out.print("Введите последовательность цифр длиной " + levelOfComplexity + ": ");
                //int InputUser = scan.nextInt();

                int[] InputUser = {1,2,3,5};

                int count = 0;

                for (int i=0; i < InputUser.length; i++) {

                    // Cheсking to cows
                    if(InputUser[i] == test[i]) {
                        count++;

                        System.out.println(count + " Корова");
                    }
                }

                if (count == 0) {
                    System.out.println("Нет Коров");
                }
            }

        } else {

            System.out.println("Неверно");
        }

    }


    private static boolean chek(int number) {

        if(number == 3 || number == 4 || number == 5) {
            return true;
        } else {
            return false;
        }
    }

    private static int[] generatorNumber(int from, int to, int lenght) {

        int numberAr[] = new int[lenght];

        for(int i=0; i < numberAr.length; i++) {

            int number = from + (int) (Math.random() * to);

            numberAr[i] = number;

        }

        return numberAr;
    }

}