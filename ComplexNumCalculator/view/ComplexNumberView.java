package ComplexNumCalculator.view;

import ComplexNumCalculator.data.ComplexNumber;

public class ComplexNumberView {
    public void sendOnConsoleSum(ComplexNumber num){
        System.out.println("Сумма = " + num);
    }
    
    public void sendOnConsoleMult(ComplexNumber num){
        System.out.println("Произведение = " + num);
    }

    public void sendOnConsoleDiv(ComplexNumber num){
        System.out.println("Результат деления = " + num);
    }
}
