import java.util.Scanner;

/**
 * Kelas HitungNilaiUTS digunakan untuk menghitung nilai Ujian Tengah Semester (UTS)
 * berdasarkan bobot dari komponen kehadiran, tugas, dan ujian.
 */
public class HitungNilaiUTS {

    /**
     * Metode utama yang mengeksekusi program.
     * Meminta input nilai dari komponen kehadiran, tugas, dan ujian, lalu menghitung
     * nilai UTS berdasarkan bobot yang telah ditentukan.
     *
     * @param args argumen baris perintah yang tidak digunakan di program ini.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai kehadiran (0-100): ");
        double nilaiKehadiran = scanner.nextDouble();

        System.out.print("Masukkan nilai tugas (0-100): ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan nilai ujian (0-100): ");
        double nilaiUjian = scanner.nextDouble();

        double bobotKehadiran = 0.2;
        double bobotTugas = 0.3;
        double bobotUjian = 0.5;

        double nilaiUTS = (nilaiKehadiran * bobotKehadiran) + (nilaiTugas * bobotTugas) + (nilaiUjian * bobotUjian);

        System.out.printf("Nilai UTS: %.2f\n", nilaiUTS);
        scanner.close();
    }
}
