package Stack;

import java.util.Stack;

public class Question3BaseballGameScores {

	
	public static int calculateScore(String ops[])
	{
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<ops.length;i++)
		{
			if(!stack.isEmpty() && ops[i].equals("C"))
			{
				stack.pop();
			}
			else if(!stack.isEmpty() && ops[i].equals("D"))
			{
				stack.push(2 * stack.peek());
			}
			else if(!stack.isEmpty() && ops[i].equals("+"))
			{
				int last=stack.pop();
				int secondlast=stack.peek();
				int sum=last+secondlast;
				stack.push(last);
				stack.push(sum);
			}
			else
			{
				stack.push(Integer.parseInt(ops[i]));
			}
		}
		int sum=0;
		for(int p:stack)
		{
			sum=sum+p;
		}
			
		return sum;
	}
	
	
	public static void main(String[] args) 
	{
		String input[]= {"5", "-2", "4", "C", "D", "9", "+", "+"};
		//System.out.print("Input "+input);
		System.out.println("Output "+ calculateScore(input));

	}

}
