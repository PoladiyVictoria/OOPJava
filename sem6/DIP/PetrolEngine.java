package DIP;

// Создан класс PetrolEngine имплементирующий (реализующий) интерфейс Engine

public class PetrolEngine implements Engine {
    
    //Переопределен метод запуска двигателя из интерфейса Engine    
    @Override
    public void start(){
        System.out.println("Бензиновый двигатель запущен");
    }
}
