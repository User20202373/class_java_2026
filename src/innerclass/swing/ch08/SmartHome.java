package innerclass.swing.ch08;

public class SmartHome {
    static void main() {
        //1.인터페이스를 직접 구현할 때 (지저분함)
        //익명 클래스 사용
        SmartHomeListener homeListener1 = new SmartHomeListener() {
            @Override
            public void onPowerOn() {

            }

            @Override
            public void onPowerOff() {

            }

            @Override
            public void onTemperatureChange(int t) {

            }
        };

        SmartHomeListenerAdapter listenerAdapter = new SmartHomeListenerAdapter() {
            @Override
            public void onTemperatureChange(int t) {
                System.out.println("에어컨 가동 : 현재 온도 : " + t + "도 최적화 중....");
            }
        };
        //사용해보기
        listenerAdapter.onTemperatureChange(23);

    }
}
