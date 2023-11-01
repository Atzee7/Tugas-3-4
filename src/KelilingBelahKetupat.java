import java.util.Scanner;
public class KelilingBelahKetupat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi belah ketupat: ");
        double sisi = input.nextDouble();

        double keliling = 4 * sisi;

        System.out.println("Keliling belah ketupat adalah: " + keliling);
    }
}