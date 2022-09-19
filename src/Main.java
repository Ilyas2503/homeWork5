public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("hero" + (i+1) + " " + createHeroes()[i]);

        }

        Boss myTanos = new Boss();
        myTanos.setHp(1000);
        myTanos.setDamage(800);
        myTanos.setDefence("superDefence! ");
        System.out.println("Tanos hp: " + myTanos.getHp() + " " +
                "damage: " + myTanos.getDamage() + " " +
                "defence: " + myTanos.getDefence());
    }


    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(800, 500, " Berserk");
        Hero hero2 = new Hero(850, 400, " wereWolf");
        Hero hero3 = new Hero(900, 700, " Ilyas");
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}

