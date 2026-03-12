package innerclass.swing.ch11;

import java.util.Arrays;
import java.util.Random;

/**
 * [역할] 로또 번호 생성 전달 전담 클래스
 * <p>
 * SRP(Single Responsibility Principle) - 단일 책임 원칙(5 가지 원칙)
 * 클래스는 하나의 책임만 가져야 한다.
 * -즉 이 클래스는 오직 로또 번호 생성 만 담당한다.
 *
 */
public class LottoRandomNumber {
    static final int LOTTO_NUMBER_COUNT = 6;

    public int[] createNumber() {
        //[1][2][3][4][5][6]
        //1. 이중 for문, while (set) , 셔플 {1 ,2 ,3,~ 45} 등 다양한 방법 있음
        int[] lottoWinNum = new int[LOTTO_NUMBER_COUNT];
        Random random = new Random();

        for (int i = 0; i < lottoWinNum.length; i++) {
            //1 ~ 45 사이의 랜덤 숫자 생성
            lottoWinNum[i] = random.nextInt(45) + 1;

            //앞에서 이미 뽑은 숫자들과 중복 비교
            for (int j = 0; j < i; j++) {
                //lottoWinNum[j] --> 0 --> [1]
                //lottoWinNum[i] --> 1 --> [2]
                if (lottoWinNum[j] == lottoWinNum[i]) {

                    //중복 발견 시점 i 값을 되돌려서 같은 자리르 다시 뽑게 함
                    i--;
                    break; // 중복 발견시 즉시 안쪽 for 탈출

                }
            }

        }
        //오름차순 정렬
        Arrays.sort(lottoWinNum); // 오름 차순 정렬이 기본값
        return lottoWinNum;

    }//end of crateNumber

    static void main() {
        LottoRandomNumber randomNumber = new LottoRandomNumber();
        int[] result = randomNumber.createNumber();

        //무조건 처음부터 끝까지 반복시켜야 할 때 많이 사용함 if문 사용시에는 부적합
        for (int num : result) {
            System.out.println(num);
        }
    }
}
