public class BankDemo {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        acc1.setAccountNumber(101);
        acc1.setBalance(5000);

        acc2.setAccountNumber(102);
        acc2.setBalance(10000);

        System.out.println("Bank Name: " + BankAccount.bankName);

        System.out.println("Account: " + acc1.getAccountNumber() +
                " Balance: " + acc1.getBalance());

        System.out.println("Account: " + acc2.getAccountNumber() +
                " Balance: " + acc2.getBalance());
    }
}
