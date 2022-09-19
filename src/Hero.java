public class Hero {
    private int hp;
    private int damage;
    private String power;

    public Hero(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String toString() {
        return " Hero: " + "" +
                " hp " + hp +
                " damage " + damage +
                " power " + power;
    }

    public Hero(int hp, int damage, String power) {
        this.hp = hp;
        this.damage = damage;
        this.power = power;
    }
}
