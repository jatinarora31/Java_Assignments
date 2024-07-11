package String;

public class Strings {
    public static void main(String[] args) {

        String s1 = "This is a string";
        System.out.println(s1);

        String s2 = new String("Creating a string object and placed in memory \"Heap\"");
        System.out.println(s2);


        String sc1 = "This String is ";
        String sc2 = "Concatenated";
        String con = sc1 + sc2;
        System.out.println(con);


        String sl = "String Length";
        int len = sl.length();
        System.out.println("String Length : " + len);


        String es = "Extracting string";
        String sub = es.substring(2, 10);
        System.out.println("Extracted string : " + sub);


        String si = "Searching index";
        int i1 = si.indexOf("index");
        int i2 = si.indexOf("h", 3);
        System.out.println("At Index : " + i1);
        System.out.println("At Index : " + i2);


        String ms = "Matching a String";
        boolean match = ms.matches("(.*)String(.*)");
        System.out.println("Matches : " + match);


        String cs1 = "Comparing strings";
        String cs2 = "Comparing strings";

        boolean e = cs1.equals(cs2);
        System.out.println("Equal : " + e);

        boolean eic = cs1.equalsIgnoreCase(cs2);
        System.out.println("Equal(ignore case) : " + eic);

        boolean sw = cs1.startsWith("Comp");
        System.out.println("Starts with : " + sw);

        boolean ew = cs1.endsWith("ings");
        System.out.println("Ends with : " + ew);
        int ct = cs1.compareTo(cs2);
        System.out.println("Compared : " + ct);


        String ts = "   Trimming String  ";
        String trm = ts.trim();
        System.out.println("Trimmed : " + trm);


        String rs = "Replacing string";
        String rpl = rs.replace("g", "n");
        System.out.println("Replaced : " + rpl);

        String ss = "Splitting String";
        String[] spl = ss.split(" "); 

        for (String i : spl) {
            System.out.println("Splitted : " + i);
        }


        int ns = 11;
        String nTs = String.valueOf(ns);
        System.out.println("Converted Num to Str : " + nTs + 22);


        int is = 11;
        String iTs = Integer.toString(is);
        System.out.println("Converted int to str : " + iTs + 33);


        String a = "upper case";
        String b = "LOWER CASE";
        String c = a.toUpperCase();
        String d = b.toLowerCase();
        System.out.println("Converted to upper case : " + c);
        System.out.println("Converted yo lower case : " + d);
    }
}
