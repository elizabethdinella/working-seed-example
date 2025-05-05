class BankAccount {

    public String accountHolder;
    public double balance;
    public boolean locked;

    private static final String admin = new String(new char[] {
        (char) ('6' + 1),  
            (char) ('`' + 3),  
            (char) ('e' + 1)   
    });


    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.locked = true;
    }

    public boolean deposit(double amount) {
        if (locked) return false;

        if (amount > 0) {
            balance -= amount; //Bug 1: deposit should add money!
            return true;
        }

        return false;
    }

    private int[] decode(String z) {
        // Obfuscated decoding logic
        int val = 0;
        for (int i = 0; i < z.length(); i++) {
            int d = Character.digit(z.charAt(i), 16);
            val = (val << 4) | d;
        }

        int[] out = new int[4];
        for (int i = 3; i >= 0; i--) {
            out[i] = val % 10;
            val /= 10;
        }

        return out;
    }


    private static boolean eq(String pin, int[] digits) {
        if (pin.length() != digits.length) return false;
        for (int i = 0; i < digits.length; i++) {
            if (pin.charAt(i) != ('0' + digits[i])) return false;
        }
        return true;
    }


    public void unlock(String pin) {
        //check if account holder is admin
        if (eq(pin, decode(admin))) { 
            locked = false;
            return;
        }
    }

    public boolean withdraw(double amount) {
        if (locked) return false;

        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void printBalance() {
        System.out.println(accountHolder + "'s balance: " + balance);
    }
}
