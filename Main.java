import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Array gaji pokok berdasarkan golongan
        double[] gaji = {5000000, 6500000, 9500000};

        //Array untuk persentase lembur
        int[] lemburPersen = {30, 32, 34, 36, 38};

        String golongan;
        int jamLembur;
        double gajiPokok = 0;
        double gajiLembur = 0;
        double totalGaji;

        //Format mata uang rupiah
        Locale indonesia = Locale.of("id", "ID");
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(indonesia);

        //input golongan karyawan
        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        golongan = input.next().toUpperCase();

        //IF untuk mengambil gaji dari array
        if (golongan.equals("A")){
            gajiPokok = gaji[0];
        } else if (golongan.equals("B")){
            gajiPokok = gaji[1];
        } else if (golongan.equals("C")){
            gajiPokok = gaji[2];
        }
        else {
            System.out.println("Golongan Tidak Valid!");
            input.close();
            return;
        }

        //input jam lembur
        System.out.print("Masukkan Jumlah Jam Lembur :");
        jamLembur = input.nextInt();

        //IF menentukan Persen Lembur
        if (jamLembur == 1) {
            gajiLembur = gajiPokok * lemburPersen[0] / 100;
        }
        else if (jamLembur == 2) {
            gajiLembur = gajiPokok * lemburPersen[1] / 100;
        }
        else if (jamLembur == 3) {
            gajiLembur = gajiPokok * lemburPersen[2] / 100;
        }
        else if (jamLembur == 4) {
            gajiLembur = gajiPokok * lemburPersen[3] / 100;
        }
        else if (jamLembur >= 5) {
            gajiLembur = gajiPokok * lemburPersen[4] / 100;
        }

        //Operator penjumlahan
        totalGaji = gajiPokok + gajiLembur;

        //output
        System.out.println("\n========== DATA GAJI KARYAWAN==========");
        System.out.println("Golongan     :" + golongan);
        System.out.println("Gaji Pokok   :" + rupiah.format(gajiPokok));
        System.out.println("Jam Lembur   :" + jamLembur);
        System.out.println("Gaji Lembur  :" + rupiah.format(gajiLembur));
        System.out.println("Total Gaji   :" + rupiah.format(totalGaji));

        input.close();

    }
}