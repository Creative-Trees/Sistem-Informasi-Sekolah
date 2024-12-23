/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitas;

/**
 *
 * @author halfirzzha
 */

public class Siswa extends CivitasAkademika {
    private String nim;
    private String kelas;

    public Siswa(String nama, int umur, String nim, String kelas) {
        super(nama, umur);
        this.nim = nim;
        this.kelas = kelas;
    }
    
    // Constructor Overloading
    public Siswa(String nama, int umur, String nim){
        super(nama, umur);
        this.nim = nim;
        this.kelas = "Belum Ditentukan";
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
    }
    
    @Override
    public void deskripsi(){
        System.out.println(nama + " adalah seorang Mahasiswa di kelas " + kelas);
    };
}
