package tests;
import org.junit.*;

public class Day02_JUnitAnnotations {
    /*
     * So far we kept using main method
     * We no longer need to use main method to create test cases with JUnit
     * -@Test : is used to create test cases*/
    // @Before: Runs before each @Test  class
    //@After : Runs after @Test mclass
    // Note: All @Test methods must be VOID

    @BeforeClass
    public  static void setUpClass(){
        System.out.println("Before Class Runs before the entire  class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class Runs before the entire  class");
    }
    @Before
    public void setUp(){
        System.out.println("Before method runs before  each @Test annotations  ");
    }
    @After
    public void SetUp(){
        System.out.println("After method runs before  each @Test annotations");
    }
    @Test
    public void test1(){
        System.out.println("Test 1");
    }
    @Test
    public void test2(){
        System.out.println("Test 2");
    }
    @Test
    public void test3(){
        System.out.println("Test 3");
    }
    @Test
    public void test4(){
        System.out.println("Test 4");
    }

    @Test@Ignore
    public void test5(){
        System.out.println("Test 5");

    }

}




