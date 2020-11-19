/**
 * @author fatihtastemur
 * @created 19/11/2020 - 16:32
 * @project java-101
 */
public class StringDataType {

    private static final String stringDeger = "Java-101";

    /**
     * @param stringDeger
     * @return
     */
    public static int stringLength(String stringDeger) {
        return stringDeger.length();
    }

    /**
     * @param stringDeger
     * @param start
     * @param end
     * @return
     */
    public static String subString(String stringDeger, int start, int end) {
        return stringDeger.substring(start, end);
    }

    /**
     * @param stringDeger
     * @return
     */
    public static Boolean checkEmptyString(String stringDeger) {
        return stringDeger.isEmpty();
    }

    /**
     * @param stringDeger
     * @param oldString
     * @param newString
     * @return
     */
    public static String replaceString(String stringDeger, String oldString, String newString) {
        return stringDeger.replace(oldString, newString);
    }

    public static void main(String[] args) {
        System.out.println("String : " + stringDeger);

        int a = stringLength(stringDeger);
        System.out.println("Length : " + a);

        String b = subString(stringDeger, 0, 4);
        System.out.println("Substring : " + b);

        boolean c = checkEmptyString(stringDeger);
        System.out.println("Check Empty : " + c);

        String d = replaceString(stringDeger, "101", "201");
        System.out.println("Replace String : " + d);

        System.out.println("Concat : " + stringDeger.concat("-Workspace"));

        System.out.println("CharAt : " + stringDeger.charAt(2));

        System.out.println("Upper : " + stringDeger.toUpperCase());
        System.out.println("Lower : " + stringDeger.toLowerCase());

        boolean e = stringDeger.equals("Java");
        System.out.println("Check Equal : " + e);

        boolean f = stringDeger.equalsIgnoreCase("java-101");
        System.out.println("Check Equal Ignore Case : " + f);

        System.out.println("Split : " + stringDeger.split("-")[1]);
    }
}
