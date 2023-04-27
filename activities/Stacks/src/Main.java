public class Main {
    public static void main(String[] args) {
        BalancedBrackets balancedBrackets = new BalancedBrackets();

        String[] examples = {
                "{[()]}",
                "{}([)]",
                "[{[({())]{}{()}]",
                "[{[(())]{}{()}}]"
        };

        for (String example: examples) {
            System.out.printf("\"%s\" is balanced: %s\n", example, balancedBrackets.checkString(example));
        }
    }
}
