public class Sponge {

  /*
   * Create a method "spongeCase" that takes a string consisting of one or more words 
   * separated by spaces. It should return a new string converted to "sponge 
   * case," where each word starts with a lowercase letter, and then alternates 
   * between upper and lower case for each following letter in the word.
   *
   * Examples:
   *
   * spongeCase("spongebob")  should return "sPoNgEbOb"
   * spongeCase("Who are YOU calling A Pinhead")  should return "wHo aRe yOu cAlLiNg a pInHeAd"
   * spongeCase("WHAT is UP my dude")  should return "wHaT iS uP mY dUdE"
   * spongeCase("debí tirar más fotos") should return dEbÍ tIrAr mÁs fOtOs" (note the accents)
   * spongeCase("E")  should return "e"
   * spongeCase("e")  should return "e"
   * 
   * Hints:
   * There exist the following methods in java:
   * Character.toUpperCase() (e.g. Character.toUpperCase('f'))
   * Character.toLowerCase() (e.g. Character.toLowerCase('Q'))
   * .toCharArray() String method (e.g. myString.toCharArray())
   */
  public static void main(String[] args) {
    // Test cases
    assertEqual(1, spongeCase("spongebob"), "sPoNgEbOb");
    assertEqual(2, spongeCase("Who are YOU calling A Pinhead"), "wHo aRe yOu cAlLiNg a pInHeAd");
    assertEqual(3, spongeCase("WHAT is UP my dude"), "wHaT iS uP mY dUdE");
    assertEqual(4, spongeCase("debí tirar más fotos"), "dEbÍ tIrAr mÁs fOtOs");
    assertEqual(5, spongeCase("E"), "e");
    assertEqual(6, spongeCase("e"), "e");
    System.out.println(spongeCase("Who are YOU calling A Pinhead"));
  }

  // Implement your solution here!
  public static String spongeCase(String x) {
    int count = 0;
    char cX;
    String nS = "";
    String cX2 = "";

    for(int i = 0; i < x.length(); i++)
    {
      cX = x.charAt(i);
      if(cX == ' ')
      {
        nS += " ";
        if(count % 2 != 0)
        {
          count--;
        }
      }
      else
      {
        count++;
        cX2 += cX;
        if(count % 2 == 0)
        {
          cX2 = cX2.toUpperCase();
          nS += cX2;
        }
        else
        { 
          cX2 = cX2.toLowerCase();
          nS += cX2;
        }
        cX2 = "";
      }
    }
    return nS;
  }


  // Method to help with testing, you do not need to read this.
  public static void assertEqual(int testNumber, String actual, String expected) {
    if (!expected.equals(actual)) {
      System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
    } else {
      System.out.println("Test " + testNumber + " passed!");
    }
  }

  /*
  public static String spongeCase(String x)
  {
    int count = 1;
    char cX;
    String nS;
    String cX2 = " ";

    for(int i = 0; i < x.length(); i++)
    {
      cX = x.charAt(i);
      if(cX == ' ')
      {
        count--;
        nS += " ";
      }
      else
      {
        cX2 += cX;
        if(count % 2 == 0)
        {
          cX2 = cX2.toUpperCase();;
          nS += cX2;
        }
        else
        {
          nS += cX;
        }
        count++;
        cX2 = " ";
      }
    }
    return nS;
  }
  */
}