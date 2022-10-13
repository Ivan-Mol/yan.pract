package Sprint3.BoBoPizza;
public class CarTimeCalculator {
    private double speedInMS;
    private double speed = 25; // средняя скорость в км/ч
    private String courierName;

    public CarTimeCalculator(String name) {
        courierName = name;
        speedInMS = new SpeedConverter(speed).getSpeedInMs();
    }

    public long getDeliveryTime(int distanceInMeters) {
        if (distanceInMeters <= 0) {
            return 1;
        }
        return (int)Math.ceil(distanceInMeters / speedInMS);
    }

    public String getCourierName() {
        return courierName;
    }
}