public class Car {
    String model;
    int wheels = 4;
    public Car(String model) {
        this.model = model;
    }

    public void drive() {
        if (this.wheels == 4) {
            System.out.println(this.model + " goes vroom");
        } else {
            System.out.println(this.model + " goes pbtt");
        }
    }

    public void driveIntoDitch(int wheelsLost) {
        wheels -= wheelsLost;
    }
}
