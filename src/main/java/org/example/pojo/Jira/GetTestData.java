package org.example.pojo.Jira;

public class GetTestData {

    public   static AddIssue addIssue(String project, String summary, String description, String issueType) {
        AddIssue addIssue = new AddIssue();
        Fields fields = new Fields();
        Issuetype issuetype = new Issuetype();
        Project proj = new Project();
        issuetype.setName(issueType);
        proj.setKey(project);
        fields.setProject(proj);
        fields.setSummary(summary);
        fields.setDescription(description);
        fields.setIssuetype(issuetype);
        addIssue.setFields(fields);

        return addIssue;
    }
}
