public class StringManipulatorTesting {
    public static void main(String[] args) {
        //StringManipulator manipulator = new StringManipulator();
        //String str = manipulator.trimAndConcat("     Hello    ", "      World      ");
        //System.out.println(str);

        //StringManipulator manipulator = new StringManipulator();
        //String indexStart = "o";
        //Integer a = manipulator.getIndexOrNull("Coding", indexStart);
        //Integer b = manipulator.getIndexOrNull("Hello World", indexStart);
        //Integer c = manipulator.getIndexOrNull("Hi", indexStart);
        //System.out.println(a); // 1
        //System.out.println(b); // 4
        //System.out.println(c); // null

        //StringManipulator manipulator = new StringManipulator();
        //String word = "Hello";
        //String subString = "llo";
        //String notSubString = "world";
        //Integer a = manipulator.getIndexOrNull(word, subString);
        //Integer b = manipulator.getIndexOrNull(word, notSubString);
        //System.out.println(a); // 2
        //System.out.println(b); // n

        StringManipulator manipulator = new StringManipulator();
        String word = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word); // eworld



    }
}

