import java.util.Arrays;
import java.util.EmptyStackException;
public class StrokeAssign <K> {
   private static final int FIXED_NUM = 4;
   private int top;
   private K[] Array;

    ///  constructors
   StrokeAssign(){
       this(FIXED_NUM);

   }
   StrokeAssign (int initial){
       top =0;
       Array = (K[]) (new Object[initial]);

   }
///  add ELEMENT array top of the stack
   public void push_add(K element){
       if (size()==Array.length)
            throw new IllegalStateException("Array length is Full");
//           extend();
       Array[top]= element;
       top++;

   }
   /// COPYING and extending the length of arrays
   public void extend(){

       Array=Arrays.copyOf(Array, Array.length*4);
   }
   /// roving top elements
   public  K pop() throws  EmptyStackException{
       if (IsEmpty())
           throw new EmptyStackException();
       top--;
       K RomovedElm=Array[top];
       Array[top]=null;
       return RomovedElm;

   }
   public K peek(){
       if(IsEmpty())
           throw new EmptyStackException();
       return Array[top-1];
   }
    public void display(){
        if (IsEmpty())
            throw new EmptyStackException();

        System.out.println("Stack Elements: ");
        for (int i = 0; i< top;i++)
            System.out.println(Array[i] + " ");
        System.out.println();
    }
    /// RETURNING SIZE OF THE TOP VALUE
   public  int size(){

       return top;
   }
    ///  Returns if array is empty
    public boolean IsEmpty(){
        return top==0;
    }
}


