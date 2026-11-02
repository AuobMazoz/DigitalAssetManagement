package projectdemo;

public class ProjectDemo {
    public static void main(String[] args) {
        Model3D model = new Model3D("Office Model", 25.5, "OBJ", 12000);
        Image2D image = new Image2D("Project Logo", 2.4, "PNG", 1920, 1080);
        AudioAsset audio = new AudioAsset("Background Music", 8.7, "MP3", 180);

        System.out.println(model);
        model.process();

        System.out.println(image);
        image.process();

        System.out.println(audio);
        audio.process();
    }
}