package innerclass.swing.ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LottoFrame2 extends JFrame implements ActionListener {

    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private JButton button;
    private JTextArea area;
    //private MyButtonPanel myButtonPanel;
    private boolean draw = false;

    public LottoFrame2() {
        initData();
        setInitData();
        setInitLayout();
        addEventListener();
    }


//    @Override
//    public void paintComponents(Graphics g) {
//
//    }

    public void initData() {
        setTitle("Lotto Game");
        setSize(1000, 600);
        setBackground(new Color(244, 244, 244));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel1 = new JPanel();
        button = new JButton("Game start");
        area = new JTextArea("Game Start 버튼을 눌러주세요");
        button.setText("Game start");
        button.setSize(1000, 50);
        button.setLocation(0, 0);


        area.setText("Game Start 버튼을 눌러주세요");
        area.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        area.setSize(450, 50);
        area.setBackground(new Color(244, 244, 244));
        area.setLocation(200, 250);


        // myButtonPanel.setLocation(200,200);
        //setResizable(false);
    }

    public void setInitLayout() {
        setLayout(new BorderLayout());
        // add(panel1);
        add(button);
        add(area);
        //add(myButtonPanel);
        setVisible(true);
    }

    public void setInitData() {


    }

    private void addEventListener() {
        button.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selectedButton = (JButton) e.getSource();button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                draw = true;
                repaint();
                System.out.println("버튼클릭");
            }
        });
        if (e.getSource() == button){

        }


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
        new LottoFrame2();
    }
}



