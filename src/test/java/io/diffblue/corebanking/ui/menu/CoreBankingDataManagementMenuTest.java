package io.diffblue.corebanking.ui.menu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import io.diffblue.corebanking.CoreBanking;
import io.diffblue.corebanking.client.Client;
import io.diffblue.corebanking.datamanagement.ReadFromDB;
import io.diffblue.corebanking.transaction.TransactionException;

import java.util.List;

import org.junit.Ignore;

import org.junit.Test;

public class CoreBankingDataManagementMenuTest {
    /**
     * Method under test: {@link CoreBankingDataManagementMenu#CoreBankingDataManagementMenu(CoreBanking)}
     */
    @Test
    public void testConstructor() throws TransactionException {
        CoreBanking readFromDBResult = ReadFromDB.readFromDB();
        assertSame((new CoreBankingDataManagementMenu(readFromDBResult)).coreBanking, readFromDBResult);
    }

    /**
     * Method under test: {@link CoreBankingDataManagementMenu#executeMenuOption(int)}
     */
    @Test
    public void testExecuteMenuOption() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by executeMenuOption(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new CoreBankingDataManagementMenu(ReadFromDB.readFromDB())).executeMenuOption(1);
    }

    /**
     * Method under test: {@link CoreBankingDataManagementMenu#executeMenuOption(int)}
     */
    @Test
    public void testExecuteMenuOption2() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by executeMenuOption(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new CoreBankingDataManagementMenu(ReadFromDB.readFromDB())).executeMenuOption(0);
    }

    /**
     * Method under test: {@link CoreBankingDataManagementMenu#executeMenuOption(int)}
     */
    @Test
    public void testExecuteMenuOption3() throws TransactionException {
        CoreBankingDataManagementMenu coreBankingDataManagementMenu = new CoreBankingDataManagementMenu(
                ReadFromDB.readFromDB());
        coreBankingDataManagementMenu.executeMenuOption(2);
        CoreBanking coreBanking = coreBankingDataManagementMenu.coreBanking;
        assertEquals(6, coreBanking.getAccounts().size());
        List<Client> clients = coreBanking.getClients();
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
     * Method under test: {@link CoreBankingDataManagementMenu#executeMenuOption(int)}
     */
    @Test
    public void testExecuteMenuOption4() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by executeMenuOption(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new CoreBankingDataManagementMenu(ReadFromDB.readFromDB())).executeMenuOption(-1);
    }

    /**
     * Method under test: {@link CoreBankingDataManagementMenu#executeMenuOption(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testExecuteMenuOption5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.datamanagement.ReadFromDB.readFromDB(ReadFromDB.java:19)
        //       at io.diffblue.corebanking.ui.menu.CoreBankingDataManagementMenu.executeMenuOption(CoreBankingDataManagementMenu.java:36)
        //   In order to prevent executeMenuOption(int)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   executeMenuOption(int).
        //   See https://diff.blue/R013 to resolve this issue.

        (new CoreBankingDataManagementMenu(null)).executeMenuOption(2);
    }
}

