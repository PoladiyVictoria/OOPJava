package SRP;

//Создан класс Employee (Сотрудник) который предназначен только для получения точных данных сотрудника. 
//Эти данные могут быть применимы для всех сотрудников
public class Employee {
    private String name;
    private String dol;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDol() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }
//Конструктор класса Employee
    public Employee(String name, String dol) {
        this.name = name;
        this.dol = dol;
    }
}
