package Sprint4.KinoApp;

import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        int allRuntime = 0;
        for (MediaItem item: mediaItems) {
            if (item instanceof Movie){
                allRuntime=allRuntime+item.getRuntime();
            }else {
                Series series = (Series) item;
                allRuntime = allRuntime +(series.getSeriesCount()*series.getRuntime());
            }
        }
        return (double) allRuntime/1440.0;
    }

}