package Sprint4.Pets;

public abstract class Pet {
    int pawsCount;

    public int getPawsCount() {
        return pawsCount;
    }

    public void sleep(){
        System.out.println("Сплю");
    }
    public void play(){
        System.out.println("Играю");
    }

    public Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public abstract void giveVoice();
}
