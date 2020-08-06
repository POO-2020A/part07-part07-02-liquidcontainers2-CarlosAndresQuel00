
public class Container {

    private int amount;

    public Container() {
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount > 0 && this.amount + amount <= 100) {
            this.amount += amount;
        } else {
            this.amount = 100;
        }
    }

    public void remove(int amount) {
        if (this.amount - amount > 0) {
            this.amount -= amount;
        } else {
            this.amount = 0;
        }
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return this.amount + "/100";
    }
}
