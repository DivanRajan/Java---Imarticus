package Collections;

import java.util.Stack;

public class StackEmptyMethod {

	public static void main(String[] args) {
		Stack<Integer>stk=new Stack<>();
		boolean result=stk.empty();
		System.out.println("is the stack empty?"+result);
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		System.out.println("Elements in stack:"+stk);
		result=stk.empty();
		System.out.println("is the stackk empty?"+result);
	}

}
