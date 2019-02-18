public class Commit {

    private String description;
    private String commitType;
    private String uniqueId;

    public Commit(String description, String commitType, String uniqueId){
        this.description = description;
        this.commitType = commitType;
        this.uniqueId = uniqueId;
    }

    public String getDescription() {
        return description;
    }

    public String getCommitType() {
        return commitType;
    }

    public String getUniqueId() {
        return uniqueId;
    }



}
