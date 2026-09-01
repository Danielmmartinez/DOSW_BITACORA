public class ShieldDecorator
        extends CharacterDecorator {

    public ShieldDecorator(
            CharacterComponent character) {

        super(character);
    }

    @Override
    public void attack() {

        System.out.println(
                "Escudo de hielo activado"
        );

        character.attack();
    }
}