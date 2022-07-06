/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import Playlist.Akun;
/**
 *
 * @author ASUS
 */
public class DataAkun {
    
    public static ArrayList<Akun> akun = new ArrayList<>();
    public static void inisialisasiDataAkun(){
        String file = Paths.get("").toAbsolutePath().toString() + "\\data\\Akun.txt";
        File fl = new File(file);
        try{
            Scanner reader = new Scanner(fl);
            while(reader.hasNext()){
                String a = reader.nextLine();
                String[] array = a.split("\\|");
                akun.add(new Akun(array[0],array[1],array[2]));
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    
}
