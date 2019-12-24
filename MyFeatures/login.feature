Feature: my validation on mercury application

@Sanity
Scenario: user access to signup in website
Given Mercury website is launched
And user clicks on signup up button
When user enters proper data
Then clicks on submit button for

@Regression @Smoke
Scenario: user access to login for registered Member
Given registered user clicks on signin link
Then he provides valid data for login input fields
And clicks on submit button for the login validation 

@Smoke
Scenario: user access to Book Flight
Given user verifies the flights avaialable 
Then selects the desired flight
When user makes the payments
Then Tickets are generated