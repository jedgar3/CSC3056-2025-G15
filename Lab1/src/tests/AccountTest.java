package tests;

import model.Account;
import utils.TestUtils;

import java.util.Date;

public class AccountTest {
    public static void main(String[] args) {
        testAccountConstructorBySelection();
        testAccountConstructorByAssertion();
    }

    public static void testAccountConstructorBySelection() {
        // 1 - Setup
        String testAccountNumber = "12345678";
        String testUsernameOfAccountHolder = "mike";
        String testAccountType = "savings";
        Date testAccountOpeningDate = new Date();

        // 2 - Exercise
        Account testAccount = new Account(testAccountNumber, testUsernameOfAccountHolder, testAccountType, testAccountOpeningDate);

        // 3 - Verify
        System.out.println("Starting the assertion of test method: testAccountConstructorBySelection");

        String testCaseName = "TC1-getAccountNumber";

        if (testAccount.getAccount_number().equals(testAccountNumber)) {
            TestUtils.printTestPassed(testCaseName);
        } else {
            TestUtils.printTestFailed(testCaseName);
        }

        testCaseName = "TC2-getUsernameOfAccountHolder";

        if (testAccount.getUsername_of_account_holder().equals(testUsernameOfAccountHolder)) {
            TestUtils.printTestPassed(testCaseName);
        } else {
            TestUtils.printTestFailed(testCaseName);
        }

        testCaseName = "TC3-getAccountType";

        if (testAccount.getAccount_type().equals(testAccountType)) {
            TestUtils.printTestPassed(testCaseName);
        } else {
            TestUtils.printTestFailed(testCaseName);
        }

        testCaseName = "TC4-getAccountOpeningDate";

        if (testAccount.getAccount_opening_date().equals(testAccountOpeningDate)) {
            TestUtils.printTestPassed(testCaseName);
        } else {
            TestUtils.printTestFailed(testCaseName);
        }
    }

    private static void testAccountConstructorByAssertion() {
        // 1 - Setup
        String testAccountNumber = "12345678";
        String testUsernameOfAccountHolder = "mike";
        String testAccountType = "savings";
        Date testAccountOpeningDate = new Date();

        // 2 - Exercise
        Account testAccount = new Account(testAccountNumber, testUsernameOfAccountHolder, testAccountType, testAccountOpeningDate);

        // 3 - Verify
        System.out.println("Starting the assertion of test method: testAccountConstructorByAssertion");

        assert testAccount.getAccount_number().equals(testAccountNumber) : "TC1-getAccountNumber-Failed";
        assert testAccount.getUsername_of_account_holder().equals(testUsernameOfAccountHolder) : "TC2-getUsernameOfAccountHolder-Failed";
        assert testAccount.getAccount_type().equals(testAccountType) : "TC3-getAccountType-Failed";
        assert testAccount.getAccount_opening_date().equals(testAccountOpeningDate) : "TC4-getAccountOpeningDate-Failed";
    }
}
