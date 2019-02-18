import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    GitHubAccount gitHubAccount;

    @Before
    public void before(){
        gitHubAccount = new GitHubAccount("ShabGit123","Shabana");
    }
    @Test
    public void hasUsername(){
        assertEquals("ShabGit123", gitHubAccount.getUsername());
    }

    @Test
    public void hasName(){
        assertEquals("Shabana", gitHubAccount.getName());
    }
}
