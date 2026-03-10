package innerclass.swing.ch07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColoFrame extends JFrame implements ActionListener {

    private JPanel panel1;
    private JPanel panel2;
    private JButton button1;
    private JButton button2;

    public ColoFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("버튼1");
        button2 = new JButton("버튼2");
        panel1 = new JPanel();
        panel2 = new JPanel();

    }

    private void setInitLayout() {
        setLayout(new GridLayout(2, 1));
        //setLayout(new BorderLayout());
        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.yellow);

        add(panel1);
        add(panel2);

        panel1.add(button1);
        panel2.add(button2);

        setVisible(true);
    }

    private void addEventListener() {
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selectedButton = (JButton) e.getSource();

        if (e.getSource() == button1) {
            panel1.setBackground(Color.BLUE);
        } else if (e.getSource() == button2) {
            panel2.setBackground(Color.RED);
        }
    }
}
