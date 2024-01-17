package BraveQ;

public class NhanVat {

    private int power, blood;
    private boolean Alive;

    public NhanVat(int power, int blood, boolean Alive) {
        this.power = power;
        this.blood = blood;
        this.Alive = Alive;
    }

    public String toString() {
        String res = "" ;
        if (this.Alive) {
            res = "ALIVE";
        } else {
            res = "DEAD";
        }
        return "POWER : " + this.power + "\nBLOOD : " + this.blood + "\n" + res + "\n-----------";
    }

    public void Witch(int power) {
        if (this.Alive) {
            if (power >= this.power) {
                this.power = 0;
                this.blood = 0;
                this.Alive = false;
            } else {
                this.power += 5;
            }
        }
    }

    public void mushroom() {
        if (Alive) {
            this.blood -= 15;
            this.power -= 2;

        }
    }

    public void pea() {
        if (Alive) {
            this.blood += 10;
            this.power += 2;
        }

    }

    public void solider(int power) {
        if (Alive) {
            if (power >= this.power) {
                this.power = 0;
                this.blood = 0;
                this.Alive = false;
            } else {
                this.blood += 5;
                this.power += 7;
            }
        }
    }
}
