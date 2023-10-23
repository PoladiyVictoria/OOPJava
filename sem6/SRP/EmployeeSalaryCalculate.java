package SRP;

//Создан класс EmployeeSalaryCalculate (Расчет ЗП сотрудника) который предназначен только для расчета ЗП сотрудника. 
//Методы, или метод если он один, реализованые в данном классе могут быть применены к конкретному сотруднику.
public class EmployeeSalaryCalculate {
    private int baseSalary;
//конструктор класса EmployeeSalaryCalculate
    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }
//Метод рассчета ЗП сотрудника
    public double salaryCalculate(){
        return this.baseSalary * 1.5;
    }
}
