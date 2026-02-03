
import java.util.NoSuchElementException;

public class CercullarArrayQueue<T> {
    public static void main(String[] args) {
        CercullarArrayQueue <Integer> result=new CercullarArrayQueue<>();
        result.Enqueue(596);
        result.Enqueue(98);
        result.Enqueue(54);
        result.Enqueue(69);
        result.DisplayArray();
        result.Search(596);
        Integer out=result.Dequeue();
//     result.DisplayArray();
        System.out.println("the removed item:"+out);
        System.out.println("the first element:"+result.First());
        System.out.println("the size of the Queue:"+ result.Size());
        System.out.println("Check the Array Queue if it is Empty: "+ result.IsEmpty());
        System.out.println();


//    result.Enqueue(20);
    }
    private final static int DEFAULT=7;
    private int front,rear,count;
    private T[] queue;
    public CercullarArrayQueue(int initialization){
        front=rear=count=0;

        queue = (T[]) new Object[initialization];

    }
    public CercullarArrayQueue(){
        this(DEFAULT);
    }
    public void Enqueue(T element){
        if(Size()==queue.length){
            throw new NoSuchElementException("Queue is full");
        }
        if(isduplicate(element)){
            System.out.println("this element alredy in use");
            return;
        }
        queue[rear]=element;
        rear= (rear +1)% queue.length;
        count++;
    }
    public T Dequeue(){
        if(IsEmpty())
            throw new NoSuchElementException("Queue is Empty");
        T removed=queue[front];
        queue[front]=null;
        front=(front+ 1)% queue.length;
        count--;
        return removed;
    }
    public T First(){
        if(IsEmpty())
            throw new NoSuchElementException(" Queue Is Empty");
        return queue[front];
    }
    public void Search(T item){
        int index =front;
        for(int i=0;i<count;i++){
            if(queue[index]==item){
                System.out.println("found the Item:"+queue[index]);
                return;
            }
            index=(index + 1)% queue.length;
        }
        System.out.println("Item not Found");
    }
    public boolean isduplicate(T element){
        int index=front;
        for (int i=0; i<count;i++){
            if(queue[index]==element)
                return true;
            index=(index + 1)% queue.length;
        }
        return false;
    }
    public int Size(){
        return count;
    }
    public boolean IsEmpty(){
        return count==0;
    }
    public void DisplayArray(){
        if(IsEmpty())
            throw new NoSuchElementException("queue Is Empty");
        int index =front;
        for(int i=0; i<count; i++){
            System.out.println(queue[index] + " ");
            index=(index + 1)% queue.length;
        }
        System.out.println();
    }
}

