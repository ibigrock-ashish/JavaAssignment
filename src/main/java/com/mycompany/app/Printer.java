package assignment;

public class Printer {

	public <T> void printArray(T[] o) {
		for(T e:o)
		{
			System.out.println(e);
		}
	}

	public static void main(String args[])
	{
		Printer p=new Printer();
		Integer[] i= {1,2,6,4,5};
		String[] s= {"a","b","c","d","e"};
		
		p.printArray(i);
		p.printArray(s);
	}
}
