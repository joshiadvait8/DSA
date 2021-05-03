package DSA_Stacks;

public class Main {
    public static void main(String[] args) {
//        StringReverser sr = new StringReverser();
//        System.out.println(sr.reverse("abcd"));

        //Edge cases
        //(
        //(]
        //(()
        //)(
//        BalanceExpressions b = new BalanceExpressions();
//        System.out.println(b.isBalancedExpression("(<)"));

        Stack stack = new Stack(5);
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
//        stack.pop();
//        stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.toString());


        MinStack m = new MinStack();
        m.push(10);
        m.push(20);
        m.push(30);
        m.push(5);
        m.pop();
        System.out.println("Minstack min"+m.min());


        TwoStacks t = new TwoStacks(5);
        t.push1(10);
        t.push1(20);
        t.push2(100);
        t.push2(200);
        System.out.println(t.pop1());
        System.out.println(t.pop2());
        System.out.println(t.isEmpty1());
        System.out.println(t.toString());


    }

}
