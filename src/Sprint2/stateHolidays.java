package Sprint2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class stateHolidays {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
        stateHolidays.put("Январь",new ArrayList<>(Arrays.asList(1,7)));
        stateHolidays.put("Февраль",new ArrayList<>(Arrays.asList(23)));
        stateHolidays.put("Март",new ArrayList<>(Arrays.asList(8)));
        stateHolidays.put("Май",new ArrayList<>(Arrays.asList(1,9)));
        stateHolidays.put("Июнь",new ArrayList<>(Arrays.asList(12)));
        stateHolidays.put("Ноябрь",new ArrayList<>(Arrays.asList(4)));



    }
}
