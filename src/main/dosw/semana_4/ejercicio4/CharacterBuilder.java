public interface CharacterBuilder {

    CharacterBuilder setArmor(String armor);

    CharacterBuilder setWeapon(String weapon);

    CharacterBuilder setSkill(String skill);

    GameCharacter build();
}