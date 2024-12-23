/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.creativetrees.sisteminformasisekolah;

/**
 *
 * @author halfirzzha
 */
import entitas.Siswa;
import entitas.Guru;
import utilitas.DataLoader;
import java.util.List;

public class SistemInformasiSekolah {

    public static void main(String[] args) {
        List<Siswa> daftarSiswa = DataLoader.loadDataSiswa();
        List<Guru> daftarGuru = DataLoader.loadDataGuru();

        System.out.println("=== Daftar Siswa ===");
        for (Siswa siswa : daftarSiswa) {
            siswa.tampilkanInfo();
            siswa.deskripsi();
            System.out.println("--------------------");
        }

        System.out.println("\n=== Daftar Guru ===");
        for (Guru guru : daftarGuru) {
            guru.tampilkanInfo();
            guru.deskripsi();
            System.out.println("--------------------");
        }
    }
}
