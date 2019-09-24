package KW.CH04;

public class Exercise_4_2_2 {

    /*<exercise chapter="4" section="2" type="programming" number="2">*/
    public static boolean isPalindrome(String s) {
        boolean result = true;
        for (int i = 0; result && i < s.length() / 2; i++) {
            char c1 = Character.toLowerCase(s.charAt(i));
            char c2 = Character.toLowerCase(s.charAt(s.length() - i - 1));
            result = c1 == c2;
        }
        return result;
    }
    /*</exercise>*/

    private static class TestCase {

        private final String s;
        private final boolean result;

        public TestCase(String s, boolean result) {
            this.s = s;
            this.result = result;
        }
    }

    private static boolean doTest(TestCase t) {
        return t.result == isPalindrome(t.s);
    }
    private static final TestCase[] tests = {
        new TestCase("kayak", true),
        new TestCase("I saw I was I", true),
        new TestCase("Able was I ere I saw Elba", true),
        new TestCase("x", true),
        new TestCase("xy", false),
        new TestCase("xyx", true),
        new TestCase("xxy", false),
        new TestCase("abcbca", false)
    };

    public static void main(String[] args) {
        boolean allPass = true;
        for (int i = 0; i < tests.length; i++) {
            boolean pass = doTest(tests[i]);
            if (pass) {
                System.out.println("Test " + i + " passed");
            } else {
                System.out.println("Test " + i + "       FAILED");
            }
            allPass = allPass && pass;
        }
        if (allPass) {
            System.out.println("All tests passed");
        }
    }
}
