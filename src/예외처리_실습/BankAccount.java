package 예외처리_실습;

public class BankAccount {
    private int balance;        // 잔액

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void desosit(int amount) throws InvalidAmountException {   // 입금
        if (amount > 0) {
            balance += amount;
            System.out.printf("[입금 성공] %,d원 입금 → 잔액 : %,d원\n", amount, balance);
        }
        else throw new InvalidAmountException(amount);
    }

    public void withdraw(int amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) throw new InvalidAmountException(amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("[출금 성공] %,d원 출금 → 잔액 : %,d원\n", amount, balance);
        }
        else throw new InsufficientBalanceException(balance, amount);
    }

    public int getBalance() { return balance; }
}

class InsufficientBalanceException extends Exception {
    private Integer amount = null;
    private Integer balance = null;

    public InsufficientBalanceException(Integer balance, Integer amount) {
        this.balance = balance;
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return "[오류] 잔액이 부족합니다.\n요청 : " + amount + "원 / 잔액 : " + balance + "원";
    }
}

class InvalidAmountException extends Exception {
    private Integer amount = null;

    public InvalidAmountException(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return "[오류] 입금/출금 요청 금액이 0원 이하 입니다. 입력값 : " + amount;
    }
}