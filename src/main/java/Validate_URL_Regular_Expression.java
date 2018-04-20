import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_URL_Regular_Expression {

    public static String regex = null;
    public static ArrayList<String> strings_to_match = new ArrayList<>();

    public static void main(String[] args) {
        match_jvm_arguments();

        IsMatch(strings_to_match, regex);
        strings_to_match.clear();
        strings_to_match = null;
    }

    private static void match_jvm_arguments() {
        print_method_name();
        // regular expression to match WEB URLS
        regex = "[0-9]*m";

        strings_to_match.add("196m");
        strings_to_match.add("12345m");
        strings_to_match.add("m678");
        strings_to_match.add("URL4=jdbc:h2:${user.home}/out/ICGUI/${SOURCE.USER}");
        strings_to_match.add("am_von=05.2009");
        strings_to_match.add("KIDICAP.MI.QUERY.NAME=POC PC Download");
        strings_to_match.add("KIDICAP_DB_HOST=sro-oracle-gb");
        strings_to_match.add("KIDICAP_DB_NAME=orcl");
        strings_to_match.add("KIDICAP_DB_USER=KIDICAP_R165_RZV_57");
        strings_to_match.add("KIDICAP_DB_PASS=KIDICAP_R165_RZV_57");
        strings_to_match.add("KIDICAP_DB_PORT=1521");
        strings_to_match.add("KIDICAP_URL=http://sro-misc1-gb:57180");
    }

    private static void match_comand_parameters() {
        print_method_name();
        // regular expression to match WEB URLS
        regex = "(^[\\w\\.]+=[\\w /:\\-\\.\\t\\${}]*$\\r?\\n?)*";

        strings_to_match.add("URL1=jdbc:h2:user.home/out/ICGUI/SOURCE.USER");
        strings_to_match.add("URL2=jdbc:h2:~/IC_GUI/ICGUI_R165_RZV_57");
        strings_to_match.add("URL3=jdbc:h2:/IC_GUI/ICGUI_R165_RZV_57");
        strings_to_match.add("URL4=jdbc:h2:${user.home}/out/ICGUI/${SOURCE.USER}");
        strings_to_match.add("URL5=jdbc:h2:$user.home/out/ICGUI/$SOURCE.USER");
        strings_to_match.add("am.von=05.2009");
        strings_to_match.add("KIDICAP.MI.QUERY.NAME=POC PC Download");
        strings_to_match.add("KIDICAP_DB_HOST=sro-oracle-gb");
        strings_to_match.add("KIDICAP_DB_NAME=orcl");
        strings_to_match.add("KIDICAP_DB_USER=KIDICAP_R165_RZV_57");
        strings_to_match.add("KIDICAP_DB_PASS=KIDICAP_R165_RZV_57");
        strings_to_match.add("KIDICAP_DB_PORT=1521");
        strings_to_match.add("KIDICAP_URL=http://sro-misc1-gb:57180");
    }

    private static void match_comand_parameters_take_1() {
        print_method_name();
        // regular expression to match WEB URLS
        regex = "(^\\w+=[\\w \\{\\}\\$/:\\-\\.\\t]*$\\r?\\n?)*";
        regex = "(^\\w+=[\\w /:\\-\\.\\t]*$\\r?\\n?)*";

        strings_to_match.add("jdbc_url=jdbc:h2h1");
        strings_to_match.add("URL2=jdbc:h2:~/IC_GUI/ICGUI_R165_RZV_57");
        strings_to_match.add("URL3=jdbc:h2:/IC_GUI/ICGUI_R165_RZV_57");
        strings_to_match.add("URL4=jdbc:h2:${user.home}/out/ICGUI/${SOURCE.USER}");
        strings_to_match.add("am_von=05.2009");
        strings_to_match.add("KIDICAP.MI.QUERY.NAME=POC PC Download");
        strings_to_match.add("KIDICAP_DB_HOST=sro-oracle-gb");
        strings_to_match.add("KIDICAP_DB_NAME=orcl");
        strings_to_match.add("KIDICAP_DB_USER=KIDICAP_R165_RZV_57");
        strings_to_match.add("KIDICAP_DB_PASS=KIDICAP_R165_RZV_57");
        strings_to_match.add("KIDICAP_DB_PORT=1521");
        strings_to_match.add("KIDICAP_URL=http://sro-misc1-gb:57180");
    }

    private static void match_web_url() {
        print_method_name();
        // regular expression to match WEB URLS
        regex = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        strings_to_match.add("http://sro-misc1-gb:52180");
    }

    private static void IsMatch(ArrayList<String> list_of_strings, String pattern) {
        Matcher matcher = null;
        try {
            Pattern patt = Pattern.compile(pattern);
            for (String s : list_of_strings) {
                matcher = patt.matcher(s);
                System.out.println(s + " : " + (matcher.matches() ? "Matches" : "Not Matches"));
            }

        } catch (RuntimeException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void print_method_name() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[stacktrace.length - 2];// maybe this number needs to be corrected
        String methodName = e.getMethodName();
        System.out.println("Calling Method :" + methodName);
    }
}
