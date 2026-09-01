public class SepiaDecorator
        extends ImageDecorator {

    public SepiaDecorator(
            ImageComponent image) {

        super(image);
    }

    @Override
    public String render() {

        return image.render()
                + " + Filtro Sepia";
    }
}