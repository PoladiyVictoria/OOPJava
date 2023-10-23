package LSP;
// Создан класс Rectangle являющийся наследником абстрактного класса QuadRangle и класс QuadRangle никак не портится
public class Rectangle extends QuadRangle {
    private int width;
    private int height;
//Создан конструктор класса Rectangle 
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
//Переопределен метод нахождения площади, из класса QuadRangle, для класса Rectangle 
    @Override
    public int area() {
        return this.height * this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
