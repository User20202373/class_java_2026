package innerclass.swing.ch10;

import innerclass.swing.ch08.MoveCharFrame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;


public class LottoFrame extends JFrame {
    private BufferedImage image;
    private JPanel panel1;
    private JButton button1;
    private JLabel label;
    private JLabel randomBall;
    private JTextArea area;
   // ImageIcon ballIcon = new ImageIcon("images/BallBlue.png");


    public LottoFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    //원형
    //@Override
//    public void paintComponents(Graphics g) {
//        super.paintComponents(g);
//        if (image != null) {
//            Graphics2D g2 = (Graphics2D) g;
//            // 부드러운 가장자리 처리
//            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//            int diameter = Math.min(getWidth(), getHeight());
//            // 원형 클리핑 영역 설정
//            g2.setClip(new Ellipse2D.Float(0, 0, diameter, diameter));
//            // 이미지 그리기
//            g2.drawImage(image, 0, 0, diameter, diameter, null);
//        }
  //  }

    private void initData() {
        setTitle("Lotto Game");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        button1 = new JButton("Game Start");
        button1.setSize(1000, 50);
        panel1 = new JPanel();

        ImageIcon ballIcon = new ImageIcon("images/BallBlue.png");
        randomBall = new JLabel(ballIcon);
        randomBall.setSize(100, 100);
        randomBall.setLocation(100, 600);

//        label = new JLabel("1");
//        label.setFont(new Font("맑은 고딕", Font.BOLD, 30));//폰트 설정
//        label.setSize(50, 50);// 라벨 자체의 크기
//        label.setLocation(150,100);//초기 시작 위치 (중앙 부근)


    }

    private void setInitLayout() {
        setLayout(null);

        add(button1);
        //add(panel1);

        setVisible(true);
    }

    private void addEventListener() {

    }


    static void main() {
        new LottoFrame();
    }


}
