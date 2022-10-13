package Sprint3.FoundOffice;
import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things = new ArrayList<>();

    // реализуйте метод put()
    public void put(Object o) {
        things.add(o);
    }

    // реализуйте метод check()
    public boolean check(Object target) {
        for (Object object : things) { // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}


