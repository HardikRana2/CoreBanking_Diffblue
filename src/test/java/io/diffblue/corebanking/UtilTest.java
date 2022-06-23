package io.diffblue.corebanking;

import org.junit.Ignore;
import org.junit.Test;

public class UtilTest {
    /**
     * Method under test: {@link Util#generateXdigitNumber(int)}
     */
    @Test
    public void testGenerateXdigitNumber() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by generateXdigitNumber(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        Util.generateXdigitNumber(10);
    }

    /**
     * Method under test: {@link Util#generateXdigitNumber(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGenerateXdigitNumber2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: ""
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:601)
        //       at java.lang.Long.parseLong(Long.java:631)
        //       at io.diffblue.corebanking.Util.generateXdigitNumber(Util.java:17)
        //   In order to prevent generateXdigitNumber(int)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   generateXdigitNumber(int).
        //   See https://diff.blue/R013 to resolve this issue.

        Util.generateXdigitNumber(0);
    }
}

