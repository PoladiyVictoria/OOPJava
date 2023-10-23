package OCP;

//Создан класс Vehicle с переменными maxSpeed и type. В данном классе реализованны основные методы которые не требуют изменений,
//а могут быть только рассширены.
public class Vehicle {
    private int maxSpeed;
    private String type;
//Метод возвращения максимальной скорости
    public double calculateAllowedSpeed(){
        return maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
// Конструктор класса Vehicle
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }


}
