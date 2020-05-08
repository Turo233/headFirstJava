class Foo5{
    static final int x = 12;
    public void go (){
        System.out.println(x);
    }
}

public class SingleClass{
    public static void main(String[] args) {
        System.out.println(args);
        Foo5 foo5 = new Foo5();
        foo5.go();
    }
}