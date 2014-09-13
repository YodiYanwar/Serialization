package com.yodiyanwar.action;

import com.yodiyanwar.model.Mahasiswa;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author Yodi Yanwar
 */
public class Action {
    
    String path = "D:/";
    String file = "mahasiswa.ser";
        
    public void serialisasi(){    
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.npm = 1221541;
        mhs.nama = "Yodi Yanwar";
        mhs.alamat = "Bogor Indonesia";
        mhs.ssn = 123;
        
        try {
            FileOutputStream fos = new FileOutputStream(path+file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(mhs);   //menulis object kedalam file
            
            oos.close();
            fos.close();
            
            System.out.println("Object Berhasil di-Serialisasi kedalam file "+file+" pada path "+path);
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
    
    public void deserialisasi(){
        
        String filePath = path+file;
        Mahasiswa mhs = null;
        
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            mhs = (Mahasiswa) ois.readObject();
            
            fis.close();
            ois.close();
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        } catch(ClassNotFoundException ex){
            ex.getMessage();
            ex.printStackTrace();
        }
        
        System.out.println("\nDeserializing "+file+"...\n");
        System.out.println("NPM     : "+mhs.npm);
        System.out.println("Nama    : "+mhs.nama);
        System.out.println("Alamat  : "+mhs.alamat);
        System.out.println("SSN     : "+mhs.ssn);
    }
}
