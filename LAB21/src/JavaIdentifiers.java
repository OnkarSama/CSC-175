public class JavaIdentifiers {

    public static void main(String[] args) {
        String[] identifiers = {"hello", "WORLD", "var_1", "$myVar", "a_1$b_2_c_3", "fjw@1"};

        for(String id: identifiers){
            System.out.println(id + " is a legal Java identifier? " + isId(id));

        }

    }

    public static boolean isId(String w) {

        if(w.length() == 1) { // base case
            if(isLetter(w.charAt(0))) {
                return true;
            } else {
                return false;
            }
        } else if(isLetter(w.charAt(w.length()-1)) || isDigit(w.charAt(w.length()-1)) ) {
            return isId(w.substring(0, w.length() - 1));  // Point X
        } else {
            return false;
            // end if
        }
    }

    public static boolean isLetter(char w) {
        return ((w >= 'a' && w <= 'z') || (w >= 'A' && w <= 'Z') || w == '_' || w == '$');

    }

    public static boolean isDigit(char w) {
        return w >= '0' && w< '9';
    }
}





