package code;

import java.util.Stack;

public class balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="[{}]";
		
		System.out.println(input +"is"+ (balanced(input)?" balanced":"Not balanced"));

	}

	private static boolean balanced(String s) {
		Stack<Character>st=new Stack<Character>();
		
		for(char c:s.toCharArray()) {
			if(c=='(' ||c=='{'||c=='[') {
				st.push(c);
			}
			else {
//				if(st.isEmpty())
//					return false;
				char top = st.pop();// [
				if((c==')'&& top!='(')||(c=='}'&& top!='{')||(c==']'&& top!='[')) {
					return false;
				}
			}
		}
		
		
		return st.isEmpty();
		// TODO Auto-generated method stub
		
	}

}
