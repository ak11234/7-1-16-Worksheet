import java.util.Arrays;

/**
 * Created by Adam on 7/1/2016. Worksheet 7
 */
public class SimpleQueue {
    public static void main(String[] args){
        SimpleQueue q = new SimpleQueue();
        for (int k = 0 ; k < 10 ; k++) {
            q.enqueue(k);
        }
        System.out.println(q);
        System.out.println(q.isEmpty()); // false
        for (int k = 0 ; k < 10 ; k++)
            System.out.println(q.dequeue());
        System.out.println(q.isEmpty()); // true
        System.out.println(q.dequeue()); // null
    }
    private Object[] myElements;
    private int currentPosition;
    private int size;
    private int front;
    private int back;
    public SimpleQueue(){
        size=10;
        front=size-1;
        back=front;
        myElements=new Object[size];
    }
    public boolean isEmpty(){
        return (myElements[front]==null);
    }
    public boolean enqueue(Object toAdd){
        if (back<0){
            return false;
        } else {
            myElements[back] = toAdd;
            back--;
            return true;
        }
    }
    public Object front(){
        return myElements[front];
    }
    public Object dequeue(){
        Object result=myElements[front];
        myElements[front]=null;
        if (front!=0){
            front--;
        }
        return result;
    }
    public String toString(){
        return Arrays.toString(myElements);
    }
}
