import static javax.swing.JOptionPane.showMessageDialog;

public class Taxi extends Transportation{

    int taxiNumber;
    String destination;
    int distance = 1;
    int mindistance;
    int bfee = 3000;
    int disfee = 1000;
    int maxPassenger = 4;
    int speed = 0;
    String status;

    //택시 번호
    public Taxi(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    //주유량
    public void fuelAmount() {
        System.out.println("현재 주유량은 "+ fuelAmount + "입니다.");
    }


    // 상태_ 부모속성 PTransportation 참조 run()
    //탑승객 수
    public void Passenger(int b) {
        passenger += b;
        if (passenger <= maxPassenger) {
            System.out.println("현재 탑승 승객 수는 " + passenger + "명 입니다.");
        } else {
            showMessageDialog(null, "최대 승객 수 초과");
            passenger = 0;
        }
    }

    //잔여 승객 수
    public void remain(int on){
        int passengerNow = maxPassenger - on;
        System.out.println("잔여 승객 수는 "+ passengerNow + "명 입니다.");
    }

    //요금 확인
    public void bCharge(){
        System.out.println("기본 요금은 "+ bfee + "원 입니다.");
    }

    //목적지 명
    public void Destination(String destination){
        this.destination = destination;
        System.out.println("목적지는"+destination+"입니다.");
    }

    //목적지까지 거리
    public void Distance(int distance) {
        this.distance += distance-1;
        System.out.println("목적지까지 거리는"+distance+"km 입니다.");
    }

    //지불할 요금
    public void feeTotal(int distance){
        int total = bfee + disfee * (distance - 1);
        System.out.println("지불할 요금은"+total+"입니다.");
    }

// 상태 변경 _ 부모속성 PTransportation 참조 run()

    // 주유량 80 -
    public void fuelUsed(int used){
        fuelAmount -= used;
        System.out.println("현재 주유량은 "+ fuelAmount + "입니다.");
        if (fuelAmount <= 5){
            showMessageDialog(null, "주유 필요");
        }
    }

//누적 요금!!
}
