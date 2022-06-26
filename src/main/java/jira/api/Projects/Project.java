package jira.api.Projects;

public class Project {
    static int genid = 1000;
    public   int id;
    public String self;
    public String summary;
    private String key;
    private String atl_token ;
    private int priority;
    private String user;

    public Project(){}
    public Project(String summary, String atl_token, int priority, String user) {
        genid++;
        this.id = genid;
        this.self = "https://localhost:8080/rest/api/2/isuue/"+this.id;
        this.key = "TEST-"+ ((int)this.id+5032);
        this.summary = summary;
        this.atl_token = atl_token;
        this.priority = priority;
        this.user = user;
    }

                public String getKey() {
                    return key;
                }
                public void setKey(String key) {
                    this.key = key;
                }
                public String getAtl_token() {
                    return atl_token;
                }
                public void setAtl_token(String atl_token) {
                    this.atl_token = atl_token;
                }
                public int getPriority() {
                    return priority;
                }

                public void setPriority(int priority) {
                    this.priority = priority;
                }
                public String getUser() {
                    return user;
                }

                public void setUser(String user) {
                    this.user = user;
                }
                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getSummary() {
                    return summary;
                }

                public void setSummary(String summary) {
                    this.summary = summary;
                }




    @Override
    public String toString() {
        return "{" + "\n"+
                "    id=" + id +"\n"+
                "    key=" + key +"\n"+
                "    self=" + self +"\n"+
                "    summary='" + summary+ '\''  +"\n"+
                "    atl_token='" + atl_token + '\'' +"\n"+
                "    priority='" + priority + '\'' +"\n"+
                "    user='" + user + '\'' +"\n"+
                '}';
    }
}
