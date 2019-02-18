import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    Commit commit;

    @Before
    public void before(){
        commit = new Commit("Initial Commit","feature","No123" )
    }

    @Test
    public void hasDescription(){
        assertEquals("Initial Commit", commit.getDescription());
    }

    @Test
    public void hasCommitType(){
        assertEquals("feature", commit.getCommitType());
    }

    @Test
    public void hasUniqueId(){
        assertEquals("No123", commit.getUniqueId());
    }

}
