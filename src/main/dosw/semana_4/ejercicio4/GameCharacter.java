public class GameCharacter {

    private String armor;
    private String weapon;
    private String skill;

    public GameCharacter(String armor,
                         String weapon,
                         String skill) {
        this.armor = armor;
        this.weapon = weapon;
        this.skill = skill;
    }

    public String getArmor() {
        return armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getSkill() {
        return skill;
    }
}