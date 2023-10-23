package LSP;

// Создан класс Square являющийся наследником абстрактного класса QuadRangle и класс QuadRangle никак не портится
public class Square extends QuadRangle{
    private int length;

    //Создан конструктор класса Square
    public Square(int length) {
        this.length = length;
    }
//Переопределен метод нахождения площади, из класса QuadRangle, для класса Square
    @Override
    public int area() {
        return this.length * this.length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
