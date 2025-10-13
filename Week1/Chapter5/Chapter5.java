public class Chapter5  {

    static void main() {

        ParkTrip parkTrip = new ParkTrip();
        PolarBear polarBear = new PolarBear();
        VisitAttraction visitAttraction = new VisitAttraction();
        visitAttraction.walk2(5, 6,8,10,12);
    }


}

class ParkTrip {
    public void skip1() {}
   // default void skip2() {} // DOES NOT COMPILE
   // void public skip3() {}  // DOES NOT COMPILE
    void skip4() {}
}

class PolarBear {
    final int age = 10;
    final int fishEaten;
   // final String name; Does not compile

    {fishEaten = 10;}

    public void PolareBear() {
        //name = "Robret";
    }

}

class VisitAttraction {
    public void walk1(int... steps) {}
    public void walk2(int start, int... steps ){

        System.out.println(start);

        for(int num : steps) {
            System.out.println(num);
        }
    }
}

