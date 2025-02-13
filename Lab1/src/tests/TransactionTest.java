package tests;

import model.Transaction;
import utils.TestUtils;

import java.util.Date;
import java.util.Objects;

public class TransactionTest {
    public static void main(String[] args) {
        testTransactionConstructorBySelection();
        TestTransactionConstructorByAssert();
    }

    public static void testTransactionConstructorBySelection() {
        // 1 - Setup
        String testTransactionAccount = "1";
        double testTransactionAmount = 100.42;
        Date testTransactionDate = new Date();

        // 2 - Exercise
        Transaction testTransaction = new Transaction(testTransactionAccount, testTransactionDate, testTransactionAmount);

        // 3 - Verify
        System.out.println("Starting the assertion of test method: testTransactionConstructorBySelection");

        String testCaseName = "TC1-getTransactionId";

        if (Objects.equals(testTransaction.getAccountNum(), testTransactionAccount)) {
            TestUtils.printTestPassed(testCaseName);
        } else {
            TestUtils.printTestFailed(testCaseName);
        }

        testCaseName = "TC2-getTransactionAmount";

        if (Objects.equals(testTransaction.getTransactionAmount(), testTransactionAmount)) {
            TestUtils.printTestPassed(testCaseName);
        } else {
            TestUtils.printTestFailed(testCaseName);
        }

        testCaseName = "TC3-getTransactionDate";

        if (Objects.equals(testTransaction.getTransactionDate(), testTransactionDate)) {
            TestUtils.printTestPassed(testCaseName);
        } else {
            TestUtils.printTestFailed(testCaseName);
        }

        testCaseName = "TC4-toString";

        String transactionString = testTransactionAccount + ", " + testTransactionDate + ", " + testTransactionAmount;

        if (Objects.equals(testTransaction.toString(), transactionString)) {
            TestUtils.printTestPassed(testCaseName);
        } else {
            TestUtils.printTestFailed(testCaseName);
        }
    }

    public static void TestTransactionConstructorByAssert(){
        // 1 - Setup
        String testTransactionAccount = "1";
        double testTransactionAmount = 100.42;
        Date testTransactionDate = new Date();

        // 2 - Exercise
        Transaction testTransaction = new Transaction(testTransactionAccount, testTransactionDate, testTransactionAmount);

        // 3 - Verify
        System.out.println("Starting the assertion of test method: testTransactionConstructorByAssert");

        assert Objects.equals(testTransaction.getAccountNum(), testTransactionAccount) : "TC1-getTransactionId-Failed";
        assert Objects.equals(testTransaction.getTransactionAmount(), testTransactionAmount) : "TC2-getTransactionAmount-Failed";
        assert Objects.equals(testTransaction.getTransactionDate(), testTransactionDate) : "TC3-getTransactionDate-Failed";

        String transactionString = testTransactionAccount + ", " + testTransactionDate + ", " + testTransactionAmount;

        assert Objects.equals(testTransaction.toString(), transactionString) : "TC4-toString-Failed";

        System.out.println("Finished the assertion of test method: testTransactionConstructorByAssert");
    }

}
