package tests;

import model.User;
import utils.TestUtils;

import java.util.Objects;

public class UserTest {
    public static void main(String[] args) {
        testUserConstructor();
    }

    public static void testUserConstructor() {
        // 1 - Setup
        String testUsername = "mike";
        String testPassword = "my_passwd";
        String testFirstName = "Mike";
        String testLastName = "Smith";
        String testMobilePhone = "07771234567";

        // 2 - Exercise
        User testUser = new User(testUsername, testPassword, testFirstName, testLastName, testMobilePhone);

        // 3 - Verify
        System.out.println("Starting the assertion of test method: testUserConstructor");

        if(Objects.equals(testUser.getUsername(), testUsername)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getUsername-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getUsername-Failed" + TestUtils.TEXT_COLOR_RESET);
        }

        if(Objects.equals(testUser.getPassword(), testPassword)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getPassword-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC2-getPassword-Failed" + TestUtils.TEXT_COLOR_RESET);
        }

        if(Objects.equals(testUser.getFirst_name(), testFirstName)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC3-getFirst_name-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC3-getFirst_name-Failed" + TestUtils.TEXT_COLOR_RESET);
        }

        if(Objects.equals(testUser.getLast_name(), testLastName)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC4-getLast_name-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC4-getLast_name-Failed" + TestUtils.TEXT_COLOR_RESET);
        }

        if(Objects.equals(testUser.getMobile_phone(), testMobilePhone)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC5-getMobile_phone-Passed" + TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC5-getMobile_phone-Failed" + TestUtils.TEXT_COLOR_RESET);
        }
    }
}
