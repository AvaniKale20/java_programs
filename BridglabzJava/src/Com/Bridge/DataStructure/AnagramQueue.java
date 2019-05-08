package Com.Bridge.DataStructure;

public class AnagramQueue {
	public static void main(String[]args)
	{
		Queue<Integer> queue=new Queue<Integer>();
		int res[]=Utility.primeAnagram(1000);
		for(int i=0;i<res.length-1;i++)
		{
			queue.enque(res[i]);
		}
		queue.display();
	}

}

