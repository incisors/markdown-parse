import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;



public class MarkdownParseTest {
  


    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void link() throws IOException{
        Path filename = Path.of("test-file.md");
        String content = Files.readString(filename);
        assertEquals(List.of("https://something.com","something.html"), MarkdownParse.getLinks("test-file.md"));

    }
}