import fr.einfolearning.tp2.metiers.TextBuffer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextBufferTest {

    @Test
    public void should_return_sb(){
        // Arrangee
        TextBuffer textBuffer = new TextBuffer("je suis cool");
        String expected_sb = "je suis cool";

        //Act
        String sb = textBuffer.toString();

        //Assert
        Assertions.assertEquals(expected_sb,sb);
    }

}
