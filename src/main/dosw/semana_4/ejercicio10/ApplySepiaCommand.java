public class ApplySepiaCommand
        implements Command {

    private ImageEditor editor;

    private ImageComponent previous;

    public ApplySepiaCommand(
            ImageEditor editor) {

        this.editor = editor;
    }

    @Override
    public void execute() {

        previous = editor.getImage();

        editor.setImage(
                new SepiaDecorator(
                        editor.getImage())
        );
    }

    @Override
    public void undo() {

        editor.setImage(previous);
    }
}