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

public class CashTransactionTest {
    /**
     * Method under test: {@link CashTransaction#CashTransaction(long, Date, Account)}
     */
    @Test
    public void testConstructor() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        CashTransaction actualCashTransaction = new CashTransaction(10L, fromResult,
                new Account(1234567890L, new Client("Dr Jane Doe"), 10L));

        assertEquals("CASH", actualCashTransaction.getSource());
        assertEquals(Transaction.TransactionState.NOT_EXECUTED_YET, actualCashTransaction.getTransactionState());
        assertSame(fromResult, actualCashTransaction.getTransactionDate());
        assertEquals(10L, actualCashTransaction.getTransactionAmount());
        assertEquals("1234567890", actualCashTransaction.getTarget());
    }

    /**
     * Method under test: {@link CashTransaction#CashTransaction(long, Date, Account)}
     */
    @Test
    public void testConstructor2() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        CashTransaction actualCashTransaction = new CashTransaction(-1L, fromResult,
                new Account(1234567890L, new Client("Dr Jane Doe"), 10L));

        assertEquals("1234567890", actualCashTransaction.getSource());
        assertEquals(Transaction.TransactionState.NOT_EXECUTED_YET, actualCashTransaction.getTransactionState());
        assertSame(fromResult, actualCashTransaction.getTransactionDate());
        assertEquals(-1L, actualCashTransaction.getTransactionAmount());
        assertEquals("CASH", actualCashTransaction.getTarget());
    }

    /**
     * Method under test: {@link CashTransaction#getSource()}
     */
    @Test
    public void testGetSource() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        assertEquals("CASH",
                (new CashTransaction(10L, date, new Account(1234567890L, new Client("Dr Jane Doe"), 10L))).getSource());
    }

    /**
     * Method under test: {@link CashTransaction#getSource()}
     */
    @Test
    public void testGetSource2() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        assertEquals("1234567890",
                (new CashTransaction(-1L, date, new Account(1234567890L, new Client("Dr Jane Doe"), 10L))).getSource());
    }

    /**
     * Method under test: {@link CashTransaction#getSource()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetSource3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.transaction.CashTransaction.getSource(CashTransaction.java:39)
        //   In order to prevent getSource()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getSource().
        //   See https://diff.blue/R013 to resolve this issue.

        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        (new CashTransaction(-1L, Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()), null)).getSource();
    }

    /**
     * Method under test: {@link CashTransaction#getTarget()}
     */
    @Test
    public void testGetTarget() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        assertEquals("1234567890",
                (new CashTransaction(10L, date, new Account(1234567890L, new Client("Dr Jane Doe"), 10L))).getTarget());
    }

    /**
     * Method under test: {@link CashTransaction#getTarget()}
     */
    @Test
    public void testGetTarget2() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        assertEquals("CASH",
                (new CashTransaction(-1L, date, new Account(1234567890L, new Client("Dr Jane Doe"), 10L))).getTarget());
    }

    /**
     * Method under test: {@link CashTransaction#getTarget()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetTarget3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.transaction.CashTransaction.getTarget(CashTransaction.java:53)
        //   In order to prevent getTarget()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getTarget().
        //   See https://diff.blue/R013 to resolve this issue.

        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        (new CashTransaction(10L, Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()), null)).getTarget();
    }

    /**
     * Method under test: {@link CashTransaction#executeTransaction()}
     */
    @Test
    public void testExecuteTransaction() throws TransactionException {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        CashTransaction cashTransaction = new CashTransaction(10L, date,
                new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        cashTransaction.executeTransaction();
        assertEquals(Transaction.TransactionState.EXECUTED, cashTransaction.getTransactionState());
    }

    /**
     * Method under test: {@link CashTransaction#executeTransaction()}
     */
    @Test
    public void testExecuteTransaction2() throws TransactionException {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        CashTransaction cashTransaction = new CashTransaction(-1L, date,
                new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        cashTransaction.executeTransaction();
        assertEquals(Transaction.TransactionState.EXECUTED, cashTransaction.getTransactionState());
    }

    /**
     * Method under test: {@link CashTransaction#executeTransaction()}
     */
    @Test
    public void testExecuteTransaction3() throws TransactionException {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date date = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        CashTransaction cashTransaction = new CashTransaction(Long.MIN_VALUE, date,
                new Account(1234567890L, new Client("Dr Jane Doe"), 10L));
        cashTransaction.executeTransaction();
        assertEquals(Transaction.TransactionState.FAILED, cashTransaction.getTransactionState());
    }

    /**
     * Method under test: {@link CashTransaction#executeTransaction()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testExecuteTransaction4() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.transaction.CashTransaction.executeTransaction(CashTransaction.java:64)
        //   In order to prevent executeTransaction()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   executeTransaction().
        //   See https://diff.blue/R013 to resolve this issue.

        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        (new CashTransaction(10L, Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()), null))
                .executeTransaction();
    }
}

