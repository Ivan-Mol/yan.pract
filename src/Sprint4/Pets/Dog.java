package Sprint4.Pets;

public class Dog extends Pet{
    public Dog() {
        super(4);
    }

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }

    @Override
    public void giveVoice() {
    }
}
