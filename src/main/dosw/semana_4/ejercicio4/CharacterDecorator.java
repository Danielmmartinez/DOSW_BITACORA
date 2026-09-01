public abstract class CharacterDecorator
        implements CharacterComponent {

    protected CharacterComponent character;

    public CharacterDecorator(
            CharacterComponent character) {

        this.character = character;
    }
}