public class Ejercicio10 {

    public static void main(String[] args) {

        ImageEditor editor =
                new ImageEditor(
                        new BaseImage());

        Command command =
                new ApplySepiaCommand(editor);

        command.execute();

        System.out.println(
                editor.getImage().render());

        command.undo();

        System.out.println(
                editor.getImage().render());
    }
}