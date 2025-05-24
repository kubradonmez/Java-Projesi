import java.util.Scanner;

public class sayitekmiciftmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Çift sayı");
        } else {
            System.out.println("Tek sayı");
        }

        input.close();
    }
}

