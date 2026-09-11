class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}

public class ATMTest {
    public static void main(String[] args) {
        double balance = 8000.0;
        double withdrawAmount = 7500.0;
 
        // TODO: call withdraw() inside a try block,
        try{
            withdraw(balance, withdrawAmount);
        // catch InsufficientBalanceException,
        }catch (InsufficientBalanceException e){
            System.out.println(e);
        // and use finally to print "Transaction attempt completed."
        }finally{
            System.out.println("Transaction attempt completed");
        }
    }
 
    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        // TODO: throw InsufficientBalanceException if amount > balance
        if(amount>balance){
            throw new InsufficientBalanceException("You balance is very low");
        // otherwise print "Withdrawal successful. New balance: " + (balance - amount)
        }else{
            System.out.println("Withdrawal successful. New balance: "+(balance-amount));
        }
    }
}


