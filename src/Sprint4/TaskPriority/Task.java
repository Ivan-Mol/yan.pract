package Sprint4.TaskPriority;

public class Task {

    private final TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private final String description;

    // добавьте конструктор класса

    public Task(TaskPriority priority, String description) {
        this.description = description;
        this.priority = priority;
    }
    // добавьте метод get для приоритета

    public String getDescription() {
        return description;
    }

    public TaskPriority get() {
        return priority;
    }
}