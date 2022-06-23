package io.diffblue.corebanking.ui.menu;

import static org.junit.Assert.assertSame;

import io.diffblue.corebanking.CoreBanking;
import io.diffblue.corebanking.datamanagement.ReadFromDB;
import io.diffblue.corebanking.transaction.TransactionException;
import org.junit.Test;

public class MainMenuTest {
    /**
     * Method under test: {@link MainMenu#MainMenu(CoreBanking)}
     */
    @Test
    public void testConstructor() throws TransactionException {
        CoreBanking readFromDBResult = ReadFromDB.readFromDB();
        assertSame((new MainMenu(readFromDBResult)).coreBanking, readFromDBResult);
    }

    /**
     * Method under test: {@link MainMenu#executeMenuOption(int)}
     */
    @Test
    public void testExecuteMenuOption() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by executeMenuOption(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new MainMenu(ReadFromDB.readFromDB())).executeMenuOption(0);
    }
}

