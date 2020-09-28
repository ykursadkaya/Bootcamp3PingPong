import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class StackTests
{
	private Stack sut;

	@BeforeEach
	public void setup()
	{
		sut = new Stack();
	}

	@Test
	public void count_WhenStackIsEmpty_ShouldReturnZero()
	{
		//Arrange
//		Stack sut = new Stack();

		//Act
		int count = sut.count();

		//Assert
		assertThat(count).isEqualTo(0);
	}

	@Test
	public void count_WhenStackIsNotEmpty_ShouldReturnStackSize()
	{
		//Arrange
//		Stack sut = new Stack();
		sut.push(5);

		//Act
		int count = sut.count();

		//Assert
		assertThat(count).isEqualTo(1);
	}

	@Test
	public void push_WhenStackIsEmpty_ShouldPushItem()
	{
		//Arrange
//		Stack sut = new Stack();
		Integer item = 5;
		//Act
		boolean isPushed = sut.push(item);

		//Assert
		assertThat(isPushed).isTrue();
	}

	@Test
	public void push_WhenStackIsFull_ShouldThrowRuntimeException()
	{
		//Arrange
//		Stack sut = new Stack();
		sut.setLimit(0);
		Integer item = 5;
		//Act
		Throwable throwable = catchThrowable(() -> sut.push(item));

		//Assert
		assertThat(throwable).isInstanceOf(RuntimeException.class).hasMessage("Stack is full");
	}

	@Test
	public void pop_WhenStackIsEmpty_ShouldThrowRuntimeException()
	{
		//Arrange
//		Stack sut = new Stack();
		//Act
		Throwable throwable = catchThrowable(() -> sut.pop());

		//Assert
		assertThat(throwable).isInstanceOf(RuntimeException.class).hasMessage("Stack is empty");
	}

	@Test
	public void pop_WhenStackIsNotEmpty_ShouldReturnLastItem()
	{
		//Arrange
//		Stack sut = new Stack();
		Integer item = 5;
		sut.push(item);

		//Act
		Integer poppedItem = sut.pop();

		//Assert
		assertThat(item).isEqualTo(poppedItem);
	}

	@Test
	public void peek_WhenStackIsEmpty_ShouldThrowRuntimeException()
	{
		//Arrange
//		Stack sut = new Stack();

		//Act
		Throwable throwable = catchThrowable(() -> sut.peek());

		//Assert
		assertThat(throwable).isInstanceOf(RuntimeException.class).hasMessage("Stack is empty");
	}
	@Test
	public void peek_WhenStackIsNotEmpty_ShouldReturnLastItem()
	{
		//Arrange
//		Stack sut = new Stack();
		Integer item = 5;
        sut.push(item);
		//Act
		Integer peek = sut.peek();

		//Assert
		assertThat(item).isEqualTo(peek);
	}
}
