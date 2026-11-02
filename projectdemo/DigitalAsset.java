package projectdemo;

public abstract class DigitalAsset implements Processable {
    protected String name;
    protected double fileSize;
    protected String format;

    public DigitalAsset(String name, double fileSize, String format) {
        this.name = name;
        this.fileSize = fileSize;
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("File size: " + fileSize + " MB");
        System.out.println("Format: " + format);
    }

    @Override
    public String toString() {
        return "DigitalAsset{name='" + name
                + "', fileSize=" + fileSize
                + ", format='" + format + "'}";
    }
}