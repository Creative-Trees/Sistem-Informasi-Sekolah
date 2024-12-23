/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitas;

/**
 *
 * @author halfirzzha
 */
import entitas.Siswa;
import entitas.Guru;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    public static List<Siswa> loadDataSiswa() {
        List<Siswa> listSiswa = new ArrayList<>();
        listSiswa.add(new Siswa("M'HALFIRZZHATULLAH", 20, "312310548", "TI-A3-23"));
        listSiswa.add(new Siswa("MICHAEL ANDREA AQUINO", 20, "312310703", "TI-A3-23"));
        listSiswa.add(new Siswa("M.RAFLI SAPUTRA", 20, "312310280", "TI-A3-23")); 
        return listSiswa;
    }

    public static List<Guru> loadDataGuru() {
        List<Guru> listGuru = new ArrayList<>();
        listGuru.add(new Guru("Ismasari Nawangsih, S.Kom., M.Kom.", 40, "0413088005", "Pemrograman Orientasi Objek 3"));
        listGuru.add(new Guru("Ahmad Turmudi Zy, S.Kom, M.Kom.", 40, "0408087907", "Jaringan Komputer 3"));
        listGuru.add(new Guru("Sally Badriya Hisniati, S.Pd., M.Pd", 40, "0408089909", "Pendidikan Agama 3"));
        return listGuru;
    }
}
