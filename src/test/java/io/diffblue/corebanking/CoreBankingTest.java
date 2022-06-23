package io.diffblue.corebanking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import io.diffblue.corebanking.account.Account;
import io.diffblue.corebanking.client.Client;
import io.diffblue.corebanking.datamanagement.ReadFromDB;
import io.diffblue.corebanking.transaction.TransactionException;
import org.junit.Ignore;
import org.junit.Test;

public class CoreBankingTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link CoreBanking}
     *   <li>{@link CoreBanking#getAccounts()}
     *   <li>{@link CoreBanking#getClients()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        CoreBanking actualCoreBanking = new CoreBanking();
        assertTrue(actualCoreBanking.getAccounts().isEmpty());
        assertTrue(actualCoreBanking.getClients().isEmpty());
    }

    /**
     * Method under test: {@link CoreBanking#purgeCoreBanking()}
     */
    @Test
    public void testPurgeCoreBanking() throws TransactionException {
        CoreBanking readFromDBResult = ReadFromDB.readFromDB();
        readFromDBResult.purgeCoreBanking();
        assertTrue(readFromDBResult.getAccounts().isEmpty());
        assertTrue(readFromDBResult.getClients().isEmpty());
    }

    /**
     * Method under test: {@link CoreBanking#openNewAccount(Client, long)}
     */
    @Test
    public void testOpenNewAccount() throws TransactionException {
        CoreBanking readFromDBResult = ReadFromDB.readFromDB();
        Client client = new Client("Dr Jane Doe");
        Account actualOpenNewAccountResult = readFromDBResult.openNewAccount(client, 10L);
        assertEquals("Current", actualOpenNewAccountResult.getAccountName());
        assertEquals(10L, actualOpenNewAccountResult.getCurrentBalance());
        Client client1 = actualOpenNewAccountResult.getClient();
        assertSame(client, client1);
        assertEquals(Account.AccountState.OPEN, actualOpenNewAccountResult.getAccountState());
        assertEquals(1, client1.getAccounts().size());
        assertTrue(actualOpenNewAccountResult.getAccountStatement().getTransactions().isEmpty());
        assertEquals(7, readFromDBResult.getAccounts().size());
    }

    /**
     * Method under test: {@link CoreBanking#openNewAccount(Client, long)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testOpenNewAccount2() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.CoreBanking.openNewAccount(CoreBanking.java:60)
        //   In order to prevent openNewAccount(Client, long)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   openNewAccount(Client, long).
        //   See https://diff.blue/R013 to resolve this issue.

        ReadFromDB.readFromDB().openNewAccount(null, 10L);
    }

    /**
     * Method under test: {@link CoreBanking#registerNewClient(Client)}
     */
    @Test
    public void testRegisterNewClient() throws TransactionException {
        CoreBanking readFromDBResult = ReadFromDB.readFromDB();
        Client client = new Client("Dr Jane Doe");
        assertSame(client, readFromDBResult.registerNewClient(client));
        assertEquals(4, readFromDBResult.getClients().size());
    }

    /**
     * Method under test: {@link CoreBanking#toString()}
     */
    @Test
    public void testToString() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by toString()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ReadFromDB.readFromDB().toString();
    }
}

