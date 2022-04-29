package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if(brackets<0){
                return false;
            }
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }

        }
        return brackets == 0;

    }

//    public boolean bracketsMatch(String brackets)
//    {
//        int balance = 0;
//        for (int i = 0; i < brackets.length(); i++)
//        {
//            char value = brackets.charAt(i);
//            if (value == '[')
//            {
//                balance += 1;
//            }
//
//            else if (value == ']')
//            {
//                balance -= 1;
//            }
//
//        }
//
//        if (balance < 0)
//        {
//            return false;
//        }
//
//        else
//        {
//            return true;
//        }
//    }

}
