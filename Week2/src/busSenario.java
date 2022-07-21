public class busSenario {
    public static void main(String[] args) {
        Bus b1 = new Bus(1);
        Bus b2 = new Bus(2);

        //각 Bus 번호 다른지 확인

        System.out.println(b1.busNumber+"번 버스입니다.");
        System.out.println(b2.busNumber+"번 버스입니다.");

        b1.Passenger(2); //탑승 승객 수 = 2
        b1.remain(2);  //잔여 승객 수 = 28
        b1.charge(2);  //요금 확인 = 2000
        b1.fuelUsed(50);  //주유량 -50
        b1.Status(3);  //차고지행
        b1.fuelAdded(10);  //주유량 = 60
        b1.Status(2);  //운행중
        b1.Passenger(45);  //알럿 ‘최대 승객 수 초과’
        b1.Passenger(5);  //탑승 승객 수 = 5
        b1.remain(5);  //잔여 승객 수 = 25
        b1.charge(5);  //주유량 = 5
        b1.fuelUsed(55);  //요금 = 5000
        b1.Status(3);  //상태 = 차고지행

    }
}
