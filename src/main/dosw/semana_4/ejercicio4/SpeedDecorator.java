public class SpeedDecorator
        extends CharacterDecorator {

    public SpeedDecorator(
            CharacterComponent character) {

        super(character);
    }

    @Override
    public void attack() {

        System.out.println(
                "Velocidad extra activada"
        );

        character.attack();
    }
}