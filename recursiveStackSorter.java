import java.util.Arrays;
import java.util.Stack;


public class RecursiveStack {
   
    static void stackInsert(Stack<Integer> s, int x){
        if(!s.empty()){
        if(s.peek()>x){
         int temp= s.pop(); 
         stackInsert(s,x);
         System.out.println("It: ");
         s.push(temp);
        }   
        }
        if(s.empty() || s.peek()<x ){
        s.push(x);}
    
    }
    
    public static void main(String[] args) {
        Stack s= new Stack();
       
         stackInsert(s, 8);
        stackInsert(s, 2);
        stackInsert(s, 1);
        System.out.println(Arrays.toString(s.toArray()));
        
    }
    
}
