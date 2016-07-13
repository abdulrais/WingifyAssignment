
import java.util.Random;

/**
 *
 * @author coarpder
 */
public class Name {
    String name;
    int max=15,min=6;
    Random random=new Random();
    int randomNo=random.nextInt(max-min+1)+min;

    public Name(String name) {
        this.name = name;
        this.randomNo = randomNo;
    }

    @Override
    public String toString() {
        return name +" "+ randomNo;
    }
}
