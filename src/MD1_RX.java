import java.util.regex.*;

public class MD1_RX {
    /*
    The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.
    It is widely used to define the constraint on strings such as password and email validation.

    Regex provides 1 interface and 3 classes.
    Interface:          |    Class:
        MatchResult     |        Matcher
                        |        Pattern
                        |        PatternSyntaxException

    Matcher Class
        Matches:    (boolean) whether the regular expression matches the string.

        find:       (boolean) find the next expression that matches the pattern.
            & find(int start) : starts from a given index.

        group:      (String) Returns the matched subsequence.

        start:      (int) Returns the index where subsequence matched.
            & end

        groupCount  (int) Returns the no. of matches.

    Pattern Class
        Pattern.compile(String regex) : Compiles the regex and returns the instance of the pattern.

        matcher(String input) : Creates a matcher that matches the given input with the pattern.

        Matcher.matches(String regex, String input) : combination of compile and matcher method.

        split(String input) : (String) splits the string around the matched part.

        String pattern : returns the regex pattern.
     */

    /*
    Character Classes
        Simple [abc] : a or b or c.
        Range [a-z] : from a to z.
        Union [a-zA-Z] : from a to z and A to Z.
        Subtraction [^a-z] : except a to z.
        Intersection [a-z&&[0-9]] : from a to z and 1 must from 0 to 9.

    Regex Quantifiers
        X? : once or not at all
        X+ : once or more
        X* : none or more
        X{n} : exactly n times
        X{n,} : n or more times
        X{n,m} : between n and m.

    Regex MetaCharacters
        '.' represents any character but one.
        \d : Any digit.
        \D : Not any digit.
        \s : any whitespace character.
        \S : any non whitespace character.
        \w : [0-9a-zA-Z_]
        \W : not [0-9a-zA-Z_] | [^\w]

     */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a]{3}");
        Matcher m = p.matcher("aa");
        boolean b = m.matches();

        //or

        boolean ans = Pattern.compile("[798]{1}\\d{9}").matcher("9897991234").matches();
        System.out.println(ans);
    }
}

