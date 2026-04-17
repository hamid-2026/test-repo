import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    App(){
        setTitle("Test");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel lb = new JLabel("Hello World");
        lb.setFont(new Font("Arial",Font.PLAIN,18));
        add(lb);

    }
    public static void main(String[] args){
        new App().setVisible(true);
    }
}
