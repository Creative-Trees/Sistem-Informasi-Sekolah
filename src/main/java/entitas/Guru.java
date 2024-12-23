/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitas;

/**
 *
 * @author halfirzzha
 */
public class Guru extends CivitasAkademika {
    private String nid;
    private String mataPelajaran;

    public Guru(String nama, int umur, String nid, String mataPelajaran) {
        super(nama, umur);
        this.nid = nid;
        this.mataPelajaran = mataPelajaran;
    }
    
    // Constructor Overloading
     public Guru(String nama, int umur, String nid) {
        super(nama, umur);
        this.nid = nid;
        this.mataPelajaran = "Belum Ditentukan";
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NID: " + nid);
        System.out.println("Mata Pelajaran: " + mataPelajaran);
    }
    
    @Override
    public void deskripsi(){
        System.out.println(nama + " adalah seorang Dosen yang mengajar " + mataPelajaran);
    };
}
