public class Car {
    private int number;
    private String mark;
    private String model;
    private String nitroSpeed;
    private String color;
    private String speed;

    public Car(int number, String mark, String model, String nitroSpeed, String color, String speed) {
        this.number = number;
        this.mark = mark;
        this.model = model;
        this.nitroSpeed = nitroSpeed;
        this.color = color;
        this.speed = speed;
    }

    public void info() {
        System.out.println("The car number " + number + ", " + mark + ", model is " + model + ", nitro speed is " + nitroSpeed + ", color is " + color + ", speed is " + speed);
    }

    public static void main(String[] args) {
        Car car1 = new Car(1, "Ford", "Fiesta", "Not available", "Gray", "188/h");
        Car car2 = new Car(2, "Opel", "Crossland x", "Turbo D", "White", "178/h");

        car1.info();
        car2.info();
    }
}
