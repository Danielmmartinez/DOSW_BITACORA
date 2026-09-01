public class WarriorBuilder implements CharacterBuilder {

    private String armor;
    private String weapon;
    private String skill;

    @Override
    public CharacterBuilder setArmor(String armor) {
        this.armor = armor;
        return this;
    }

    @Override
    public CharacterBuilder setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    @Override
    public CharacterBuilder setSkill(String skill) {
        this.skill = skill;
        return this;
    }

    @Override
    public GameCharacter build() {
        return new GameCharacter(
                armor,
                weapon,
                skill
        );
    }
}