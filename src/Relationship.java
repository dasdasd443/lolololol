import java.util.Random;

public class Relationship {
    public static String returnRelationships(){
        Random rand = new Random();
        String[] relationships = {"hates","is in love with","is indifferent to","does not like","likes"};
        return relationships[rand.nextInt(5)];
    }
}
