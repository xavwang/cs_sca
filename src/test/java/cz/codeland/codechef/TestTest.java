package cz.codeland.codechef;

import java.util.ArrayList;

public class TestTest
{
  @org.junit.Test
  public void testSolveProblem() throws Exception
  {
    ArrayList<String> inputs = new ArrayList<String>();
    inputs.add("1");
    inputs.add("2");
    inputs.add("88");
    inputs.add("42");
    inputs.add("99");

    String result = new Test().solveProblem(inputs);
    org.junit.Assert.assertEquals("failure - strings are not equal", "1\n2\n88\n", result);
  }
}
