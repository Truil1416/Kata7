package watch;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;

public class Main extends JFrame{
    
    int hora, minutos, segundos;
    Calendar calendario = new GregorianCalendar();
    
    public static void main(String[] args) {
        new Main().launch();
    }

    public Main() {
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        Watch watch = new Watch(hora, minutos, segundos);
        WatchDisplay watchDisplay = new WatchDisplay();
        new WatchPresenter(watch, watchDisplay);
        this.setTitle("Watch");
        this.setSize(400,424);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(watchDisplay);
    }

    private void launch() {
        this.setVisible(true);
    }
    
}
