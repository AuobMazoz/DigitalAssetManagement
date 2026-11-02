package projectdemo;

public class Model3D extends DigitalAsset {
    private int polygonCount;

    public Model3D(String name, double fileSize, String format, int polygonCount) {
        super(name, fileSize, format);
        this.polygonCount = polygonCount;
    }

    public int getPolygonCount() {
        return polygonCount;
    }

    public void setPolygonCount(int polygonCount) {
        this.polygonCount = polygonCount;
    }

    @Override
    public void process() {
        System.out.println("Processing 3D model: " + name);
    }

    @Override
    public String toString() {
        return "Model3D{name='" + name
                + "', fileSize=" + fileSize
                + ", format='" + format
                + "', polygonCount=" + polygonCount + "}";
    }
}