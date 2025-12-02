package Stack.gameof2stacks;

import java.util.List;
import java.util.Stack;

public class TwoStacksGame {

    private  List<Integer> a  ;
    private List<Integer> b;

    TwoStacksGame(){
        a = new Stack<>();
        b = new Stack<>();
    }
    public  int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int selection = 0;
        int sum = 0;
        int element1 = 0, element2 = 0;
        do {
            int complement = maxSum - sum;
            if (!a.isEmpty() && a.getFirst() < complement) {
                element1 = a.getFirst();
            }
            if (!b.isEmpty() && b.getFirst() < complement) {
                element2 = b.getFirst();
            }

            int selectedElement = Math.min(element1, element2);
            sum += selectedElement;
            selection++;
            if(selectedElement == element1)
                a.removeFirst();
            else b.removeFirst();

        } while (sum < maxSum);
        return selection;
    }
}
