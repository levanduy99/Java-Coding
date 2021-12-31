import java.util.Stack;

public class AsteroidCollision {
    
    static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (stack.empty() || asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (true) {
                    int peek = stack.peek();
                    if (peek < 0) {
                        stack.push(asteroid);
                        break;
                    } else if (peek == - asteroid) {
                        stack.pop();
                    } else if (peek > - asteroid) {
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroid);
                            break;
                        }
                    }
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        for (int i : asteroidCollision(asteroids)) {
            System.out.print(i + " ");
        }
    }
}
