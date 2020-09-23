Feature: Application Login

@RegTest
Scenario: Home page default login
Given User is on NetBanking landing page
When  User login into application with "apple" and "app@123"
Then Home page is populated 
And Cards are displayed are "true"