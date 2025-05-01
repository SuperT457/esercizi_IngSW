import java.util.ArrayList;

class Stack<T>{
    private ArrayList<T> arr = new ArrayList<>();

    public void push(T element){
        arr.add(element);
    } 

    public void pop(){
        arr.removeLast();
    }

    public void peek(){
        System.out.println(arr.getLast());
    }

    public void getAll(){
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}

public class Main{
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();

        stack.push("Ciao");
        stack.push("bel");
        stack.getAll();        
        stack.peek();
        stack.pop();
        stack.getAll();
        stack.push("fra");
        stack.peek();
        stack.getAll();
    }
}