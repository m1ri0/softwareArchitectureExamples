package br.unesp.rc.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

/**
 *
 * @author Prof. Frank J. Affonso
 */
@Suite
@SuiteDisplayName("Suíte de teste")
@SelectClasses({VectorEqualTest.class, VectorSizeTest.class})
public class JUnitTestSuite {
}
