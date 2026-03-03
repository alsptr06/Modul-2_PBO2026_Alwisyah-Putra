//Soal No 4 Pemecah Waktu (Time Splitter)
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=========================");
        System.out.println("PROGRAM PECAH WAKTU");
        System.out.println("=========================");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total detik: ");

        int detik = input.nextInt();
        int jam = detik/3600;
        int menit = (detik%3600)/60;
        int detik2 = detik%60;

        System.out.println(jam + " jam " + menit + " menit " + detik2 + " detik");
        input.close();
    }
}
