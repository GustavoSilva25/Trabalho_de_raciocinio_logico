


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       

        System.out.println("Ordenação de 4 números:");

        Scanner sc = new Scanner(System.in);
        Integer[] numbers = new Integer[4];

        System.out.print("Digite os 4 números: ");

        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }

        int temp;
        int n = numbers.length;
        boolean replace;

        do {
            replace = false;
            for (int i = 0; i < n - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    replace = true;
                }
            }
        } while (replace);

        System.out.print("Sua lista ordenada: ");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }

        sc.close();
    }
}
