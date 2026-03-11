package innerclass.swing.ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LottoFrame4 extends JFrame implements ActionListener {


    private JButton button;
    private JTextArea area;
    private boolean draw;


    public LottoFrame4() {
        initData();
        setInitData();
        setInitLayout();
    }


    public void initData() {
        setTitle("Lotto Game");
        setSize(1000, 600);
        setBackground(new Color(244, 244, 244));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        button = new JButton("Game start");
        area = new JTextArea("Game Start 버튼을 눌러주세요");
        area.setText("Game Start 버튼을 눌러주세요");
        area.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        area.setSize(450, 50);
        area.setBackground(new Color(244, 244, 244));
        area.setLocation(300, 250);

        button.setText("Game start");
        button.setSize(1000, 50);
        button.setLocation(0, 0);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                draw = true;
                area.setText(null);
                repaint();
            }
        });



    }

    public void setInitLayout() {
        setLayout(null);
        // add(panel1);
        add(button);
        add(area);

        setVisible(true);
    }

    public void setInitData() {


    }

    private void addEventListener() {
        button.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selectedButton = (JButton) e.getSource();

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (draw) {
            g.setColor(Color.yellow);
            g.fillOval(150, 300, 100, 100);
            g.setColor(Color.black);
            g.drawOval(150, 300, 100, 100);
            g.setColor(Color.red);
            g.fillOval(300, 300, 100, 100);
            g.setColor(Color.blue);
            g.fillOval(450, 300, 100, 100);
            g.fillOval(600, 300, 100, 100);
            g.fillOval(750, 300, 100, 100);
        }
    }


    public static void main(String[] args) {
        new LottoFrame4();
    }
}



