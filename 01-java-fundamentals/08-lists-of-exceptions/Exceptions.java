import java.util.ArrayList;

class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Casted Value: " + castedValue);
            } catch (ClassCastException castError) {
                System.out.println("Error Message: " + castError);
                System.out.println("Index of Array: " + i);
                System.out.println("Value of Element: " + myList.get(i));
            }
        }
    }
}