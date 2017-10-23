import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/*
 * IN_Operator.java
 *
 * Erstellung     : 19.10.2017 / Srivastava
 *
 * Copyright © by GiP mbH
 */

public class IN_Operator {
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

    public static List<String> splitIntoList(String input) {
        String[] splitedTokens = null;
        String modifiedToken = null;
        splitedTokens = input.trim().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        ArrayList<String> modifiedTokens = new ArrayList<>();
        for (String token : splitedTokens) {
            modifiedToken = token.trim();
            if (modifiedToken.startsWith("\"")) {
                modifiedToken = StringUtils.substring(modifiedToken, 1, modifiedToken.length() - 1);
            }
            if (StringUtils.contains(modifiedToken, "\"\"")) {
                modifiedToken = StringUtils.replace(modifiedToken, "\"\"", "\"");
            }
            modifiedTokens.add(modifiedToken);
        }
        return modifiedTokens;
    }

    public static boolean validate(String input) {
        if (StringUtils.contains(input, "\"")) {
            return input.matches("(\".*\"|[^,\"\\s]+$)");
        }
        return true;
    }

}
