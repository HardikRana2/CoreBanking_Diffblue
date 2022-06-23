package io.diffblue.corebanking.ui.menu;

import static org.junit.Assert.assertSame;

import io.diffblue.corebanking.CoreBanking;
import io.diffblue.corebanking.datamanagement.ReadFromDB;
import io.diffblue.corebanking.transaction.TransactionException;
import org.junit.Test;

public class ClientsMenuTest {
    /**
     * Method under test: {@link ClientsMenu#ClientsMenu(CoreBanking)}
     */
    @Test
    public void testConstructor() throws TransactionException {
        CoreBanking readFromDBResult = ReadFromDB.readFromDB();
        assertSame((new ClientsMenu(readFromDBResult)).coreBanking, readFromDBResult);
    }

    /**
     * Method under test: {@link ClientsMenu#executeMenuOption(int)}
     */
    @Test
    public void testExecuteMenuOption() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by executeMenuOption(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new ClientsMenu(ReadFromDB.readFromDB())).executeMenuOption(1);
    }

    /**
     * Method under test: {@link ClientsMenu#executeMenuOption(int)}
     */
    @Test
    public void testExecuteMenuOption2() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by executeMenuOption(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new ClientsMenu(ReadFromDB.readFromDB())).executeMenuOption(0);
    }
}

