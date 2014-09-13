package com.yodiyanwar;

import com.yodiyanwar.action.Action;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Action act = new Action();
        act.serialisasi();
        
        String pilihan;
        try {
            do{
                System.out.print("Deserialisasi objek ? [y] : ");
                pilihan = in.readLine();
            } while(!pilihan.equalsIgnoreCase("y"));
        } catch (IOException e) {
            System.out.println("Terjadi Kesalahan ! : ");
            e.getMessage();
            e.printStackTrace();
        }
        
        act.deserialisasi();
    }
}
