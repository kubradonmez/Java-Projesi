import java.util.Scanner;

public class kullanicidanverialma {
    public static void main(String[] args) {
        // Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // İsim iste
        System.out.print("Lütfen isminizi girin: ");
        String isim = input.nextLine(); // tüm satırı alır

        // Yaş iste
        System.out.print("Lütfen yaşınızı girin: ");
        int yas = input.nextInt(); // sadece sayıyı alır

        // Sonucu yazdır
        System.out.println("Merhaba " + isim + "! Yaşınız: " + yas);

        // Scanner'ı kapat
        input.close();
    }
}
