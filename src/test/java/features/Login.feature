Feature: Application Login

Background:
Given validate the browser
When Browser is triggered
Then check browser is started 


@RegTest
Scenario: Home page default login
Given User is on NetBanking landing page
When  User login into application with "john" and "john@123"
Then Home page is populated 
And Cards are displayed are "true"

@MobileTest
Scenario: Home page default login
Given User is on NetBanking landing page
When  User login into application with "Dan" and "Dan@123"
Then Home page is populated 
And Cards are displayed are "true"

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When  User login into application with "adam" and "adam@123"
Then Home page is populated 
And Cards are displayed are "false"


@SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When  User sign up with following details
| jhenny | adam |jhennyadam@abc.com | USA | 324244828 |
Then Home page is populated 
And Cards are displayed are "false"

@MobileTest
Scenario: Home page default login
Given User is on NetBanking landing page
When  User sign up with following details
| Dan | adam |Danadam@abc.com | USA | 32424778 |
Then Home page is populated 
And Cards are displayed are "true"

@RegTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When  User login into application with <username> and <password>
Then Home page is populated 
And Cards are displayed are "true"

Examples:
|username |password|
|User1    |Pass@1  |
|User2    |Pass@2  |



