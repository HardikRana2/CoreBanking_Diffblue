package io.diffblue.corebanking.account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import io.diffblue.corebanking.client.Client;
import io.diffblue.corebanking.transaction.CashTransaction;
import io.diffblue.corebanking.transaction.Transaction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;

import org.junit.Rule;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AccountTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Method under test: {@link Account.AccountStatement#getTransactions()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAccountStatementGetTransactions() {
        // TODO: Complete this test.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of Account.AccountStatement.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Account.AccountStatement accountStatement = null;

        // Act
        List<Transaction> actualTransactions = accountStatement.getTransactions();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Account#Account(long, Client, long)}
     *   <li>{@link Account#toString()}
     *   <li>{@link Account#getAccountName()}
     *   <li>{@link Account#getAccountNumber()}
     *   <li>{@link Account#getAccountState()}
     *   <li>{@link Account#getClient()}
     *   <li>{@link Account#getCurrentBalance()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        Client client = new Client("Dr Jane Doe");
        Account actualAccount = new Account(1234567890L, client, 10L);
        String actualToStringResult = actualAccount.toString();
        assertEquals("Current", actualAccount.getAccountName());
        assertEquals(1234567890L, actualAccount.getAccountNumber());
        assertEquals(Account.AccountState.OPEN, actualAccount.getAccountState());
        assertSame(client, actualAccount.getClient());
        assertEquals(10L, actualAccount.getCurrentBalance());
        assertEquals(
                "Account: | Acc #: 1234567890\t | Acc name: Current\t | Acc holder: Dr Jane Doe\t | Acc balance: 10\t | Acc"
                        + " state: OPEN\t |\n" + "Account statement empty.",
                actualToStringResult);
    }

    /**
     * Method under test: {@link Account#Account(long, Client, long)}
     */
    @Test
    public void testConstructor2() {
        Client client = new Client("Dr Jane Doe");
        Account actualAccount = new Account(1234567890L, client, 10L);

        assertEquals("Current", actualAccount.getAccountName());
        assertEquals(10L, actualAccount.getCurrentBalance());
        assertSame(client, actualAccount.getClient());
        assertEquals(1234567890L, actualAccount.getAccountNumber());
        assertEquals(Account.AccountState.OPEN, actualAccount.getAccountState());
        assertTrue(actualAccount.getAccountStatement().getTransactions().isEmpty());
    }

    /**
     * Method under test: {@link Account#addToBalance(long)}
     */
    @Test
    public void testAddToBalance() throws AccountException {
        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        account.addToBalance(10L);
        assertEquals(20L, account.getCurrentBalance());
    }

    /**
     * Method under test: {@link Account#takeFromBalance(long)}
     */
    @Test
    public void testTakeFromBalance() throws AccountException {
        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        account.takeFromBalance(10L);
        assertEquals(0L, account.getCurrentBalance());
    }

    /**
     * Method under test: {@link Account#takeFromBalance(long)}
     */
    @Test
    public void testTakeFromBalance2() throws AccountException {
        thrown.expect(AccountException.class);
        (new Account(1234567890L, new Client("Dr Jane Doe"), Long.MAX_VALUE)).takeFromBalance(10L);
    }

    /**
     * Method under test: {@link Account#setAccountName(String)}
     */
    @Test
    public void testSetAccountName() throws AccountException {
        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        account.setAccountName("Dr Jane Doe");
        assertEquals("Dr Jane Doe", account.getAccountName());
    }

    /**
     * Method under test: {@link Account#closeAccount()}
     */
    @Test
    public void testCloseAccount() throws AccountException {
        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        account.closeAccount();
        assertEquals(Account.AccountState.CLOSED, account.getAccountState());
    }

    /**
     * Method under test: {@link Account#addTransaction(Transaction)}
     */
    @Test
    public void testAddTransaction() throws AccountException {
        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        account.addTransaction(new CashTransaction(10L, date, new Account(1234567890L, new Client("Dr Jane Doe"), 10L)));
        assertEquals(1, account.getAccountStatement().getTransactions().size());
    }

    /**
     * Method under test: {@link Account.AccountStatement#toString()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAccountStatementToString() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //   In order to prevent toString()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   toString().
        //   See https://diff.blue/R013 to resolve this issue.

        Account.AccountStatement accountStatement = null;
        accountStatement.toString();
    }

    /**
     * Method under test: {@link Account#equals(Object)}
     */
    @Test
    public void testEquals() {
        assertNotEquals(new Account(1234567890L, new Client("Dr Jane Doe"), 10L), null);
        assertNotEquals(new Account(1234567890L, new Client("Dr Jane Doe"), 10L), "Different type to Account");
    }

    /**
     * Method under test: {@link Account#equals(Object)}
     */
    @Test
    public void testEquals2() {
        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        assertEquals(account, account);
        int expectedHashCodeResult = account.hashCode();
        assertEquals(expectedHashCodeResult, account.hashCode());
    }

    /**
     * Method under test: {@link Account#equals(Object)}
     */
    @Test
    public void testEquals3() {
        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        Account account1 = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);

        assertEquals(account, account1);
        int notExpectedHashCodeResult = account.hashCode();
        assertNotEquals(notExpectedHashCodeResult, account1.hashCode());
    }

    /**
     * Method under test: {@link Account#equals(Object)}
     */
    @Test
    public void testEquals4() {
        Account account = new Account(3L, new Client("Dr Jane Doe"), 10L);
        assertNotEquals(account, new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
    }
}

