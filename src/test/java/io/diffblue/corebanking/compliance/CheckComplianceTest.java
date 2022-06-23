package io.diffblue.corebanking.compliance;

import io.diffblue.corebanking.account.Account;
import io.diffblue.corebanking.client.Client;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class CheckComplianceTest {
    /**
     * Method under test: {@link CheckCompliance#checkAccountCompliance(List)}
     */
    @Test
    public void testCheckAccountCompliance() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by checkAccountCompliance(List)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        CheckCompliance.checkAccountCompliance(new ArrayList<>());
    }

    /**
     * Method under test: {@link CheckCompliance#checkAccountCompliance(List)}
     */
    @Test
    public void testCheckAccountCompliance2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by checkAccountCompliance(List)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ArrayList<Account> accountList = new ArrayList<>();
        accountList.add(new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        CheckCompliance.checkAccountCompliance(accountList);
    }

    /**
     * Method under test: {@link CheckCompliance#checkAccountCompliance(List)}
     */
    @Test
    public void testCheckAccountCompliance3() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by checkAccountCompliance(List)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ArrayList<Account> accountList = new ArrayList<>();
        accountList.add(new Account(1234567890L, new Client("Dr Jane Doe"), -1L));
        CheckCompliance.checkAccountCompliance(accountList);
    }

    /**
     * Method under test: {@link CheckCompliance#checkAccountCompliance(List)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCheckAccountCompliance4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.compliance.rules.ComplianceRuleBalanceAboveOrEqualToZero.validateAccountCompliance(ComplianceRuleBalanceAboveOrEqualToZero.java:18)
        //       at io.diffblue.corebanking.compliance.CheckCompliance.checkAccountCompliance(CheckCompliance.java:31)
        //   In order to prevent checkAccountCompliance(List)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   checkAccountCompliance(List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<Account> accountList = new ArrayList<>();
        accountList.add(null);
        CheckCompliance.checkAccountCompliance(accountList);
    }

    /**
     * Method under test: {@link CheckCompliance#viewComplianceCheckResults()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testViewComplianceCheckResults() {
        // TODO: Complete this test.
        //   Reason: T005 Trivial constructor.
        //   See https://diff.blue/T005

        // Arrange and Act
        // TODO: Populate arranged inputs
        CheckCompliance.viewComplianceCheckResults();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link CheckCompliance#purgeComplianceResults()}
     */
    @Test
    public void testPurgeComplianceResults() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        CheckCompliance.purgeComplianceResults();
    }
}

