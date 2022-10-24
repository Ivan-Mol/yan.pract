package Sprint4.Pets;

public class Cat extends Pet {
    public Cat() {
        super(4);
    }

    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }

    public void giveVoice() {
        System.out.println("мяу");
    }
}
