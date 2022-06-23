package io.diffblue.corebanking.compliance.rules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.diffblue.corebanking.account.Account;
import io.diffblue.corebanking.client.Client;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ComplianceRuleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Method under test: {@link ComplianceRule#addToNonCompliantAccounts(Account)}
     */
    @Test
    public void testAddToNonCompliantAccounts() {
        ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero = new ComplianceRuleBalanceAboveOrEqualToZero();
        complianceRuleBalanceAboveOrEqualToZero
                .addToNonCompliantAccounts(new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        assertEquals(1, complianceRuleBalanceAboveOrEqualToZero.getNonCompliantAccounts().size());
    }

    /**
     * Method under test: {@link ComplianceRule#addToNonCompliantAccounts(Account)}
     */
    @Test
    public void testAddToNonCompliantAccounts2() {
        ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero = new ComplianceRuleBalanceAboveOrEqualToZero();
        complianceRuleBalanceAboveOrEqualToZero
                .addToNonCompliantAccounts(new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        thrown.expect(IllegalStateException.class);
        complianceRuleBalanceAboveOrEqualToZero
                .addToNonCompliantAccounts(new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
    }

    /**
     * Method under test: {@link ComplianceRule#addToCompliantAccounts(Account)}
     */
    @Test
    public void testAddToCompliantAccounts() {
        ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero = new ComplianceRuleBalanceAboveOrEqualToZero();
        complianceRuleBalanceAboveOrEqualToZero
                .addToCompliantAccounts(new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        assertEquals(1, complianceRuleBalanceAboveOrEqualToZero.getCompliantAccounts().size());
    }

    /**
     * Method under test: {@link ComplianceRule#addToCompliantAccounts(Account)}
     */
    @Test
    public void testAddToCompliantAccounts2() {
        ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero = new ComplianceRuleBalanceAboveOrEqualToZero();
        complianceRuleBalanceAboveOrEqualToZero
                .addToCompliantAccounts(new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        thrown.expect(IllegalStateException.class);
        complianceRuleBalanceAboveOrEqualToZero
                .addToCompliantAccounts(new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
    }

    /**
     * Method under test: {@link ComplianceRule#removeFromComplianceLists(Account)}
     */
    @Test
    public void testRemoveFromComplianceLists() {
        ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero = new ComplianceRuleBalanceAboveOrEqualToZero();
        complianceRuleBalanceAboveOrEqualToZero
                .removeFromComplianceLists(new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        assertTrue(complianceRuleBalanceAboveOrEqualToZero.getCompliantAccounts().isEmpty());
        assertTrue(complianceRuleBalanceAboveOrEqualToZero.getNonCompliantAccounts().isEmpty());
    }

    /**
     * Method under test: {@link ComplianceRule#getNonCompliantAccounts()}
     */
    @Test
    public void testGetNonCompliantAccounts() {
        assertTrue((new ComplianceRuleBalanceAboveOrEqualToZero()).getNonCompliantAccounts().isEmpty());
    }

    /**
     * Method under test: {@link ComplianceRule#getCompliantAccounts()}
     */
    @Test
    public void testGetCompliantAccounts() {
        assertTrue((new ComplianceRuleBalanceAboveOrEqualToZero()).getCompliantAccounts().isEmpty());
    }

    /**
     * Method under test: {@link ComplianceRule#purgeAccounts()}
     */
    @Test
    public void testPurgeAccounts() {
        ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero = new ComplianceRuleBalanceAboveOrEqualToZero();
        complianceRuleBalanceAboveOrEqualToZero.purgeAccounts();
        assertTrue(complianceRuleBalanceAboveOrEqualToZero.getCompliantAccounts().isEmpty());
        assertTrue(complianceRuleBalanceAboveOrEqualToZero.getNonCompliantAccounts().isEmpty());
    }
}

