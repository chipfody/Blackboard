package pond.inland;
import pond.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();        //can't be accessed b/c floatInWater() is a protected class in Bird
    }
}
