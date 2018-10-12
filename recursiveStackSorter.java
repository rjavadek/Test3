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
//This is a comment to be ignored. Let us see if it behaves as expected. 
//Try to add one more commit here.
//Playing with merges
//Let us try a merge here. And see how it pans out to our needs. 
//Trying to check if reset works. This message should go out. 
