import java.util.Scanner;
import java.util.Stack;

 class TransformingExpression {

	public static void main(String[]  args)
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
		String exp = scan.next();
		String ans = ANS(exp);
		System.out.println(ans);
	t--;}
	}

	private static String ANS(String exp) 
	{
		String result = new String(" ");
		Stack<Character>stack = new Stack<>();
		for(int i=0;i<exp.length();i++)
		{
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c))
				result += c;
			else if(c=='(')
				stack.push(c);
			else if (c==')')
			{
				while(!stack.isEmpty() && stack.peek()!='(')
					result += stack.pop();
				stack.pop();
			}
			else
			{
				while(!stack.isEmpty() && pre(c)<=pre(stack.peek()))
				{
					result += stack.pop();
				}
				stack.push(c);
			}
		
		}
		while(!stack.isEmpty())
			result += stack.pop();
		return result;
		
	}

	private static int pre(char c) {
		switch(c)
		{
		case '+':
			return 1;
		case '-':
			return 2;
		case '*':
			return 3;
		case '/':
			return 4;
		case '^':
			return 5;
		}
		return -1;
	}
}
