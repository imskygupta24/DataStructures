package Stack;

import java.util.Stack;

public class Question2RemoveAllAdjacentDuplicatesinString 
{
	
	public static String removeDuplicates(String s)
	{
		Stack<Character> stack=new Stack<>();
		for(char ch:s.toCharArray())
		{
			if(!stack.isEmpty() && stack.peek()==ch)
			{
				stack.pop();
			}
			else
			{
				stack.push(ch);
			}
		}
		StringBuilder sb=new StringBuilder();
		while(!stack.isEmpty())
		{
			sb.insert(0, stack.pop());
		}
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		String input = "abbaca";
		System.out.println("Input " + input);
		System.out.println("Output "+ removeDuplicates(input));
	}
}
