package OCP;

// Создан класс Bus являющийся наследником класса Vehicle и класс Vehicle никак не меняется, 
//а расширяется для нахождения максимальной скорости автобуса 
public class Bus extends Vehicle{
    //Переопределен метод возвращающий максимальную скорость, из класса Vehicle, для класса Bus
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.5;
    }
// Конструктор класса Bus
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }
}
