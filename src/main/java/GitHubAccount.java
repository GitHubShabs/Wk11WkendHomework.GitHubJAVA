import java.util.ArrayList;
import java.util.HashMap;

public class GitHubAccount {

    private String username;
    private String name;
    private HashMap<String, Repository> repositories;
    private String accountType;

    public GitHubAccount(String username, String name) {
        this.username = username;
        this.name = name;
        this.repositories = new HashMap<>();
        this.accountType = accountType;
    }

    public String getUsername(){
        return username;
    }

    public String getName(){
        return name;
    }

    public int getRepoCount(){
        return this.repositories.size();
    }

    public void addRepo(Repository repository);
       this.repositories.add(repository);
}