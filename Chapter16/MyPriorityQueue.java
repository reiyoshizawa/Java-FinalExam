//package Chapter16;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class MyPriorityQueue {
//
//    private List<Student> list;
//
//    public MyPriorityQueue() {
//        this.list = new ArrayList<>();
//    }
//
//    // enqueue (offer)
//    public void enqueue(Student newStudent) {
//        this.list.add(newStudent);
//    }
//
//    // dequeue (poll)
//    public Student dequeueMin() {
//        if (list.isEmpty()) {
//            System.out.println("The Queue is empty.");
//            return null;
//        }
//
//        Student min = list.get(0);
//        int min = 0;
//        for (Student student: this.list) {
//            min = student;
//        }
//        return min;
//    }
//
//    // peek()
//    public Student peek() {
//        if (this.isEmpty()) {
//            System.out.println("The Queue is empty.");
//            return null;
//        }
//        // sort - expensive operation
//        Collections.sort(this.list);
//        return this.list.get(0);
//    }
//
//    // size()
//    public int size() {
//        return this.list.size();
//    }
//
//    // isEmpty()
//    public boolean isEmpty() {
//        return this.list.isEmpty();
//    }
//
//}
