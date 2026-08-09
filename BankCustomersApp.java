  import java.util.*;
class BankCustomer {
    private String name;
    private int[] balances;
    BankCustomer(String n) {
        name = n;
        balances = new int[5];
    }

    BankCustomer(String n, int[] b) {
        name = n;
        balances = new int[5];
        for (int i = 0; i < balances.length && i < b.length; i++) {
            if (b[i] < 0) throw new IllegalArgumentException();
            balances[i] = b[i];
        }
    }
    void addAccountBalance(int[] b) {
        int j = 0;
        for (int i = 0; i < balances.length && j < b.length; i++) {
            if (balances[i] == 0) {
                if (b[j] < 0) throw new IllegalArgumentException();
                balances[i] = b[j++];
            }
        }
    }
    int[] getAccountBalances() { return balances; }
    String getCustomerName() { return name; }
    void displayAccountBalances() {
        System.out.println(Arrays.toString(balances));
    }
}

public class BankCustomersApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       