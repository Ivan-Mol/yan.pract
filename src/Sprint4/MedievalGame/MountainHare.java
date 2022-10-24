package Sprint4.MedievalGame;
public class MountainHare {
    private final int age;
    private final double weight;
    private final double jumpLength;
    private static String color;

    // добавьте переменные и конструктор

    public static void setColor(String color) {
        MountainHare.color = color;
    }

    public MountainHare(int age, double weight, double jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}