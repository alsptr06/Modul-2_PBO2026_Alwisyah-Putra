import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        String namaClient;
        double beratBarang;
        int jarakTujuan;
        int totalBox;

        System.out.println("==============================");
        System.out.println(" SISTEM LOGICALC FASTSEND");
        System.out.println("==============================");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Client : ");
        namaClient = input.nextLine();
        System.out.print("Masukkan Berat Barang (kg): ");
        beratBarang = input.nextDouble();
        System.out.print("Masukkan Jarak Tujuan (km): ");
        jarakTujuan = input.nextInt();
        System.out.print("Masukkan Total Box : ");
        totalBox = input.nextInt(); 

        input.close();

        int kapasitasTruk = 150;
        int trukPenuh = totalBox / kapasitasTruk;
        int sisaBox = totalBox % kapasitasTruk;

        double tarifJarak = 15.000;
        double tarifBerat = 5.500;
        double dasarBiaya = (tarifJarak * jarakTujuan) + (tarifBerat * beratBarang);
        double asuransiWajib = 0.035 * dasarBiaya; 
        double totalTagihan = dasarBiaya + asuransiWajib;

        int kecepatan = 60; // km/jam
        int waktuJam = jarakTujuan / kecepatan;
        int waktuMenit = jarakTujuan % kecepatan;


        System.out.println("\n=== RESI PENGIRIMAN ===");
        System.out.println("Klien : " + namaClient);
        System.out.println("Total Box : " + totalBox + " box");
        System.out.println("Kebutuhan Armada: [" + trukPenuh + "] Truk Penuh dan sisa [" + sisaBox + "] box via Pickup.");
        
        System.out.println("\nEstimasi Waktu : [" + waktuJam + "] Jam [" + waktuMenit + "] Menit (Asumsi 60km/jam)");
        
        System.out.println("\n=== RINCIAN BIAYA ===");
        System.out.println("Dasar Biaya : Rp [" + dasarBiaya + "]");
        System.out.println("Asuransi (3.5%) : Rp [" + asuransiWajib + "]");
        System.out.println("\nTOTAL BAYAR : Rp [" + totalTagihan + "]");
    }       
        

        

        
    }

