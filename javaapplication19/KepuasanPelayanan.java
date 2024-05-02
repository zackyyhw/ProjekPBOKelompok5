/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author Dell
 */
import java.util.Arrays;

public class KepuasanPelayanan {
    // Array untuk menyimpan pertanyaan
    private String[] pertanyaan = {
        " Persyaratan pelayanan yang ditetapkan mudah dipenuhi/disiapkan oleh konsumen.",
        " Prosedur/alur pelayanan yang ditetapkan mudah diikuti/dilakukan.",
        " Jangka waktu penyelesaian pelayanan yang diterima sesuai dengan yang ditetapkan.",
        " Biaya pelayanan yang dibayarkan sesuai dengan biaya yang ditetapkan.",
        " Produk pelayanan yang diterima sesuai dengan yang dijanjikan.",
        " Sarana dan prasarana pendukung pelayanan memberikan kenyamanan",
        " Data BPS mudah diakses melalui fasilitas utama yang digunakan: ............... \n" +"(sesuai Blok 1 Rincian 12).",
        " Petugas pelayanan atau aplikasi pelayanan online merespon dengan baik.",
        " Petugas pelayanan atau aplikasi pelayanan online mampu memberikan informasi yang jelas.",
        " Keberadaan fasilitas pengaduan PST mudah diketahui. \n" +
        " (contoh: Kotak saran dan pengaduan, website https://pengaduan.bps.go.id, e-mail bpshq@bps.go.id).",
        " Ditanyakan jika responden pernah melakukan pengaduan (B1R14 berkode 1),\n" +
        " Proses penanganan pengaduan PST mudah diketahui, jelas, dan tidak berbelit-belit.",
        " Tidak ada diskriminasi dalam pelayanan.",
        " Tidak ada penerimaan imbalan di luar ketentuan yang sudah ditetapkan dalam pelayanan.",
        " Tidak ada pungutan liar (pungli) dalam pelayanan",
        " Tidak ada praktik percaloan dalam pelayanan.",
    };
    private int[] kepentingan;
    private int[] kepuasan;

    // Konstruktor untuk inisialisasi dengan kepentingan dan kepuasan
    public KepuasanPelayanan(int[] kepentingan, int[] kepuasan) {
        this.kepentingan = kepentingan;
        this.kepuasan = kepuasan;
         }

    // Metode untuk menampilkan pertanyaan, kepentingan, dan kepuasan
    public void tampilkanBlok2() {
        System.out.println(
                "\n===========================================================================================================================================" +
                "\n                                                             ISIAN BLOK II                                                                  " +
                "\n===========================================================================================================================================" );
        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println((i + 1) + ".Kondisi Pelayanan" + pertanyaan[i]);
            System.out.println("Tingkat Kepentingan " + ": " + kepentingan[i]);
            System.out.println("Tingkat Kepuasan " + "   : " + kepuasan[i] + "\n");
        }
    }
    public int[] getKepentingan() {
        return kepentingan;
    }

    // Metode untuk mengambil kepuasan
    public int[] getKepuasan() {
        return kepuasan;
    }
}
