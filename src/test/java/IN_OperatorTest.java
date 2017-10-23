import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

/*
 * IN_OperatorTest.java
 *
 * Erstellung     : 19.10.2017 / Srivastava
 *
 * Copyright © by GiP mbH
 */

public class IN_OperatorTest {

    @Test
    public void testSplitIntoList_singleDigit() throws Exception {
        List<String> output = IN_Operator.splitIntoList("1234");
        assertThat("1234").isIn(output);
        assertThat(IN_Operator.validate("1234")).isTrue();
    }

    @Test
    public void testSplitIntoList_singleString() throws Exception {
        List<String> output = IN_Operator.splitIntoList("abc");
        assertThat("abc").isIn(output);
        assertThat(IN_Operator.validate("abc")).isTrue();
    }

    @Test
    public void testSplitIntoList_multidigit() throws Exception {
        List<String> output = IN_Operator.splitIntoList("1234,2345,56,78");
        assertThat("1234").isIn(output);
        assertThat("2345").isIn(output);
        assertThat("56").isIn(output);
        assertThat("78").isIn(output);
        assertThat(IN_Operator.validate("1234,2345,56,78")).isTrue();
    }

    @Test
    public void testSplitIntoList_multiString() throws Exception {
        List<String> output = IN_Operator.splitIntoList("abc,xyz,fgh");
        assertThat("abc").isIn(output);
        assertThat("xyz").isIn(output);
        assertThat("fgh").isIn(output);
        assertThat(IN_Operator.validate("abc,xyz,fgh")).isTrue();
    }

    @Test
    public void testSplitIntoList_multiStringWithSpacesAtStart() throws Exception {
        List<String> output = IN_Operator.splitIntoList("abc, xyz,fgh ");
        assertThat("abc").isIn(output);
        assertThat("xyz").isIn(output);
        assertThat("fgh").isIn(output);
        assertThat(IN_Operator.validate("abc, xyz,fgh ")).isTrue();
    }

    @Test
    public void testSplitIntoList_multiStringWithSpacesInBetween() throws Exception {
        List<String> output = IN_Operator.splitIntoList("abc, x y z,fgh");
        assertThat("abc").isIn(output);
        assertThat("x y z").isIn(output);
        assertThat("fgh").isIn(output);
        assertThat(IN_Operator.validate("abc, x y z,fgh")).isTrue();
    }

    @Test
    public void testSplitIntoList_quoteSimple() throws Exception {
        List<String> output = IN_Operator.splitIntoList("\"abc\", \" xyz\", \"fgh \"");
        assertThat("abc").isIn(output);
        assertThat(" xyz").isIn(output);
        assertThat("fgh ").isIn(output);
        assertThat(IN_Operator.validate("\"abc\", \" xyz\", \"fgh \"")).isTrue();
    }

    @Test
    public void testSplitIntoList_quoteNumeric() throws Exception {
        List<String> output = IN_Operator.splitIntoList("\"12,34\",\"23,45\",\"56\",\"78\"");
        assertThat("12,34").isIn(output);
        assertThat("23,45").isIn(output);
        assertThat("56").isIn(output);
        assertThat("78").isIn(output);
        assertThat(IN_Operator.validate("\"12,34\",\"23,45\",\"56\",\"78\"")).isTrue();
    }

    @Test
    public void testSplitIntoList_singleQuotes() throws Exception {
        List<String> output = IN_Operator.splitIntoList("'12,34','23,45','56','78'");
        assertThat("'12").isIn(output);
        assertThat("34'").isIn(output);
        assertThat("'23").isIn(output);
        assertThat("45'").isIn(output);
        assertThat("'56'").isIn(output);
        assertThat("'78'").isIn(output);
        assertThat(IN_Operator.validate("'12,34','23,45','56','78'")).isTrue();
    }

    @Test
    public void testSplitIntoList_escapingQuotes() throws Exception {
        List<String> output = IN_Operator.splitIntoList("\"he says \"\"hello\"\"\", \"he says \"\"goodbye\"\"\"");
        assertThat("he says \"hello\"").isIn(output);
        assertThat("he says \"goodbye\"").isIn(output);
        assertThat(IN_Operator.validate("\"he says \"\"hello\"\"\", \"he says \"\"goodbye\"\"\"")).isTrue();
    }

    @Test
    public void testSplitIntoList_escapingQuotes_butUnquotedTokens() throws Exception {
        List<String> output = IN_Operator.splitIntoList("he says \"\"hello\"\", he says \"\"goodbye\"\"");
        assertThat("he says \"hello\"").isIn(output);
        assertThat("he says \"goodbye\"").isIn(output);
        assertThat(IN_Operator.validate("he says \"\"hello\"\", he says \"\"goodbye\"\"")).isFalse();
    }

    @Test
    public void testSplitIntoList_mixingQuotedAndUnquoted() throws Exception {
        List<String> output = IN_Operator.splitIntoList("\"12\", 3");
        assertThat("12").isIn(output);
        assertThat("3").isIn(output);
        assertThat(IN_Operator.validate("\"12\", 3")).isFalse();
    }

    @Test
    public void testSplitIntoList_blankQuoted() throws Exception {
        List<String> output = IN_Operator.splitIntoList("\"\"");
        assertThat("").isIn(output);
        assertThat(IN_Operator.validate("\"\"")).isTrue();
    }

    @Test
    public void testSplitIntoList_blankUnQuoted() throws Exception {
        List<String> output = IN_Operator.splitIntoList(" ,sdf");
        assertThat("").isIn(output);
        assertThat("sdf").isIn(output);
        assertThat(IN_Operator.validate(" ,sdf")).isTrue();
    }

}
