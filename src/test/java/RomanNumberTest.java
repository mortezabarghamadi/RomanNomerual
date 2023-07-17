import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberTest {


    @Test
    void Addad_Romi_Chap_konad() {
            RomanNumber romanNumber = new RomanNumber();

        //    String result=romanNumber.convert( 1);
        /*assertThat(romanNumber.convert(1)).isEqualTo("I");
        assertThat(romanNumber.convert(2)).isEqualTo("II");
        assertThat(romanNumber.convert(3)).isEqualTo("III");
        assertThat(romanNumber.convert(5)).isEqualTo("V");
        assertThat(romanNumber.convert(6)).isEqualTo("VI");
        assertThat(romanNumber.convert(7)).isEqualTo("VII");
        assertThat(romanNumber.convert(8)).isEqualTo("VIII");
        assertThat(romanNumber.convert(10)).isEqualTo("X");
        assertThat(romanNumber.convert(11)).isEqualTo("XI");
        assertThat(romanNumber.convert(12)).isEqualTo("XII");
        assertThat(romanNumber.convert(13)).isEqualTo("XIII");
        assertThat(romanNumber.convert(20)).isEqualTo("XX");
        assertThat(romanNumber.convert(37)).isEqualTo("XXXVII");
        assertThat(romanNumber.convert(50)).isEqualTo("L");
        assertThat(romanNumber.convert(60)).isEqualTo("LX");
        assertThat(romanNumber.convert(70)).isEqualTo("LXX");
        assertThat(romanNumber.convert(80)).isEqualTo("LXXX");*/
        assertThat(romanNumber.convert(949)).isEqualTo("CMXLIX");
       // assertThat(romanNumber.convert(878)).isEqualTo("DCCCLXXVIII");


    }
}
