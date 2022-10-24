package Sprint4.MedievalGame;
import java.util.List;

public class Forest {
    private final List<MountainHare> hares;
    private static String season;

    // объявите недостающие переменные и добавьте конструктор

    public Forest(List<MountainHare> hares,String season) {
        this.hares = hares;
        Forest.season = season;
        setSeason(season);
    }

    // добавьте метод setSeason(String newSeason)
    public static void setSeason(String newSeason){
        if (newSeason.equals("зима")){
            MountainHare.setColor("белый");
        }else{
            MountainHare.setColor("серо-рыжий");
        }
    }
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    public void printHares(){
        for (MountainHare hare:hares) {
            System.out.println(hare.toString());
        }
    }
    // добавьте метод printHares()

}