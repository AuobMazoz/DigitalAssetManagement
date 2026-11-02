package projectdemo;

public class Image2D extends DigitalAsset {
    private int width;
    private int height;

    public Image2D(String name, double fileSize, String format, int width, int height) {
        super(name, fileSize, format);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void process() {
        System.out.println("Processing 2D image: " + name);
    }

    @Override
    public String toString() {
        return "Image2D{name='" + name
                + "', fileSize=" + fileSize
                + ", format='" + format
                + "', width=" + width
                + ", height=" + height + "}";
    }
}