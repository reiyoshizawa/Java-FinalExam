package Day3;

public class SnakeEyes {
    public static void main(String[] args){
        // 1. create 2 dice
        Die die1 = new Die();
        Die die2 = new Die();
        int count = 0;

        // 2. roll both dice 10 times (loop)
        for(int i = 0; i < 10; i++){
            // 3. check if both dice have the same face
            die1.roll();
            die2.roll();
            System.out.print("DIE 1: " + die1.getFaceValue());
            System.out.print(", DIE 2: " + die1.getFaceValue());
            if(die1.getFaceValue() == die2.getFaceValue()){
                //    - if true, count++
                count++;
            }
            //    - false, nothing
        }
        // 4. print some message
        System.out.println("Roll: 10 times.");
        System.out.println("SnakeEyes: " + count + " times.");
    }
}
