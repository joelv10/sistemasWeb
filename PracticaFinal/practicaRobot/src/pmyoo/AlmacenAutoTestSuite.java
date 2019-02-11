import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Func1RobotSeguidorLineaTest.class, 
	Func1RobotSeguidorLineaTest2.class, 
	Func2DireccionTest.class,
	Func2RobotPreparadorTest.class, 
	Func3EstanteriaTest.class,
	Func4AlmacenGestorTest.class,
	Func4AlmacenGestorTest2.class,
	})
public class AlmacenAutoTestSuite {


}
