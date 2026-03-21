package wutang;

import com.noobsmoke.wutang.WuTangClanProgramAdvanced;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class WuTangClanProgramAdvancedTest {


    private WuTangClanProgramAdvanced underTest;

    @BeforeEach
    public void setUp() {
        underTest = new WuTangClanProgramAdvanced();
    }

    @Test
    public void canAddMember() {

        underTest.addMember("RZA");
        assertTrue(underTest.hasMember("RZA"));
    }

    @Test
    public void cannotAddDuplicate() {
        String memberName = "RZA";
        underTest.addMember(memberName);
        Exception ex = assertThrows(IllegalStateException.class,
                () -> underTest.addMember(memberName));
        assertEquals(memberName+ " already exists in clan", ex.getMessage());
    }
//
//    @ParameterizedTest
//    @ValueSource(strings = {"null", " "})
//    public void cannotAddInvalidName(String memberName) {
//        // Converting the string "null" to an actual null reference
//        String finalName = memberName.equalsIgnoreCase("null") ? null : memberName;
//        Exception exception = assertThrows(IllegalArgumentException.class, () -> underTest.addMember(finalName));
//        assertEquals("Please enter a valid member name", exception.getMessage());
//    }
//
//    @Test
//    public void hasMemberTrue() {
//        underTest.addMember("RZA");
//        underTest.addMember("GZA");
//        underTest.addMember("Inspectah Deck");
//        String memberName = "gza";
//        assertTrue(underTest.hasMember(memberName));
//    }
//
//    @Test
//    public void hasMemberFalse() {
//        underTest.addMember("RZA");
//        underTest.addMember("GZA");
//        underTest.addMember("Inspectah Deck");
//        String memberName = "Ghostface Killah";
//        assertFalse(underTest.hasMember(memberName));
//    }
}
