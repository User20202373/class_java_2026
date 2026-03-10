package innerclass.swing.ch09;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;

    private

    final int MOVE_STEP = 10;
    private final int INIT_X = 225;
    private final int INIT_Y = 200;
    private final int FRAME_SIZE1 = 1000;
    private final int FRAME_SIZE2 = 600;
    ImageIcon playerLIcon = new ImageIcon("images/playerL.png");
    ImageIcon playerRIcon = new ImageIcon("images/playerR.png");

    public MyFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }


    private void initData() {
        setTitle("이미지 사용 연습");
        setSize(FRAME_SIZE1, FRAME_SIZE2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //배경 이미지 설정
        ImageIcon backgroundIcon = new ImageIcon("images/backgroundMap.png");
        backgroundMap = new JLabel(backgroundIcon);
        backgroundMap.setSize(FRAME_SIZE1, FRAME_SIZE2);
        backgroundMap.setLocation(0, 0);

        //플레이어 설정
        //ImageIcon playerIcon = new ImageIcon("images/playerL.png");
        player = new JLabel(playerLIcon);
        player.setSize(100, 100);
        player.setLocation(200, 200);


    }

    private void setInitLayout() {
        setLayout(null);//좌표 기반
        backgroundMap.add(player);
        add(backgroundMap);
        setVisible(true);
    }

    private void addEventListener() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int KeyCode = e.getKeyCode();
                int x = player.getX();
                int y = player.getY();

                if (KeyCode == KeyEvent.VK_LEFT) {
                    player.setLocation(x - MOVE_STEP, y);
                    player.setIcon(playerLIcon);
                } else if (KeyCode == KeyEvent.VK_UP) {
                    player.setLocation(x, y - MOVE_STEP);

                } else if (KeyCode == KeyEvent.VK_RIGHT) {
                    player.setLocation(x + MOVE_STEP, y);
                    player.setIcon(playerRIcon);

                } else if (KeyCode == KeyEvent.VK_DOWN) {
                    player.setLocation(x, y + MOVE_STEP);

                } else if (KeyCode == KeyEvent.VK_ESCAPE) {
                    player.setLocation(INIT_X, INIT_Y);
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    //테스트 코드 (메인 쓰레드)
    static void main() {
        new MyFrame();
    }
}
