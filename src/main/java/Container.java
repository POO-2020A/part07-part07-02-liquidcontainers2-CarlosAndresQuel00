
public class Container {

    private int amount;

    public Container() {
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        int liq = 0;
        if (amount > 0) {
            liq += amount;
            if (liq <= 100) {
                this.amount = liq;
            } else {
                this.amount = 100;
            }
        }
    }

    public void remove(int amount) {
        int liquid = 0;
        if (amount > 0) {
            liquid -= amount;
            if (liquid > 0) {
                this.amount = liquid;
            }
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
