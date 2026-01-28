package Stack.onlinestockspan901;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class StockSpanner {

    private Stack<int[]> stack ;
    int index;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {

        index = 1;
        while(!stack.isEmpty() && stack.peek()[0]<=price)
            index += stack.pop()[1];
        stack.push(new int[]{price,index});

        return index;
    }

}
