import java.util.ArrayList;

public class DomComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();

        ArrayList<String> locations = new ArrayList<String>();
        locations.add("2");
        locations.add("3");
        locations.add("4");
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }

}

class DotCom {
    private ArrayList<String> locations;
    private String name;

    void setName (String givenName){
        name = givenName;
    }

    String getName(){
        return name;
    }

    void setLocationCells(ArrayList<String> loc) {
        locations = loc;
    }

    String checkYourself(String location) {
        String result = "miss";
        int index = locations.indexOf(location);
        if (index >= 0) {
            locations.remove(index);
            if (locations.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
