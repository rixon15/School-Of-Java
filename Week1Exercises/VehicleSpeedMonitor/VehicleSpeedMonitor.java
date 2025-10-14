import java.util.Scanner;

void main() {
    int speed = 0;

    Scanner scanner = new Scanner(System.in);

    while(true) {

        System.out.print("Enter vehicle type (Car, Bus, Bike): ");
        String vehicleType = scanner.next();
        System.out.print("Enter speed: ");

        if(scanner.hasNextInt()) {
            speed = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please try again.");
            scanner.next();
            continue;
        }

        if(speed < 0) {
            System.out.println("Exiting system...");
            break;
        }

        /*int speedLimit = switch (vehicleType) {
            case "Car" -> 100;
            case "Bus" -> 80;
            case "Bike" -> 60;
            default -> -1;
        };*/

        int speedLimit = switch (vehicleType) {
            case String s when s.equalsIgnoreCase("car") -> 100;
            case String s when s.equalsIgnoreCase("bus") -> 80;
            case String s when s.equalsIgnoreCase("bike") -> 60;
            default -> -10;

        };

        if(speedLimit < 0) {
            System.out.println("Unknown vehicle type");
        } else if (speedLimit >= speed) {
            System.out.println("Speed OK");
        } else {
            System.out.println("Speeding!");
        }

    }
}
