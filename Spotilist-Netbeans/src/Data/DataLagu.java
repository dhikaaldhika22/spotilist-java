package Data;
import Playlist.Lagu;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class DataLagu {
     public static ArrayList<Lagu> lagu = new ArrayList<>();
        public static void inisialisasiDataLagu(){
        String file = Paths.get("").toAbsolutePath().toString() + "\\data\\List.txt";

        try {
            FileInputStream fis = new FileInputStream(file);
            char current = 0;
            int i = 0;
            String a = "";
            

            ArrayList<String> kode = new ArrayList<String>();
            ArrayList<String> judul = new ArrayList<String>();
            ArrayList<String> genre = new ArrayList<String>();
            ArrayList<String> album = new ArrayList<String>();
            ArrayList<String> tahun = new ArrayList<String>();
            ArrayList<String> artis = new ArrayList<String>();
            ArrayList<String> record = new ArrayList<String>();

            while (fis.available() > 0) {

                while (fis.available() > 0) {
                    current = (char) fis.read();

                    if (current == '/') {
                        
                        break;
                    }
                    a = a + current;

                }
                kode.add(a);
                a = "";

                while (fis.available() > 0) {

                    current = (char) fis.read();
                    if (current == '/') {
                        break;
                    }
                    a = a + current;

                }
                judul.add(a);
                a = "";

                while (fis.available() > 0) {
                    current = (char) fis.read();
                    if (current == '/') {
                        break;
                    }
                    a = a + current;

                }
                genre.add(a);
                a = "";

                while (fis.available() > 0) {
                    current = (char) fis.read();
                    if (current == '/') {
                        break;
                    }
                    a = a + current;

                }
                album.add(a);
                a = "";
                
                while (fis.available() > 0) {
                    current = (char) fis.read();
                    if (current == '/') {
                        break;
                    }
                    a = a + current;

                }
                tahun.add(a);
                a = "";
                
                while (fis.available() > 0) {
                    current = (char) fis.read();
                    if (current == '/') {
                        break;
                    }
                    a = a + current;

                }
                artis.add(a);
                a = "";
                
                while (fis.available() > 0) {
                    current = (char) fis.read();
                    if (current == Character.LINE_SEPARATOR) {
                        break;
                    }
                    a = a + current;

                }
                record.add(a);
                a = "";
                fis.read();
                lagu.add(i, new Lagu(artis.get(i), judul.get(i), genre.get(i), album.get(i), tahun.get(i),
                        record.get(i), kode.get(i)));

                i++;

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

