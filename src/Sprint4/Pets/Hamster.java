package Sprint4.Pets;

public class Hamster extends Pet{
    public Hamster() {
        super(4);
    }

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }

    @Override
    public void giveVoice() {

    }
}
