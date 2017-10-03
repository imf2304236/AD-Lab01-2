public class Main {

    public static void main(String[] args) {
	    ArithmeticTerm term = new ArithmeticTerm("( ( 4.3 * 1e-1 ) - .4 )");
	    String postfix = term.convert();
    }
}
