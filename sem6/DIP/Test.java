package DIP;

public class Test {
    public static void main(String[] args) {
        //Создается переменная типа Car в которой определяется точный тип двигателя путем определения необходимого класса. 
        //И запускаем метод запуска двигателя
        Car car = new Car(new PetrolEngine());
        car.start();
        car = new Car(new DieselPetrol());
        car.start();
    }
}
