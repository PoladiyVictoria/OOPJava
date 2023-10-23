package ISP;

//Создан класс Cube (Куб) реализующий интерфес Shape3D (форма3Д)
public class Cube implements Shape3D {
    private int length;
//Добавлен конструктор класса Cube
    public Cube(int length) {
        this.length = length;
    }
//Добавлен метод получения длинны ребра куба
    public int getLength() {
        return length;
    }
//Добавлен метод создания длинны ребра куба
    public void setLength(int length) {
        this.length = length;
    }
//Переопределен метод нахождения площади из интерфейса Shape. Так как интерфейс Shape3D является наследником интерфейса Shape
    @Override
    public double area() {
        return this.length * this.length * 6;
    }
//Переопределен метод нахождения объема из интерфейса Shape3D.
    @Override
    public double volume() {
        return Math.pow(length, 3);
    }
}
