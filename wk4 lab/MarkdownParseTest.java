import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }


    @Test
    public void testFile2() throws IOException {
        String contents= Files.readString(Path.of("test-file2.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    
    @Test
    public void testFile6() throws IOException {
        String contents= Files.readString(Path.of("test-file6.md"));
        List<String> expect = List.of("page.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile3() throws IOException {
        String contents= Files.readString(Path.of("test-file3.md"));
        List<String> expect = List.of("https://something.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
}
