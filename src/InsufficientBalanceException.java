public class InsufficientBalanceException extends RuntimeException{
    static void insufficientBalanceException() {
        if(new MyCatCafe().getBalance()<0){
            throw new InsufficientBalanceException();
    }
}
}
