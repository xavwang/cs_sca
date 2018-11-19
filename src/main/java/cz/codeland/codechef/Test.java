package cz.codeland.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test
{
  public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException
  {
    List<String> inputs = new ArrayList<String>();
    String line;
    while ((line = in.readLine()) != null) {
      inputs.add(line);
    }
    String result = new Test().solveProblem(inputs);
    System.out.println(result);
  }

  public String solveProblem(List<String> inputs)
  {
    StringBuilder result = new StringBuilder();

    for (String input : inputs) {
      if (Integer.parseInt(input) == 42) break;
      result.append(input);
      result.append("\n");
    }

    return result.toString();
  }
}
