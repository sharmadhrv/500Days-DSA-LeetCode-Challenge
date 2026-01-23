package Stack.asteroidcollison735;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollison {

    public static void main(String[] args) {

        int[]  arr = {-2,-2,1,-2};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    public static int[]  asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        boolean destroyed = false;
        for(int i = 0;i<asteroids.length;i++)
        {
           while(!stack.isEmpty() && stack.peek()>0 && asteroids[i] <0 )
           {
               if(-asteroids[i]>stack.peek() )
               {
                   stack.pop();
                   continue;
               }

               if(-asteroids[i] == stack.peek()) {
                   stack.pop();
               }
                   destroyed = true;
               break;
           }
           if(!destroyed)
               stack.push(asteroids[i]);
        }
        int[] ans = new int[stack.size()];
        for(int i = stack.size()-1;i>=0;i--)
        {
            ans[i] = stack.pop();
        }
        return ans;
    }

    public static int[] asteroidCollison2(int[] asteroids)
    {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (asteroid >= 0)
                stack.push(asteroid);
            else {
                if (!stack.isEmpty() && stack.peek() > 0) {
                    while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid))
                        stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroid))
                    stack.pop();

                else if (stack.isEmpty() || stack.peek() < 0)
                    stack.push(asteroid);
            }
        }
        int[] ans = new int[stack.size()];
        for(int i = stack.size()-1;i>=0;i--)
        {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
