import fr.einfolearning.tp2.metiers.TextBuffer;
import org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HamcrestTextBufferTest {

    @Test
    public void should_insert_s_at_position(){
        // Arrangee
        TextBuffer textBuffer = new TextBuffer("je suis cool");
        String sb = textBuffer.toString();

        textBuffer.ins("Yani ", 0);

        //Act
        sb = textBuffer.toString();

        System.out.println(sb);

        assertThat(sb, is("Yani je suis cool"));
    }

    @Test
    public void should_delete_from_to(){
        // Arrangee
        TextBuffer textBuffer = new TextBuffer("je suis cool");
        String sb = textBuffer.toString();

        textBuffer.del(0, 2);

        //Act
        sb = textBuffer.toString();

        System.out.println(sb);

        assertThat(sb, is(" suis cool"));
    }

    @Test
    public void should_extract_from_to(){
        // Arrangee
        TextBuffer textBuffer = new TextBuffer("je suis cool");
        String sb = textBuffer.toString();

        String actual = textBuffer.substr(0, 2);
        String expect = "je";

        //Act
        sb = textBuffer.toString();


        assertThat(actual, is(expect));
    }

    @Test
    public void should_return_capacite_maximal(){
        // Arrangee
        TextBuffer textBuffer = new TextBuffer("je suis cool");
        String sb = textBuffer.toString();

        int actual = textBuffer.maxP();
        int expect = 12;

        //Act
        sb = textBuffer.toString();


        assertThat(actual, is(expect));
    }

    @Test
    public void should_return_sb(){
        // Arrangee
        TextBuffer textBuffer = new TextBuffer("je suis cool");
        String expected_sb = "je suis cool";

        //Act
        String sb = textBuffer.toString();

        //Assert
        assertThat(expected_sb, is(sb));
    }
}
