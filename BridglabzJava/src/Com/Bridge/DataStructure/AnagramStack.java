package Com.Bridge.DataStructure;

public class AnagramStack {
	public static void main(String[]args)
	{
		Stack<Integer> stack=new Stack<Integer>();
		int res[]=Utility.primeAnagram(1000);
		for(int i=0;i<res.length-1;i++)
		{
			stack.push(res[i]);
		}
		stack.display();
	}

}
