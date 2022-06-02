		
Feature: End to end flow of Ideathon application
	
  Scenario Outline: To validate user view of Ideathon webapplication
    Given Url is opened
    When User is in login page and enter valid credintials "<userid>" "<Password>"
    And Click on Signin button
    Then User is able to signin successfully and view wrapper page
    Then Check whether user is able to view all the titles
    And Click on the Ideathon title in wrapper page

    Examples: 
     | userid   | Password   |
     | peravika | Welcome@98 |
