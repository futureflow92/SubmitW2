public class Transportation {
    int number;
    int fuelAmount = 100;
    int speed = 0;
    int speedChange;
    int passenger;


    // 상태:
    public void Status(int a) {
        if (a == 1) {
            System.out.println("현재상태: 일반");
        } else if (a == 2) {
            System.out.println("현재상태: 운행중");
        } else if (a == 3) {
            System.out.println("현재상태: 차고지행");
        } else if (a == 4) {
            System.out.println("현재상태: 운행불가");
        }
    }
}

