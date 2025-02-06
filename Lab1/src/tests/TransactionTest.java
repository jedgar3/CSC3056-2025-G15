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
    }

    public static void TestTransactionConstructorByAssert(){
        // 1 - Setup
        String testTransactionAccount = "1";
        double testTransactionAmount = 100.42;
        Date testTransactionDate = new Date();

        // 2 - Exercise
        Transaction testTransaction = new Transaction(testTransactionAccount, testTransactionDate, testTransactionAmount);

        // 3 - Verify
        System.out.println("Starting the assertion of test method: testTransactionConstructorBySelection");

        assert Objects.equals(testTransaction.getAccountNum(), testTransactionAccount) : "Test failed";
        assert Objects.equals(testTransaction.getTransactionAmount(), testTransactionAmount) : "Test failed";
        assert Objects.equals(testTransaction.getTransactionDate(), testTransactionDate) : "Test failed";
    }

}
