package code;

import java.util.Stack;

public class Stakparanthesis {

	public static boolean isBalanced(String testCase){

		Stack<Character> stack = new Stack<>();

		for(char ch : testCase.toCharArray()){

		if(ch == '(' || ch == '{' || ch == '['){

		stack.push(ch);

		} else{

		if (stack.isEmpty())

		return false;

		char top = stack.pop();

		if((ch == ')' && top != '(')

		|| (ch == '}' && top != '{')

		|| (ch == ']' && top != '[')){

		return false;

		}

		}

		}

		return stack.isEmpty();

		}

		public static void main(String[] args) {

		String[] testCases = {"({[)}]", "([)]", "(]","()","{[]}"};

		for(String testCase : testCases){

		System.out.println(testCase + " is " + (isBalanced(testCase) ? "Balanced" : "Not Balanced"));

		}

		}

}
