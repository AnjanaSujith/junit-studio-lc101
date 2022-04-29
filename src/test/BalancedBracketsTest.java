package test;
import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {


    //Check true if passed '[]'
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //Check true if passed '[Launch[]]'
    @Test
    public void stringWithBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[]]"));
    }
    //Check true if passed '[[Launch]]'
    @Test
    public void doubleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch]]"));
    }
    //Check true if passed '[[[]]]'
    @Test
    public void onlyNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    //Check true if passed '[][]'
    @Test
    public void onlyDoubleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    //Check false if passed ']['
    @Test
    public void invertedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    //Check false if passed '[[[Launch]]'
    @Test
    public void threeBracketsWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[Launch]]"));
    }
    //Check false if passed ']]][[['
    @Test
    public void startOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][[["));
    }
    //Check false if passed ']]Launch][[['
    @Test
    public void startOpenBracketsWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]Launch][[["));
    }
    //Check false if passed '][]['
    @Test
    public void closeOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }
    //Check false if passed '[Launch]['
    @Test
    public void noCloseSecondBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]["));
    }
    //Check false if passed '[Launch]['
    @Test
    public void endCloseSecondBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]]Code["));
    }
}
