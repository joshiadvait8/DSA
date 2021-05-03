package DSA_Stacks;

public class StringReverser {

    public String reverse(String input){
        java.util.Stack<Character> stk = new java.util.Stack<>();
        for(char c : input.toCharArray()){
            stk.push(c);
        }
        int size = stk.size();
        StringBuffer reversedString = new StringBuffer();
        while(!stk.empty()){
            reversedString.append(stk.pop());
        }
        return reversedString.toString();
    }

}
