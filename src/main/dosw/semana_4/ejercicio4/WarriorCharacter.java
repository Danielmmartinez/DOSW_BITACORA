public class WarriorCharacter
        implements CharacterComponent {

    private GameCharacter character;

    public WarriorCharacter(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void attack() {

        System.out.println(
                "Atacando con "
                        + character.getWeapon()
                        + " usando habilidad "
                        + character.getSkill()
        );
    }
}