import java.util.*;

public class Die {
    private int faceValue = 0;
    
    public Die() {

    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        var rand = new Random();
        faceValue = rand.nextInt(6) + 1;
    }
}