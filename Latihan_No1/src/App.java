//Soal No 3
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double hargaA = 25.500;
        double hargaB = 14.200;
        
        Scanner input = new Scanner(System.in);
        System.out.println("MESIN KASIR UNIVERSITAS PERTAMINA");
        System.out.println("==================================");
        System.out.println("Masukan jumlah barang A yang dibeli : ");
        int jumlahA = input.nextInt();
        System.out.println("Masukan jumlah barang B yang dibeli : ");
        int jumlahB = input.nextInt();
        System.out.println("Masukan jumlah Uang yang dibayarkan : ");
        int uang = input.nextInt();
        double total = (jumlahA * hargaA) + (jumlahB * hargaB);
        double kembalian = uang - total;
        System.out.println("Total harga yang harus dibayar : " + total);
        System.out.println("Total kembalian : " + kembalian);
        System.out.println("==================================");

        input.close();
    }
}
