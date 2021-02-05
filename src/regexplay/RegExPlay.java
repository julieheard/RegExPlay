package regexplay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPlay {

    public static void main(String[] args) {

        //Pattern for an address
        String pattern = "\\d{1,3}.?\\d{0,3}\\s[a-zA-Z]{2,30}\\s[a-zA-Z]{2,15}";
        Pattern p = Pattern.compile(pattern);
        Matcher m= p.matcher("1 Beech avenue");
        System.out.println(m.matches());

    }

}
