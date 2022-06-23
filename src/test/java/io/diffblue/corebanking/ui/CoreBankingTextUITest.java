package io.diffblue.corebanking.ui;

import io.diffblue.corebanking.CoreBanking;
import io.diffblue.corebanking.datamanagement.ReadFromDB;
import io.diffblue.corebanking.transaction.TransactionException;
import org.junit.Test;

public class CoreBankingTextUITest {
    /**
     * Method under test: {@link CoreBankingTextUI#CoreBankingTextUI(CoreBanking)}
     */
    @Test
    public void testConstructor() throws TransactionException {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     CoreBankingTextUI.coreBanking

        new CoreBankingTextUI(ReadFromDB.readFromDB());
    }
}

