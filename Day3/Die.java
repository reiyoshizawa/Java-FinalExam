package Day3;
//import java.lang;

public class Die {
    // states
    private int faceValue;
    private final int MAX = 6;

    // constructor
    public Die(){
        this.faceValue = 1;
    }

    // behaivors
    public void roll(){
        // generate a random int
        // Math.random() < 1 => 1以下だから+1が必要
        int rand = (int)(Math.random() * MAX) + 1;
        this.faceValue = rand;
    }

    public String toString() {
        return "Die : " + this.faceValue;
    }

    public  int getFaceValue(){
        return  faceValue;
    }

    public void setFaceValue(int faceValue){
        this.faceValue = faceValue;
    }
}
