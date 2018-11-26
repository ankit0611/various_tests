import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class IN_Operator {
    private static final String DOUBLE_QUOTES = "\"";
    private static final String REGEX_FOR_SPLIT = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
    private static final String REGEX_FOR_VALIDATION = "(\".*\"|[^,\"\\s]+$)";

    public static void main(String[] args) {
        ArrayList<String> inputlist = new ArrayList<>();

        utils.ListUtils.printList(splitIntoList("\"abc\", \" xyz\", \"fgh \""));
    }

    public static List<String> splitIntoList_v1(String input) {
        String[] splitedTokens = null;
        String modifiedToken = null;
        if (StringUtils.contains(input, "\"")) {
            input = StringUtils.replace(input, "\"\"", "\"");
            splitedTokens = input.trim().split("\"\\s*,\\s*\"");
        } else {
            splitedTokens = input.trim().split("\\s*,\\s*");
        }
        ArrayList<String> modifiedTokens = new ArrayList<>();
        for (String token : splitedTokens) {

            modifiedToken = StringUtils.strip(token, "\"");
            modifiedTokens.add(modifiedToken);
        }
        return modifiedTokens;
    }

    public static List<String> splitIntoList(String userInput) {
        String[] splitedTokens = null;
        String modifiedToken = null;
        splitedTokens = userInput.trim().split(REGEX_FOR_SPLIT);
        ArrayList<String> modifiedTokens = new ArrayList<>();
        for (String token : splitedTokens) {
            modifiedToken = token.trim();
            if (modifiedToken.startsWith(DOUBLE_QUOTES)) {
                modifiedToken = StringUtils.substring(modifiedToken, 1, modifiedToken.length() - 1);
            }
            if (StringUtils.contains(modifiedToken, DOUBLE_QUOTES + DOUBLE_QUOTES)) {
                modifiedToken = StringUtils.replace(modifiedToken, DOUBLE_QUOTES + DOUBLE_QUOTES, DOUBLE_QUOTES);
            }
            modifiedTokens.add(modifiedToken);
        }
        return modifiedTokens;
    }

    public static List<String> splitIntoList_v3(String userInput) {
        String[] splitedTokens = null;
        String modifiedToken = null;
        splitedTokens = userInput.trim().split(REGEX_FOR_SPLIT);
        ArrayList<String> modifiedTokens = new ArrayList<>();
        for (String token : splitedTokens) {
            modifiedToken = token.trim();
            modifiedToken = StringUtils.replace(modifiedToken, DOUBLE_QUOTES + DOUBLE_QUOTES, "temp");
            modifiedToken = StringUtils.replace(modifiedToken, DOUBLE_QUOTES, "");
            modifiedToken = StringUtils.replace(modifiedToken, "temp", DOUBLE_QUOTES);

            modifiedTokens.add(modifiedToken);
        }
        return modifiedTokens;
    }

    public static boolean validateInputForInOperator_v1(String userInput) {
        if (StringUtils.contains(userInput, DOUBLE_QUOTES)) {
            return userInput.matches(REGEX_FOR_VALIDATION);
        }
        return true;
    }

    public static boolean validateInputForInOperator(String userInput) {
        int index_of_unquoted_quote = 0;
        String modified = null;
        String tokens[] = null;
        if (StringUtils.contains(userInput, DOUBLE_QUOTES)) {
            modified = userInput.replaceAll("\\s*,", ",");
            modified = userInput.replaceAll(",\\s*", ",");
            tokens = modified.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            for (String s : tokens) {
                if (!s.startsWith("\"")) {
                    return false;
                }
                if (!s.endsWith("\"")) {
                    return false;
                }
                modified = StringUtils.replace(s, DOUBLE_QUOTES + DOUBLE_QUOTES, "");
                index_of_unquoted_quote = StringUtils.indexOf(modified, "\"", 1);
                if (index_of_unquoted_quote > 0 && index_of_unquoted_quote < modified.length() - 1) {
                    return false;
                }
            }
        }
        return true;
    }

}
