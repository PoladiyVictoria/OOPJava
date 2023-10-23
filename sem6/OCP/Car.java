package OCP;

// Создан класс Car являющийся наследником класса Vehicle и класс Vehicle никак не меняется, 
//а расширяется для нахождения максимальной скорости автомобиля 
public class Car extends Vehicle{
    // Конструктор класса Car
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }
//Переопределен метод возвращающий максимальную скорость, из класса Vehicle, для класса Car
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}
