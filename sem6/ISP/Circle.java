package ISP;

//Создан класс Circle (Круг) реализующий интерфес Shape (форма)
public class Circle implements Shape {
    private int radius;
//Добавлен конструктор класса Circle
    public Circle(int radius) {
        this.radius = radius;
    }
//Добавлен метод получения радиуса круга
    public int getRadius() {
        return radius;
    }
//Добавлен метод создания радиуса круга
    public void setRadius(int radius) {
        this.radius = radius;
    }

//Переопределен метод нахождения площади из интерфейса Shape. Другие методы отсутствуют, так как они не требуются.
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
