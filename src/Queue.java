/**
 * Created by Adam on 7/1/2016. Worksheet 7
 */
public interface Queue
{
    public boolean isEmpty();
    public boolean enqueue(Object element);
    public Object dequeue();
    public Object front();
}
