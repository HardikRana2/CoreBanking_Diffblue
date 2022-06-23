package io.diffblue.corebanking.compliance.rules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.diffblue.corebanking.account.Account;
import io.diffblue.corebanking.client.Client;
import org.junit.Ignore;
import org.junit.Test;

public class ComplianceRuleBalanceAboveOrEqualToZeroTest {
    /**
     * Method under test: {@link ComplianceRuleBalanceAboveOrEqualToZero#validateAccountCompliance(Account)}
     */
    @Test
    public void testValidateAccountCompliance() {
        ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero = new ComplianceRuleBalanceAboveOrEqualToZero();
        complianceRuleBalanceAboveOrEqualToZero
                .validateAccountCompliance(new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        assertEquals(1, complianceRuleBalanceAboveOrEqualToZero.getCompliantAccounts().size());
        assertTrue(complianceRuleBalanceAboveOrEqualToZero.getNonCompliantAccounts().isEmpty());
    }

    /**
     * Method under test: {@link ComplianceRuleBalanceAboveOrEqualToZero#validateAccountCompliance(Account)}
     */
    @Test
    public void testValidateAccountCompliance2() {
        ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero = new ComplianceRuleBalanceAboveOrEqualToZero();
        complianceRuleBalanceAboveOrEqualToZero
                .validateAccountCompliance(new Account(1234567890L, new Client("Dr Jane Doe"), -1L));
        assertTrue(complianceRuleBalanceAboveOrEqualToZero.getCompliantAccounts().isEmpty());
        assertEquals(1, complianceRuleBalanceAboveOrEqualToZero.getNonCompliantAccounts().size());
    }

    /**
     * Method under test: {@link ComplianceRuleBalanceAboveOrEqualToZero#validateAccountCompliance(Account)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testValidateAccountCompliance3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.compliance.rules.ComplianceRuleBalanceAboveOrEqualToZero.validateAccountCompliance(ComplianceRuleBalanceAboveOrEqualToZero.java:18)
        //   In order to prevent validateAccountCompliance(Account)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   validateAccountCompliance(Account).
        //   See https://diff.blue/R013 to resolve this issue.

        (new ComplianceRuleBalanceAboveOrEqualToZero()).validateAccountCompliance(null);
    }
}

