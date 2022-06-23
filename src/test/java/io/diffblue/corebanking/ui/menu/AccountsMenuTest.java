package io.diffblue.corebanking.ui.menu;

import static org.junit.Assert.assertSame;

import io.diffblue.corebanking.CoreBanking;
import io.diffblue.corebanking.datamanagement.ReadFromDB;
import io.diffblue.corebanking.transaction.TransactionException;
import org.junit.Ignore;
import org.junit.Test;

public class AccountsMenuTest {
    /**
     * Method under test: {@link AccountsMenu#AccountsMenu(CoreBanking)}
     */
    @Test
    public void testConstructor() throws TransactionException {
        CoreBanking readFromDBResult = ReadFromDB.readFromDB();
        assertSame((new AccountsMenu(readFromDBResult)).coreBanking, readFromDBResult);
    }

    /**
     * Method under test: {@link AccountsMenu#executeMenuOption(int)}
     */
    @Test
    public void testExecuteMenuOption() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by executeMenuOption(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new AccountsMenu(ReadFromDB.readFromDB())).executeMenuOption(1);
    }

    /**
     * Method under test: {@link AccountsMenu#executeMenuOption(int)}
     */
    @Test
    public void testExecuteMenuOption2() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by executeMenuOption(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new AccountsMenu(ReadFromDB.readFromDB())).executeMenuOption(0);
    }

    /**
     * Method under test: {@link AccountsMenu#executeMenuOption(int)}
     */
    @Test
    public void testExecuteMenuOption3() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by executeMenuOption(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new AccountsMenu(ReadFromDB.readFromDB())).executeMenuOption(2);
    }

    /**
     * Method under test: {@link AccountsMenu#executeMenuOption(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testExecuteMenuOption4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at io.diffblue.corebanking.ui.menu.AccountsMenu.viewAccounts(AccountsMenu.java:46)
        //       at io.diffblue.corebanking.ui.menu.AccountsMenu.executeMenuOption(AccountsMenu.java:30)
        //   In order to prevent executeMenuOption(int)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   executeMenuOption(int).
        //   See https://diff.blue/R013 to resolve this issue.

        (new AccountsMenu(null)).executeMenuOption(1);
    }

    /**
     * Method under test: {@link AccountsMenu#executeMenuOption(int)}
     */
    @Test
    public void testExecuteMenuOption5() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by executeMenuOption(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new AccountsMenu(ReadFromDB.readFromDB())).executeMenuOption(-1);
    }
}

