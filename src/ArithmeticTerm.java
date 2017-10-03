import java.util.Stack;
import java.util.StringTokenizer;

/**
 * AD-Lab01-2
 * Created by IF on 03.10.17.
 */
public class ArithmeticTerm {
    private String expression;

    /**
     * Constructor method
     * @param input String to be stored in expression field
     */
    public ArithmeticTerm(String input) {
        expression = input;
    }

    /**
     * Getter method for the expression field
     * @return String stored as expression field
     */
    public String toString() {
        return expression;
    }

    /**
     * Method to reverse the order of tokens in the expression field
     */
    public void reverse() {
        Stack<String> stringStack = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(expression);
        StringBuilder stringBuilder = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            stringStack.push(tokenizer.nextToken());
        }

        while (!(stringStack.empty())) {
            stringBuilder.append(stringStack.pop());
            if (!(stringStack.empty())) {
                stringBuilder.append(" ");
            }
        }

    }
}
