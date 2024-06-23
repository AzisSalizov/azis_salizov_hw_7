public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(230, 20, "Magic Attack"),
                new Medic(100, 10, "Healing", 35),
                new Warrior(250, 40, "Critical Damage"),
        };
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
                System.out.println("У медика увеличивалось количество единиц лечения на 10% : " + ((Medic) hero).getHealPoints());
            }
        }
    }
}