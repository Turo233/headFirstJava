abstract class Canine extends Animal {
    public void roam() {
    }

    ;
}

class Dog extends Animal {
};

public class MakeCanine {
    public void go() {
        Dog c;
        c = new Dog();
        c.roam();
    }


}
