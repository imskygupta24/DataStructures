package Stack;

import java.util.Stack;

public class Question1ValidParentheses 
{
	
	public static boolean isvalid(String s)
	{
		Stack<Character> stack =new Stack<>();
		for(char ch:s.toCharArray())
		{
			switch(ch)
			{
			case '(' : case '{' : case '[':
				stack.push(ch);
				break;
				
			case ')':
				if(stack.isEmpty() || stack.pop()!='(')
					return false;
				break;
				
			case '}':
				if(stack.isEmpty() || stack.pop()!='{')
					return false;
				break;
				
			case ']':
				if(stack.isEmpty() || stack.pop()!='[')
					return false;
				break;
			}
		}
		
		return stack.isEmpty();
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Input : s = ([]){}");
		System.out.println(isvalid("([{}])"));
	}
}
