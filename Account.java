public class Account {
    int ID;
    double ammount;
    int PIN;

    Account(int ID, double ammount, int PIN) {
        this.ID = ID;
        this.ammount = ammount;
        this.PIN = PIN;
    }

    void getInfo() {
        System.out.println("Account " + ID + " has " + ammount + " dollars on it's balance");
    }

    void balanceOperation(boolean k, double n) {
        if (k == true) {
            ammount += n;
            System.out.println("Success! You now have " + ammount + " on your balance");
        } else if (k == false && this.ammount >= n) {
            ammount -= n;
            System.out.println("Success! You now have " + ammount + " on your balance");
        } else {
            System.out.println("Error! There are not enough funds in the account");
        }
    }
}
