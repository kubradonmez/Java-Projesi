import java.util.Scanner;
public class aritmetikislemler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = input.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = input.nextDouble();

        // İşlemler
        double toplam = sayi1 + sayi2;
        double fark = sayi1 - sayi2;
        double carpim = sayi1 * sayi2;
        double bolum = sayi2 != 0 ? (sayi1 / sayi2) : Double.NaN; // 0'a bölme kontrolü

        // Sonuçları yazdır
        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpım: " + carpim);
        if (sayi2 != 0) {
            System.out.println("Bölüm: " + bolum);
        } else {
            System.out.println("Bölme: Tanımsız (0'a bölünemez)");
        }
        input.close();
    }
}
