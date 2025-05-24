import java.util.Scanner;

public class notdegerlendirme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("0-100 arasında bir not girin: ");
        int not = input.nextInt();

        char harfNot;

        switch (not / 10) {
            case 10: // 100 puan için
            case 9:
                harfNot = 'A';
                break;
            case 8:
                harfNot = 'B';
                break;
            case 7:
                harfNot = 'C';
                break;
            case 6:
                harfNot = 'D';
                break;
            default:
                harfNot = 'F';
        }

        System.out.println("Harf notunuz: " + harfNot);

        input.close();
    }
}

