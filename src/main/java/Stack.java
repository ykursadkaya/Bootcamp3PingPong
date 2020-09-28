import java.util.ArrayList;
import java.util.List;

public class Stack
{

	private int limit;
	List<Integer> stackList;

	public Stack()
	{
		this.stackList = new ArrayList<>();
		this.limit = 50;
	}

	public void setLimit(int limit)
	{
		this.limit = limit;
	}

	public int count()
	{
		return stackList.size();
	}

	public boolean push(Integer item)
	{
		if((stackList.size()) == limit)
			throw new RuntimeException("Stack is full");

		return stackList.add(item);
	}

	public Integer pop()
	{
		if(stackList.isEmpty())
			throw new RuntimeException("Stack is empty");
		Integer result = stackList.get(stackList.size() - 1);
		stackList.remove(stackList.size() - 1);

		return result;

	}

	public Integer peek()
	{
		if(stackList.isEmpty())
			throw new RuntimeException("Stack is empty");

		return stackList.get(stackList.size() - 1);
	}
}
