import java.util.*;
public class stack {
    public static void main(String[]args){
        Stack<Integer>s = new Stack<>();
        s.add(1);//push or add are valid statement
        s.add(2);//push or add are valid statement
        s.add(3);//push or add are valid statement
        s.add(4);//push or add are valid statement
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
