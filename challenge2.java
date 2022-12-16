import java.util.Scanner;
import java.util.Stack;

public class challenge2 {
    
    public static boolean bracketchecker(String input){
        if(input.length()%2 !=0) return false; //make sure the input is in pairs

        Stack <Character> stack=new Stack();
        
        //loop thru string and convert into a char array
        for(char b:input.toCharArray() )
        {
            if (b =='(' || b =='{' || b == '[' ){
                stack.push(b);
            }
            // ()
            else if(b==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            //{}
            else if(b=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            //[]
            else if(b==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            
        }
        // if sucess, then stack should be empty as its all popped off
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Enter brackets");
        Scanner in=new Scanner(System.in);
        String userinput=in.nextLine();
        
        boolean result=bracketchecker(userinput);
        System.out.println("Result: " + result);
    }
}