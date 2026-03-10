package prctice;

public class Stringcnncbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cnncbc";
		;
		System.out.println(stable(s));
	}

	private static String stable(String s) {
		 String t = removeconsec(s);
		 if(t.equals(s))
			 return t;
		 return stable(t);
	}

	private static String removeconsec(String s) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(i<s.length()-1&&s.charAt(i)==s.charAt(i+1)) 
				i++;
			else
			sb.append(s.charAt(i));
		}
		return sb.toString();
		// TODO Auto-generated method stub
		
	}

}
