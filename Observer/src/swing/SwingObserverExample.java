package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Patrick on 23/07/2017.
 */
public class SwingObserverExample {
    JFrame frame;

    public SwingObserverExample() {
    }

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        this.frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event-> System.out.println("Come on, do it!"));
        this.frame.getContentPane().add("Center", button);
        this.frame.setDefaultCloseOperation(3);
        this.frame.getContentPane().add("Center", button);
        this.frame.setSize(300, 300);
        this.frame.setVisible(true);
    }

}
