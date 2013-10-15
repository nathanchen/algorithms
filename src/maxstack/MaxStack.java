package maxstack;

import java.util.Stack;

/**
 * User: Nathanchen Date: 15/10/13 Time: 2:19 PM
 *
 * Description: 具有栈的功能，并且提供O(1)的时间复杂度来获取最大值max
 */
public class MaxStack
{
    private Stack<Integer> stack;
    private Stack<Integer> assist;

    public MaxStack()
    {
        stack = new Stack<Integer>();
        assist = new Stack<Integer>();
        assist.push(Integer.MIN_VALUE);
    }

    public int peek()
    {
        return stack.peek();
    }

    public int max()
    {
        return stack.peek();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public void push(int i)
    {
        stack.push(i);
        if (i > max())
            assist.push(i);
    }

    public int pop() throws Exception
    {
        if (isEmpty())
            throw new Exception("empty stack");

        int result = stack.pop();
        if (result == assist.peek())
            assist.pop();
        return result;
    }
}
