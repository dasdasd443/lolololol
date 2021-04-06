import java.util.Random;
public class Boy {
    public static String returnName(){
        Random rand = new Random();
        String[] randomBoyNames = {"Artour","Babaev","Topias","Calvin","Henrik"};
        return randomBoyNames[rand.nextInt(5)];
    }
}
