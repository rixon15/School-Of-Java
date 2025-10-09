void main() {

    int number = 70;
    int negated = ~number;
    System.out.println(negated);   // -71
    System.out.println(~negated);  // 70

    double zooTemperature = 1.21;
    System.out.println(zooTemperature);  // 1.21
    zooTemperature = -zooTemperature;
    System.out.println(zooTemperature);  // -1.21
    zooTemperature = -(-zooTemperature);
    System.out.println(zooTemperature);  // -1.21

    int parkAttendance = 0;
    System.out.println(parkAttendance);    // 0
    System.out.println(++parkAttendance);  // 1
    System.out.println(parkAttendance);    // 1
    System.out.println(parkAttendance--);  // 1
    System.out.println(parkAttendance);    // 0
}
