package ComplexNumCalculator.view;

import ComplexNumCalculator.data.Logger;

public class LoggerView implements Logger {
    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
