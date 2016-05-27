import java.util.Stack;

public class Reverse {

	public static String reverseMe(String string) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<>();
		for(char c: string.toCharArray()){
			st .push(c);
			
		}
		StringBuilder sB = new StringBuilder();
		while(!st.isEmpty()){
			sB.append(st.pop());
		}
		return sB.toString();
	}

}
