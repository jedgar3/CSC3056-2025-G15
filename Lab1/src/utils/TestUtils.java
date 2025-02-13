package utils;

public class TestUtils {
	
	public static final String TEXT_COLOR_GREEN = "\u001B[32m"; // from https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    public static final String TEXT_COLOR_RED = "\u001B[31m"; 
    public static final String TEXT_COLOR_RESET = "\u001B[0m"; 


    public static void printTestPassed (String testCase) {
        System.out.println(TEXT_COLOR_GREEN + "PASSED--" + testCase + TEXT_COLOR_RESET);
    }

    public static void printTestFailed (String testCase) {
        System.out.println(TEXT_COLOR_RED + "FAILED--" + testCase + TEXT_COLOR_RESET);
    }
}
