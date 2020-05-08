
abstract class AnimalB {
    private String name;

    public String getName(){
        return name;
    }
    public AnimalB(String theName){
        name = theName;
    }
}

class Hippo extends AnimalB{
    public Hippo(String name){
        super(name);
        System.out.println("Hippo");
    };
}

public class MakeHippo {
    public static void main(String[] args) {

    }

}

