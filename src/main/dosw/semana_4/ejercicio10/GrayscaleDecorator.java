public class GrayscaleDecorator
        extends ImageDecorator {

    public GrayscaleDecorator(
            ImageComponent image) {

        super(image);
    }

    @Override
    public String render() {

        return image.render()
                + " + Blanco y Negro";
    }
}