package TestReadFile;

import ReadFile.LoadFromFake;
import ReadFile.LoadFromStub;
import ReadFile.ReadDelimitedFile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadDelimitedFileTest {

    ReadDelimitedFile readDelimitedFile = new ReadDelimitedFile();

    @Test
    public void getFileDataFirstLineFirstColumnStub() {
        readDelimitedFile.setLoadFile(new LoadFromStub());
        assertEquals("ThisIsAStub@stubStuff.com", readDelimitedFile.getFileData("accounts.csv").get(0)[0]);
    }

    @Test
    public void getFileDataFirstLineSizeStub() {
        readDelimitedFile.setLoadFile(new LoadFromStub());
        assertEquals(3, readDelimitedFile.getFileData("accounts.csv").get(0).length);
    }

    @Test
    public void setFileDelimiterStub() {
        readDelimitedFile.setLoadFile(new LoadFromStub());
        readDelimitedFile.setFileDelimiter("@");
        assertEquals("ThisIsAStub", readDelimitedFile.getFileData("accounts.csv").get(0)[0]);
    }
    @Test
    public void getFileDatLastineFirstColumnFake() {
        readDelimitedFile.setLoadFile(new LoadFromFake());
    }
}
