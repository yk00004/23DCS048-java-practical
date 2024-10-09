
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

public class pr26 {
    public static void main(String[] args) {
        try {
            withdraw(1000, 1500);  
            withdraw(-500, 200);   
            divide(10, 0);         
            String s = null;
            printLength(s);        
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }catch( InvalidAmountException e){
            System.out.println(e);
        }
    }

    public static void withdraw(int balance, int amount) throws InsufficientBalanceException, InvalidAmountException {
        if (balance < 0) {
            throw new InvalidAmountException("Invalid amount entered");
        }
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance");
        } else {
            System.out.println("Withdrawal successful");
        }
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);  
    }

    public static void printLength(String s) {
        System.out.println(s.length());
    }
}