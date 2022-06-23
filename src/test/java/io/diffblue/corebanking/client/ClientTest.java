package io.diffblue.corebanking.client;

import static org.junit.Assert.assertEquals;

import io.diffblue.corebanking.account.Account;
import io.diffblue.corebanking.account.AccountException;
import io.diffblue.corebanking.transaction.BankTransaction;
import io.diffblue.corebanking.transaction.CashTransaction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

public class ClientTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Client#Client(String)}
     *   <li>{@link Client#getClientName()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        assertEquals("Dr Jane Doe", (new Client("Dr Jane Doe")).getClientName());
    }

    /**
     * Method under test: {@link Client#addAccount(Account)}
     */
    @Test
    public void testAddAccount() {
        Client client = new Client("Dr Jane Doe");
        client.addAccount(new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        assertEquals(1, client.getAccounts().size());
    }

    /**
     * Method under test: {@link Client#toString()}
     */
    @Test
    public void testToString() {
        assertEquals("Client name: Dr Jane Doe\n", (new Client("Dr Jane Doe")).toString());
    }

    /**
     * Method under test: {@link Client#toString()}
     */
    @Test
    public void testToString2() {
        Client client = new Client("Dr Jane Doe");
        client.addAccount(new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        assertEquals("Client name: Dr Jane Doe\n"
                + "Account: | Acc #: 1234567890\t | Acc name: Current\t | Acc holder: Dr Jane Doe\t | Acc balance: 10\t | Acc"
                + " state: OPEN\t |\n" + "Account statement empty.\n", client.toString());
    }

    /**
     * Method under test: {@link Client#toString()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testToString3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.account.Account.toString(Account.java:177)
        //       at io.diffblue.corebanking.client.Client.toString(Client.java:60)
        //   In order to prevent toString()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   toString().
        //   See https://diff.blue/R013 to resolve this issue.

        Client client = new Client("Dr Jane Doe");
        client.addAccount(new Account(1234567890L, null, 10L));
        client.toString();
    }

    /**
     * Method under test: {@link Client#toString()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testToString4() throws AccountException {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        account.addTransaction(new CashTransaction(10L, date, new Account(1234567890L, new Client("Dr Jane Doe"), 10L)));

        Client client = new Client("Dr Jane Doe");
        client.addAccount(account);
        client.toString();
    }

    /**
     * Method under test: {@link Client#toString()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testToString5() throws AccountException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.util.Calendar.setTime(Calendar.java:1770)
        //       at java.text.SimpleDateFormat.format(SimpleDateFormat.java:943)
        //       at java.text.SimpleDateFormat.format(SimpleDateFormat.java:936)
        //       at java.text.DateFormat.format(DateFormat.java:345)
        //       at io.diffblue.corebanking.transaction.Transaction.toString(Transaction.java:110)
        //       at java.lang.String.valueOf(String.java:2994)
        //       at java.lang.StringBuilder.append(StringBuilder.java:137)
        //       at io.diffblue.corebanking.account.Account$AccountStatement.toString(Account.java:245)
        //       at io.diffblue.corebanking.account.Account.toString(Account.java:186)
        //       at io.diffblue.corebanking.client.Client.toString(Client.java:60)
        //   In order to prevent toString()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   toString().
        //   See https://diff.blue/R013 to resolve this issue.

        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        account.addTransaction(new CashTransaction(10L, null, new Account(1234567890L, new Client("Dr Jane Doe"), 10L)));

        Client client = new Client("Dr Jane Doe");
        client.addAccount(account);
        client.toString();
    }

    /**
     * Method under test: {@link Client#toString()}
     */
    @Test
    public void testToString6() throws AccountException {
        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        account.addTransaction(null);

        Client client = new Client("Dr Jane Doe");
        client.addAccount(account);
        assertEquals("Client name: Dr Jane Doe\n"
                + "Account: | Acc #: 1234567890\t | Acc name: Current\t | Acc holder: Dr Jane Doe\t | Acc balance: 10\t | Acc"
                + " state: OPEN\t |\n" + "null\n" + "\n", client.toString());
    }

    /**
     * Method under test: {@link Client#toString()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testToString7() throws AccountException {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        Account sourceAcc = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);

        account.addTransaction(
                new BankTransaction(10L, date, sourceAcc, new Account(1234567890L, new Client("Dr Jane Doe"), 10L)));

        Client client = new Client("Dr Jane Doe");
        client.addAccount(account);
        client.toString();
    }
}

