public class taxiSenario {
    public static void main(String[] args) {
        Taxi t1 = new Taxi(1);
        Taxi t2 = new Taxi(2);
//각 Taxi 번호 다른지 확인
        System.out.println(t1.taxiNumber+"번 택시 입니다.");
        System.out.println(t2.taxiNumber+"번 택시 입니다.");

        t1.fuelAmount(); //주유량 = 100
        t1.Status(1); //상태 = 일반
        t1.Passenger(2); //탑승 승객 수 = 2
        t1.remain(2); //잔여 승객 수 = 2
        t1.bCharge(); //기본 요금 확인 = 3000
        t1.Destination("서울역"); //목적지 = 서울역
        t1.Distance(2); //목적지까지 거리 = 2km
        t1.feeTotal(2); //지불할 요금  = 4000
        t1.Status(2); //상태 = 운행중
        t1.fuelUsed(80); //주유량 -80 == 주유량 = 20
        t1.feeTotal(1);  //누적 요금 = 4000
        t1.Passenger(5); //승객 +5, 알럿 ‘최대 승객 수 초과’
        t1.Passenger(3); //탑승 승객 수 = 3
        t1.remain(3); //잔여 승객 수 = 1
        t1.bCharge(); //기본 요금 확인 = 3000
        t1.Destination("구로디지털단지역"); //목적지 = 구로디지털단지역
        t1.Distance(12); //목적지까지 거리 = 12km
        t1.feeTotal(12); //지불할 요금  = 14000
        t1.fuelUsed(20); //주유량 = 0
        t1.Status(4); //상태 = 운행불가
        t1.feeTotal(17); //누적 요금  = 19000원


    }
}
