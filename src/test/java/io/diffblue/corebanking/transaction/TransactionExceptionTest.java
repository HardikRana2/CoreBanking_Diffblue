package io.diffblue.corebanking.transaction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TransactionExceptionTest {
    /**
     * Method under test: {@link TransactionException#TransactionException(String)}
     */
    @Test
    public void testConstructor() {
        TransactionException actualTransactionException = new TransactionException("An error occurred");
        assertNull(actualTransactionException.getCause());
        assertEquals(0, actualTransactionException.getSuppressed().length);
        assertEquals("An error occurred", actualTransactionException.getMessage());
        assertEquals("An error occurred", actualTransactionException.getLocalizedMessage());
    }
}

