import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Latihan Tipe Data
        String nama = "alwi";
        int sks = 144;
        double ipk = 4.0;
        boolean isLulus = true;

        System.out.println("Nama : " + nama);
        System.out.println("Sks : " + sks + "\ndengan IPK : " + ipk);
        System.out.println("Apakah saya lulus?"+ isLulus);

        //OPERASI BILANGAN 
        int a = 10, b = 2;
        int c = 5, d = 20;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(c + " - " + d + " = " + (c - d));
        System.out.println(c + " * " + d + " = " + (c * d));
        System.out.println(c + " / " + d + " = " + (c / d));
        System.out.println("modulus" + (c%d));

        //INPUT OUTPUT
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nama lengkap : ");
        String nama_lengkap = input.nextLine();
        System.out.println("Masukan tanggal lahir : ");
        int tanggal_lahir = input.nextInt();
        System.out.println("Masukan bulan lahir : ");
        int bulan_lahir = input.nextInt();
        System.out.println("Masukan tahun lahir : " );
        int tahun_lahir = input.nextInt();
        input.close(); 

        System.out.println("nama : "+nama_lengkap +"tanggal lahir : "+ tanggal_lahir + bulan_lahir + tahun_lahir);
    }
}
