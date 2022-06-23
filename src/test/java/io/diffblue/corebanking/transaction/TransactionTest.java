package io.diffblue.corebanking.transaction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import io.diffblue.corebanking.account.Account;
import io.diffblue.corebanking.client.Client;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.Ignore;

import org.junit.Test;

public class TransactionTest {
    /**
     * Method under test: {@link Transaction#getTransactionAmount()}
     */
    @Test
    public void testGetTransactionAmount() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        assertEquals(10L, (new CashTransaction(10L, date, new Account(1234567890L, new Client("Dr Jane Doe"), 10L)))
                .getTransactionAmount());
    }

    /**
     * Method under test: {@link Transaction#getTransactionDate()}
     */
    @Test
    public void testGetTransactionDate() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        assertSame(fromResult,
                (new CashTransaction(10L, fromResult, new Account(1234567890L, new Client("Dr Jane Doe"), 10L)))
                        .getTransactionDate());
    }

    /**
     * Method under test: {@link Transaction#getTransactionState()}
     */
    @Test
    public void testGetTransactionState() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        assertEquals(Transaction.TransactionState.NOT_EXECUTED_YET,
                (new CashTransaction(10L, date, new Account(1234567890L, new Client("Dr Jane Doe"), 10L)))
                        .getTransactionState());
    }

    /**
     * Method under test: {@link Transaction#setAccountBalanceAfterTransaction(long)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSetAccountBalanceAfterTransaction() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        (new CashTransaction(10L, date, new Account(1234567890L, new Client("Dr Jane Doe"), 10L)))
                .setAccountBalanceAfterTransaction(42L);
    }

    /**
     * Method under test: {@link Transaction#setCurrentStateFailed()}
     */
    @Test
    public void testSetCurrentStateFailed() throws TransactionException {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        CashTransaction cashTransaction = new CashTransaction(10L, date,
                new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        cashTransaction.setCurrentStateFailed();
        assertEquals(Transaction.TransactionState.FAILED, cashTransaction.getTransactionState());
    }

    /**
     * Method under test: {@link Transaction#markTransactionAsExecuted()}
     */
    @Test
    public void testMarkTransactionAsExecuted() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        CashTransaction cashTransaction = new CashTransaction(10L, date,
                new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        cashTransaction.markTransactionAsExecuted();
        assertEquals(Transaction.TransactionState.EXECUTED, cashTransaction.getTransactionState());
    }

    /**
     * Method under test: {@link Transaction#toString()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testToString() {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        (new CashTransaction(10L, date, new Account(1234567890L, new Client("Dr Jane Doe"), 10L))).toString();
    }

    /**
     * Method under test: {@link Transaction#toString()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testToString2() {
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
        //   In order to prevent toString()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   toString().
        //   See https://diff.blue/R013 to resolve this issue.

        (new CashTransaction(10L, null, new Account(1234567890L, new Client("Dr Jane Doe"), 10L))).toString();
    }

    /**
     * Method under test: {@link Transaction#toString()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testToString3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.transaction.CashTransaction.getTarget(CashTransaction.java:53)
        //       at io.diffblue.corebanking.transaction.Transaction.toString(Transaction.java:116)
        //   In order to prevent toString()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   toString().
        //   See https://diff.blue/R013 to resolve this issue.

        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        (new CashTransaction(10L, Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()), null)).toString();
    }

    /**
     * Method under test: {@link Transaction#toString()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testToString4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.transaction.CashTransaction.getSource(CashTransaction.java:39)
        //       at io.diffblue.corebanking.transaction.Transaction.toString(Transaction.java:113)
        //   In order to prevent toString()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   toString().
        //   See https://diff.blue/R013 to resolve this issue.

        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        (new CashTransaction(-1L, Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()), null)).toString();
    }
}

