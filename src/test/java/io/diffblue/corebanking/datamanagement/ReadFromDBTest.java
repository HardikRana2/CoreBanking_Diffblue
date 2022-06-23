package io.diffblue.corebanking.datamanagement;

import static org.junit.Assert.assertEquals;

import io.diffblue.corebanking.CoreBanking;
import io.diffblue.corebanking.client.Client;
import io.diffblue.corebanking.transaction.TransactionException;

import java.util.List;

import org.junit.Ignore;

import org.junit.Test;

public class ReadFromDBTest {
    /**
     * Method under test: {@link ReadFromDB#readFromDB()}
     */
    @Test
    public void testReadFromDB() throws TransactionException {
        CoreBanking actualReadFromDBResult = ReadFromDB.readFromDB();
        assertEquals(6, actualReadFromDBResult.getAccounts().size());
        List<Client> clients = actualReadFromDBResult.getClients();
        assertEquals(3, clients.size());
        Client getResult = clients.get(2);
        assertEquals("Emily Simmons", getResult.getClientName());
        Client getResult1 = clients.get(1);
        assertEquals("Jane Robbins", getResult1.getClientName());
        assertEquals(2, getResult1.getAccounts().size());
        assertEquals(1, getResult.getAccounts().size());
        Client getResult2 = clients.get(0);
        assertEquals(3, getResult2.getAccounts().size());
        assertEquals("John Field", getResult2.getClientName());
    }

    /**
     * Method under test: {@link ReadFromDB#readFromDB(CoreBanking)}
     */
    @Test
    public void testReadFromDB2() throws TransactionException {
        CoreBanking readFromDBResult = ReadFromDB.readFromDB();
        ReadFromDB.readFromDB(readFromDBResult);
        assertEquals(6, readFromDBResult.getAccounts().size());
        List<Client> clients = readFromDBResult.getClients();
        assertEquals(3, clients.size());
        Client getResult = clients.get(2);
        assertEquals("Emily Simmons", getResult.getClientName());
        Client getResult1 = clients.get(1);
        assertEquals("Jane Robbins", getResult1.getClientName());
        assertEquals(2, getResult1.getAccounts().size());
        assertEquals(1, getResult.getAccounts().size());
        Client getResult2 = clients.get(0);
        assertEquals(3, getResult2.getAccounts().size());
        assertEquals("John Field", getResult2.getClientName());
    }

    /**
     * Method under test: {@link ReadFromDB#readFromDB(CoreBanking)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testReadFromDB3() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.datamanagement.ReadFromDB.readFromDB(ReadFromDB.java:19)
        //   In order to prevent readFromDB(CoreBanking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   readFromDB(CoreBanking).
        //   See https://diff.blue/R013 to resolve this issue.

        ReadFromDB.readFromDB(null);
    }
}

