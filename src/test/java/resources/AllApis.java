package resources;

public  enum AllApis {



    AddJira("/rest/api/2/issue/"),
    GetJira("/rest/api/2/issue/{issueIdOrKey}"),
    AssignAnJiraToUser("/rest/api/2/issue/{issueIdOrKey}"),

    AttachScreenshotInJira("/rest/api/2/issue/{issue-key}/attachments"),

    DeleteJira("/rest/api/2/issue/{issueIdOrKey}");
    private String resources;



    AllApis(String resources) {

this.resources=resources;
   }

    public String getResources(){
        return resources;
    }
}
