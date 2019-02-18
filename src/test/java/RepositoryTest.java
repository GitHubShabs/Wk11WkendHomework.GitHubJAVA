import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Repository repository;

    @Before
    public void before(){
        repository = new Repository("ShabGit123", "Library","Private", 24);
    }

    @Test
    public void hasName(){
        assertEquals("ShabGit123", repository.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("Library", resporitory.getDescription);
    }







}
