package Chapter16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class YourPriorityQueue {

    private List<Student> list;

    public YourPriorityQueue() {
        this.list = new LinkedList<>();
    }

    // enqueue (offer)
    // 80
    // list 60 70 80
    public void enqueue(Student newStudent) {
        if (list.size() == 0) {
            list.add(newStudent);
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (newStudent.compareTo(list.get(i)) < 0) {
                    list.add(i, newStudent);
                }
            }
        }
    }

    // dequeue (poll)
    public Student dequeueMin() {
        if (list.isEmpty()) {
            System.out.println("The Queue is empty.");
            return null;
        }

        return list.remove(0);
    }

    // peek()
    public Student peek() {
        if (this.isEmpty()) {
            System.out.println("The Queue is empty.");
            return null;
        }
        // sort - expensive operation
        Collections.sort(this.list);
        return this.list.get(0);
    }

    // size()
    public int size() {
        return this.list.size();
    }

    // isEmpty()
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

}
