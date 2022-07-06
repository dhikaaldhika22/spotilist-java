package AplikasiPlaylistLagu;
import UserInterfaceJFRAME.splashAwal;
import UserInterfaceJFRAME.Login;
public class Interface {
    public static void main(String[] args) {
        splashAwal splash = new splashAwal();
        splash.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                splash.loading.setText(Integer.toString(i)+"%");
                splash.loadingBar.setValue(i);
            }
                splash.setVisible(false);
                Login login = new Login();
                login.setVisible(true);
        } catch(Exception e){
            System.err.println(e);
        }
    }
}
