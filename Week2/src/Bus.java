import static javax.swing.JOptionPane.showMessageDialog;

public class Bus extends Transportation{
    int busNumber;
    int passenger=0;
    int maxPassenger = 30;
    int fee =  1000;


    //버스 이름
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    //탑승 승객 수
    public void Passenger(int b){
        passenger += b;
        if(passenger <= maxPassenger) {
            System.out.println("현재 탑승 승객 수는 "+ passenger + "명 입니다.");
        } else {
            showMessageDialog(null, "최대 승객 수 초과");
            passenger = 0;
        }

    }

    //잔여 승객 수
    public void remain(int on){
        int remaining = 30 - on;
        System.out.println("잔여 승객 수는 "+ remaining + "명 입니다.");
    }

    //요금 확인
    public void charge(int p){
        //오류.. fee *= p 이렇게 하면 금액이 안맞음
        fee = 1000 * p;
        System.out.println("요금은 "+ fee + "원 입니다.");
    }

    //주유량 -
    public void fuelUsed(int used){
        fuelAmount -= used;
        System.out.println("현재 주유량은 "+ fuelAmount + "입니다.");
        if (fuelAmount <= 5){
            showMessageDialog(null, "주유 필요");
        }
    }

// 상태 변경 _ 부모속성 PTransportation 참조 stop()

    //주유량 +
    public void fuelAdded(int add){
        fuelAmount += add;
        System.out.println("현재 주유량은 " + fuelAmount + "입니다.");
    }

// 상태 변경 _ 부모속성 PTransportation 참조 run()

//
}
