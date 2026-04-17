import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    App(){
        setTitle("Test");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
    public static void main(String[] args){
        new App().setVisible(true);
    }
}
