package myException;

public class Account {
    protected double balance;

    protected Account(double initBalance) {
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) throws OverdriveException {
        if (amt <= balance) {
            balance -= amt;
        } else {
            throw new OverdriveException("Dana anda tidak mencukupi", amt - balance);
        }
    }

    public static void main(String[] args) {
        System.out.println("\n");
        int i;
        Account[] acc = new Account[100];
        acc[0] = new Account(2000000);
        acc[1] = new Account(0);

        for (i = 0; i < 2; i++) {
            double d = acc[i].getBalance();
            System.out.println("Saldo akhir akun ke " + i + " adalah Rp. " + d);
            try {
                acc[i].withdraw(1000000);
            } catch (OverdriveException e) {
                System.out.println("Eksepsi akun ke " + i + " adalah " + e);
            } finally {
                double b = acc[i].getBalance();
                System.out.println("Saldo setelah diambil 1jt akun ke " + i + " adalah Rp. " + b);
            }
        }
        System.out.println("\n");
    }
}
