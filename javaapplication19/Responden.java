/*
KELOMPOK 5

222212612 Fiona Audia Nauli Sihombing
222212775 M.Zacky Hetta Warman
222212915 Wilfa Afriyani
222212934 Zharifah Dhiya Ayu Alistin
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Responden {

    private String  namaResponden;
    private int tahunLahir; 
    private String email;
    private String nomorHp;
    private int jenisKelamin;
    private int pendidikan;
    private int pekerjaan; 
    private String namaInstansi; 
    private int katInstansi; 
    private int pemanfaatan; 
    private int jenisLayanan; 
    private int fasilitas; 
    private int dataRujukan; 
    private int pengaduanPST; 
    private KepuasanPelayanan kepuasanPelayanan; 
    private DataDibutuhkan dataDibutuhkan; 

    public Responden() {
    }

    public Responden(String namaResponden, int tahunLahir, String email, String nomorHp, int jenisKelamin, int pendidikan, int pekerjaan, String namaInstansi, int katInstansi, int pemanfaatan, int jenisLayanan, int fasilitas, int dataRujukan, int pengaduanPST) {
        this.namaResponden = namaResponden;
        this.tahunLahir = tahunLahir;
        this.email = email;
        this.nomorHp = nomorHp;
        this.jenisKelamin = jenisKelamin;
        this.pendidikan = pendidikan;
        this.pekerjaan = pekerjaan;
        this.namaInstansi = namaInstansi;
        this.katInstansi = katInstansi;
        this.pemanfaatan = pemanfaatan;
        this.jenisLayanan = jenisLayanan;
        this.fasilitas = fasilitas;
        this.dataRujukan = dataRujukan;
        this.pengaduanPST = pengaduanPST;
    }

    public Responden(String namaResponden, int tahunLahir, String email, String nomorHp, int jenisKelamin, int pendidikan, int pekerjaan, String namaInstansi, int katInstansi, int pemanfaatan, int jenisLayanan, int fasilitas, int dataRujukan, int pengaduanPST, KepuasanPelayanan kepuasanPelayanan, DataDibutuhkan dataDibutuhkan) {
        this.namaResponden = namaResponden;
        this.tahunLahir = tahunLahir;
        this.email = email;
        this.nomorHp = nomorHp;
        this.jenisKelamin = jenisKelamin;
        this.pendidikan = pendidikan;
        this.pekerjaan = pekerjaan;
        this.namaInstansi = namaInstansi;
        this.katInstansi = katInstansi;
        this.pemanfaatan = pemanfaatan;
        this.jenisLayanan = jenisLayanan;
        this.fasilitas = fasilitas;
        this.dataRujukan = dataRujukan;
        this.pengaduanPST = pengaduanPST;
        this.kepuasanPelayanan = kepuasanPelayanan;
        this.dataDibutuhkan = dataDibutuhkan;
    }

    public String getNamaResponden() {
        return namaResponden;
    }

    public void setNamaResponden(String namaResponden) {
        this.namaResponden = namaResponden;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public int getJk() {
        return jenisKelamin;
    }

    public void setJK(int jeniskelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(int pendidikan) {
        this.pendidikan = pendidikan;
    }

    public int getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(int pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getNamaInstansi() {
        return namaInstansi;
    }

    public void setNamaInstansi(String namaInstansi) {
        this.namaInstansi = namaInstansi;
    }

    public int getKatInstansi() {
        return katInstansi;
    }

    public void setKatInstansi(int katInstansi) {
        this.katInstansi = katInstansi;
    }

    public int getPemanfaatan() {
        return pemanfaatan;
    }

    public void setPemanfaatan(int pemanfaatan) {
        this.pemanfaatan = pemanfaatan;
    }

    public int getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(int jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    public int getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(int fasilitas) {
        this.fasilitas = fasilitas;
    }

    public int getDataRujukan() {
        return dataRujukan;
    }

    public void setDataRujukan(int dataRujukan) {
        this.dataRujukan = dataRujukan;
    }

    public int getPengaduanPST() {
        return pengaduanPST;
    }

    public void setPengaduanPST(int pengaduanPST) {
        this.pengaduanPST = pengaduanPST;
    }

    public KepuasanPelayanan getKepuasanPelayanan() {
        return kepuasanPelayanan;
    }

    public void setKepuasanPelayanan(KepuasanPelayanan kepuasanPelayanan) {
        this.kepuasanPelayanan = kepuasanPelayanan;
    }

    public DataDibutuhkan getDataDibutuhkan() {
        return dataDibutuhkan;
    }

    public void setDataDibutuhkan(DataDibutuhkan dataDibutuhkan) {
        this.dataDibutuhkan = dataDibutuhkan;
    }

    
   
    public String jenisKelaminToString(int jeniskelamin){
        switch(jeniskelamin){
            case 1: return "Laki-laki";
            case 2: return "Perempuan";
        }
        return "Kode tidak ditemukan";
    }
    
    public String pendidikanToString (int pendidikan){
        switch(pendidikan){
            case 1: return "<=SLTA/Sederajat";
            case 2: return "D1/D2/D3";
            case 3: return "D4/S1";
            case 4: return "S2";
            case 5: return "S3";
            default:
                return "Kode tidak ditemukan";
        }
    }
    
    public String pekerjaanUtamToString (int pekerjaan){
        switch(pekerjaan){
            case 1: return "Pelajar/Mahasiswa";
            case 2: return "Peneliti/Dosen";
            case 3: return "PNS/TNI/Polri";
            case 4: return "Pegawai BUMN/BUMD";
            case 5: return "Pegawai Swasta";
            case 6: return "Wiraswasta";
            case 7: 
                Scanner scanner = new Scanner(System.in);
                System.out.print("Masukkan pekerjaan utama: ");
                return scanner.nextLine();
            default:
                return "Kode tidak ditemukan";
        }
    }
    
    public String KatInstansiToString (int katInstansi){
        switch(katInstansi){
            case 1: return "Lembaga Pendidikan & Penelitian Dalam Negeri";
            case 2: return "Lembaga Pendidikan & Penelitian Luar Negeri";
            case 3: return "Kementerian & Lembaga Pemerintah";
            case 4: return "Lembaga Internasional";
            case 5: return "Media Massa";
            case 6: return "Pemerintah Daerah";
            case 7: return "Perbankan";
            case 8: return "BUMN/BUMD";
            case 9: return "Swasta lainnya";
            case 10: Scanner scanner = new Scanner(System.in);
                System.out.print("Masukkan Kategori Instansi: ");
                return scanner.nextLine();
            default:
                return "Kode tidak ditemukan";
        }
    }
    
    public String PemanfaatanHasilUtamaToString (int pemanfaatan){
        switch(pemanfaatan){
            case 1: return "Tugas Sekolah/Tugas Kuliah";
            case 2: return "Pemerintahan";
            case 3: return "Komersial";
            case 4: return "Penelitian";
            case 5:  
                Scanner scanner = new Scanner(System.in);
                System.out.print("Masukkan pemanfaatan hasil utama: ");
                return scanner.nextLine();
            default:
                return "Kode tidak ditemukan";
        }
    }
    
    public String JenisLayananToString (int jenisLayanan){
        switch(jenisLayanan){
            case 1: return "Perpustakaan";
            case 2: return "Pembelian Publikasi BPS";
            case 4: return "Pembelian Data Mikro/Peta Wilayah Kerja Statistik";
            case 8: return "Akses produk statistik pada website BPS";
            case 16: return "Konsultasi Statistik";
            case 32: return "Rekomendasi Kegiatan Statistik";
            default:
                return "Kode tidak ditemukan";
        }
    }
    
    public String fasilitasToString (int fasilitas){
        switch(fasilitas){
            case 1: return "Datang langsung ke unit Pelayanan Statistik Terpadu (PST)";
            case 2: return "Aplikasi pelayanan statistik terpadu online (pst.bps.go.id)";
            case 4: return "Website BPS (bps.go.id)";
            case 8: return "Aplikasi AllStats BPS (berbasis android dan iOS)";
            case 16: 
                Scanner scanner = new Scanner(System.in);
                System.out.print("Masukkan Fasilitas yang digunakan: ");
                return scanner.nextLine();
            default:
                return "Kode tidak ditemukan";
        }
    }
    
    public String DataRujukanToString (int dataRujukan){
        switch(dataRujukan){
            case 1: return "Ya";
            case 2: return "Tidak";
            default:
                return "Kode tidak ditemukan";
        }
    }
    
    public String PengaduanPSTToString (int dataDibutuhkan){
        switch(dataDibutuhkan){
            case 1: return "Ya";
            case 2: return "Tidak";
            default:
                return "Kode tidak ditemukan";
        }
    }

    @Override
    public String toString() {
    return "===========================================================================================================================================" +
           "\n                                                             ISIAN BLOK I                                                                  " +
           "\n===========================================================================================================================================" +
        "\nNama Responden                                                             : " + namaResponden + 
        "\nTahun Lahir                                                                : " + tahunLahir + 
        "\nE-mail                                                                     : " + email + 
        "\nNomor Handphone                                                            : " + nomorHp + 
        "\nJenis Kelamin                                                              : " + jenisKelaminToString(jenisKelamin) + 
        "\nPendidikan tertinggi yang ditamatkan                                       : " + pendidikanToString (pendidikan) + 
        "\nPekerjaan Utama                                                            : " + pekerjaanUtamToString(pekerjaan) + 
        "\nNama Instansi                                                              : " + namaInstansi + 
        "\nKategori Instansi                                                          : " + KatInstansiToString(katInstansi) + 
        "\nPemanfaatan utama hasil kunjungan dan/atau akses layanan                   : " + PemanfaatanHasilUtamaToString(pemanfaatan) + 
        "\nJenisLayanan yang digunakan untuk memperoleh layanan BPS                   : " + JenisLayananToString(jenisLayanan) + 
        "\nFasilitas yang digunakan untuk memperoleh layanan BPS                      : " + fasilitasToString(fasilitas) + 
        "\nApakah data BPS digunakan sebagai Rujukan Utama?                           : " + DataRujukanToString(dataRujukan) + 
        "\nApakah pernah melakukan pengaduan terkait Pelayanan Statistik Terpadu(PST)?: " + PengaduanPSTToString(pengaduanPST) + "\n";
}



    
    
}
