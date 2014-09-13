package com.yodiyanwar.model;

import java.io.Serializable;
/**
 *
 * @author Yodi Yanwar
 */
public class Mahasiswa implements Serializable{
    //Setiap kelas yg objek nya akan diserialisasi, wajib menjadi implement dari kelas interface Serializable
    
	public int npm;
	public String nama;
	public String alamat;
	public transient int ssn;	//keyword transient digunakan ketika ada variabel yang tidak ingin kita serialisasi, sehingga nilainya tidak muncul ketika dipanggil
                                        //biasanya keyword transient ini diterapkan pada variabel yang bersifat pribadi / rahasia
}
