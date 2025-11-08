import java.util.Arrays;
public class StackMain {
    public static void main(String[] args) {
        StrokeAssign<String> s1=new StrokeAssign<>();
        s1.push_add("Ali");
        s1.push_add("mohamed");
        s1.push_add("ahmed");
        s1.push_add("mohamud");
        s1.display();
        System.out.println("-----------------------");
        String out = s1.pop();
        System.out.println("Removed element: " + out);
        System.out.println("The last element: " + s1.peek());
        System.out.println("The size of the stack: " + s1.size());
        System.out.println("check if it empty: "+ s1.IsEmpty());
    }
}
