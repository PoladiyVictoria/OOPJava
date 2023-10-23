package DIP;
// Создан класс Car зависящий от интерфейса Engine, 
//но не зависящий от классов DieselPetrol & PetrolEngine
public class Car {
    public Engine engine;
// Создан конструктор класса Car
    public Car(Engine engine) {
        this.engine = engine;
    }
    //Создан метод запуска двигателя через интерфейс Engine
    public void start(){
        engine.start();
    }
}
