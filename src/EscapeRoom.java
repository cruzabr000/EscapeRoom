import com.sun.javafx.embed.HostDragStartListener;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EscapeRoom {

    static JPanel panel;
    static JLabel time, correctAnswer;
    static JButton door1, door2, door3, go;
    int maxSeconds = 5;
    int seconds = maxSeconds;
    static Timer timer;





    public static void main(String[] args) {
        new EscapeRoom();
    }


    public EscapeRoom(){
        JFrame frame = new JFrame("Escape Room");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);

        time = new JLabel();
        correctAnswer = new JLabel();

        go = new JButton("Click to Start");

        door1 = new JButton("Answer number 1");
        door2 = new JButton("Answer number 2");
        door3 = new JButton("Answer number 3");

        //timer
        panel = new JPanel();





    }

    private class StartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            time.setText(Integer.toString(seconds));
            panel.remove(go);
            panel.add(time);
            panel.updateUI();
            timer.start();
        }
    }



}
