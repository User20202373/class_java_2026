package innerclass.swing.ch08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * keylistener 인터페이스를 구현하여 키보드 이벤트를 처리하는 클래스를 설계
 * JFrame 을 상속받아 창을 만들고
 * KeyListener를 구현하여'감시자'자격을 갖춤
 */
public class KeyEventListenerFrame extends JFrame implements KeyListener {
    private final int FREAM_SIZE = 500;
    private JTextArea textArea;

    public KeyEventListenerFrame() {
        initData();
        setInitlayout();
        addEventlistener();
    }

    private void initData() {
        setSize(FREAM_SIZE, FREAM_SIZE); //변수 상수의 활용
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); //사용자가 마우스 크기로 창 크기를 조절 못하게 고정하는 옵션

        textArea = new JTextArea();
    }

    private void setInitlayout() {
        setLayout(new BorderLayout()); // 전체 레이아웃
        add(textArea);
        setVisible(true);

    }

    private void addEventlistener() {
        //핵심 개념
        //textArea에게 키보드 입력이 들어오면 this(나)한테 알려줘 라고 등록하는  과정
        textArea.addKeyListener(this);
    }


    //------------------KeyListener 추상 메서드를 일반 메서드로 재정의 (구현)
    //문자가 입력 되었을 때 호출
    @Override
    public void keyTyped(KeyEvent e) {
        // System.out.println("keyTyped 호출 됨");
    }

    //키보드의 어떤 키든 눌렀을 때 호출
    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println(e.getKeyCode() + ": 키 코드");
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("왼쪽 화살표 이벤트 발생");
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("위쪽 화살표 이벤트 발생");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("오른쪽 화살표 이벤트 발생");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("아래쪽 화살표 이벤트 발생");
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            textArea.append("← 왼쪽\n");
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            textArea.append("↑ 위쪽\n");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            textArea.append("→ 오른쪽\n");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            textArea.append("↓ 아래쪽\n");
        }
    }

    //어떤 키든 손을 땠을 때 호출
    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("keyReleased 호출 됨");

    }

    //테스트 코드 - 메인쓰레드
    static void main() {
        new KeyEventListenerFrame();

    }
}
