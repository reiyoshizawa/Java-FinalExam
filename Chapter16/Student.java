package Chapter16;

public class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String n, int s) {
        this.name = n;
        this.score = s;
    }

    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
//        if (this.score < o.score) {
//            return -1;
//        } else if (this.score > o.score){
//            return 1;
//        }
//         return 0;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
