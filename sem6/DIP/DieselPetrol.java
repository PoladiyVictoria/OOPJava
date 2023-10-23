package DIP;

// Создан класс DieselPetrol имплементирующий (реализующий) интерфейс Engine

public class DieselPetrol implements Engine {
   
   //Переопределен метод запуска двигателя из интерфейса Engine
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}
