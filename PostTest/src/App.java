import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===========================");
        System.out.println("KALKULATOR PAYROLL");
        System.out.println("===========================");

        String namaKaryawan;
        double gajiPokok;
        int jamLembur;

        Scanner input = new Scanner(System.in);
        System.out.print("Input Nama Karyawan :");
        namaKaryawan = input.nextLine();
        System.out.print("Input gaji pokok :");
        gajiPokok = input.nextDouble();
        System.out.print("Input jam lembur :");
        jamLembur = input.nextInt();

        double upahLemburPerJam = gajiPokok / 173;
        double totalUangLembur = jamLembur * upahLemburPerJam;
        double gajiKotor = gajiPokok + totalUangLembur;
        double bpjs = 0.01 * gajiPokok;
        double pajak = 0.05 * gajiKotor;  // TAMBAHKAN INI
        double gajiBersih = gajiKotor - pajak - bpjs;

        System.out.println("\n=== SLIP GAJI ===");
        System.out.printf("Karyawan : %s\n", namaKaryawan);
        System.out.printf("Upah Lembur/Jam : Rp %.2f\n", upahLemburPerJam);
        System.out.printf("Total Uang Lembur : Rp %.2f\n", totalUangLembur);
        System.out.printf("Gaji Kotor : Rp %.2f\n", gajiKotor);
        System.out.printf("Pajak (5%%) : Rp %.2f\n", pajak);
        System.out.printf("BPJS (1%%) : Rp %.2f\n", bpjs);
        System.out.printf("Gaji Bersih : Rp %.2f\n", gajiBersih);




        input.close();
        
    }
}
