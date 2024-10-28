Feature: Validating Jira API


  Scenario: Verify  if jira is being successfully added using AppJira API
    Given User sets projects as "SCRUM" summary as "TestingEndToEnd" description as "EndToEndScenerios" issueType as "Bug"
    When user calls "AddJira" with "Post" http request
    Then the API call got success with status 201


    Scenario: Verify user gets the jira details
      Given user sets the issueID
      When user calls "GetJira" with "Get" http request
      Then the API call got success with status 200



      Scenario: Verify user is able to delete a jira
        Given user sets the issueID
        When user calls "DeleteJira" with "delete" http request
        Then the API call got success with status 204