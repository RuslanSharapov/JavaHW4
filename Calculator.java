//   В калькулятор добавьте возможность отменить последнюю операцию.


import java.util.Stack;

public class Calculator {
    private Stack<Integer> stack;
    private int result;

    public Calculator() {
        stack = new Stack<Integer>();
        result = 0;
    }

    public void performOperation(char operator, int num) {
        stack.push(result);
        if (operator == '+') {
            result += num;
        } 
        else if (operator == '-') {
            result -= num;
        } 
        else if (operator == '*') {
            result *= num;
        } 
        else if (operator == '/') {
            result /= num;
        }
    }

    public void cancel() {
        if (!stack.isEmpty()) {
            result = stack.pop();
        }
    }

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.performOperation('+', 10);
        c.performOperation('*', 2);
        c.performOperation('-', 3);
        // должен напечатать 17
        System.out.println("Результат: " + c.getResult());
        c.cancel();
        // должен напечатать 20
        System.out.println("Результат после отмены: " + c.getResult());
    }
}
