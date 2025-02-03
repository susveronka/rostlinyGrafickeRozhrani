import javax.swing.*;
import java.util.ArrayList;

public class RostlinyFrame extends JFrame {

    private JPanel panel;
    private JButton previous;
    private JButton next;
    private JTextField rostlina;

    public RostlinyFrame(){
        initComponents();
    }

    private void initComponents(){
        setContentPane(panel);
        setTitle("Rostliny");
        setSize(800,600);
        previous.addActionListener(e -> predchozi());
        next.addActionListener(e-> dalsi());
        rostlina.setEditable(false);

    }

    public void predchozi(){
        // seznam vypsat název díky pozice -1 , ošetřit mínus
    }

    public void dalsi(){


        // seznam vypsat název díky pozice +1

    }



}
