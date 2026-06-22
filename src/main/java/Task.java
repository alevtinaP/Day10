public class Task {
private String title;
private boolean isCompleted;

//Создаем конструктор класса
public Task(String title) {
    this.title = title;
    this.isCompleted = false;
}

public void complete() {
    this.isCompleted = true;
}
}

