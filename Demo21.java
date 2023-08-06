public class Demo21 {
    public static void main(String[] args) {

        /* reference equality */

        int x = 10;
        int y = 10;
        System.out.println(x==y);
        System.out.println(x!=y);  

        boolean flag = true;
        boolean flag2 = false;
        System.out.println(flag==flag2);

        double d = 10.25;
        System.out.println(d==x);
        System.out.println("....................................");

        // numeric == numeric , numeric != numeric
        // boolean == boolean , boolean != boolean

        // boolean == numeric <- error


        String str1 = "abc";
        String str2 = "edf";
        String str3 = new String("abc");

        // this is bad practice (Do not use ==, != to string)
        System.out.println(str1 == str2);       // false
        System.out.println(str2 == str3);       // false
        System.out.println(str1 == str3);       // false

        // with reference variables equality operator compare their memory location
        System.out.println(str1 == str3);       // false  // compare memory locations
        System.out.println(str1.equals(str3));  // true   // compare contents
        System.out.println("....................................");

        String str4 = "ABC";
        System.out.println(str1.equals(str4));                    // false
        System.out.println(str1.equalsIgnoreCase(str4));          // true  // ignore letter cases
        System.out.println("....................................");

        System.out.println(str1.compareTo(str3));                 // 0 
        System.out.println(str1.compareTo(str3) == 0);            // true
        System.out.println(str1.compareToIgnoreCase(str4)==0);    // true     
    }
}
