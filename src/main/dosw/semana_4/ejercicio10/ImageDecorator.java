public abstract class ImageDecorator
        implements ImageComponent {

    protected ImageComponent image;

    public ImageDecorator(
            ImageComponent image) {

        this.image = image;
    }
}