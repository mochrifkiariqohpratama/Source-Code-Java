import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String golongan;
    int jamLembur;

    double gajiPokok = 0;
    double persenLembur = 0;
    double gajiLembur;
    double totalGaji;

    
    //input
    System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
    golongan = input.nextLine();

    System.out.print("Masukkan Jam Lembur: ");
    jamLembur = input.nextInt();

    //menentukan gaji pokok
    if (golongan.equals("A")) {
        gajiPokok = 5000000;
    } else if (golongan.equals("B")){
        gajiPokok = 6500000;
    } else if (golongan.equals("C")){
        gajiPokok = 9500000;
    } else {
        System.out.println("Golongan tidak valid!");
        input.close();
        return;
    }

    //Menentukan persentase lembur
    if (jamLembur == 1) {
        persenLembur = 0.30;
    } else if (jamLembur == 2) {
        persenLembur = 0.32; 
    } else if (jamLembur == 3) {
        persenLembur = 0.34;
    } else if (jamLembur == 4) {
        persenLembur = 0.36;
    } else if (jamLembur >= 5) {
        persenLembur = 0.38;
    } else {
        persenLembur = 0;
    }

    //Menghitung gaji Lembur
    gajiLembur = gajiPokok*persenLembur;

    //Menghitung total penghasilan
    totalGaji = gajiPokok + gajiLembur;

    //Output
    System.out.println("\n===== HASIL PERHITUNGAN =====");
    System.out.println("Golongan Karyawan : " + golongan);

    System.out.printf("Gaji Pokok : Rp %,.0f\n", gajiPokok);
    System.out.println("jam Lembur :" + jamLembur + "Jam");

    System.out.printf("Gaji Lembur : Rp %,.0f\n", gajiLembur);
    System.out.printf("Total Penghasilan : Rp %,.0f\n", totalGaji);

    input.close();


}

}