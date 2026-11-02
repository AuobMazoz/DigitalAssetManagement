package projectdemo;

public class AudioAsset extends DigitalAsset {
    private double duration;

    public AudioAsset(String name, double fileSize, String format, double duration) {
        super(name, fileSize, format);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public void process() {
        System.out.println("Processing audio asset: " + name);
    }

    @Override
    public String toString() {
        return "AudioAsset{name='" + name
                + "', fileSize=" + fileSize
                + ", format='" + format
                + "', duration=" + duration + " seconds}";
    }
}