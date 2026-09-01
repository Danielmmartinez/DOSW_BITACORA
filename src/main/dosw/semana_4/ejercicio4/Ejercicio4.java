public class Ejercicio4 {

    public static void main(String[] args) {

        GameCharacter warrior =
                new WarriorBuilder()
                        .setArmor("Acero")
                        .setWeapon("Espada")
                        .setSkill("Rage")
                        .build();

        CharacterComponent player =
                new WarriorCharacter(warrior);

        player =
                new ShieldDecorator(
                        new SpeedDecorator(player));

        player.attack();
    }
}