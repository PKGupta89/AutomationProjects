Feature: Application Login
Scenario: Home page default login by valid user
Given User is on Netbanking page
When User login into application with username "pkgupta" and password "12345"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login by invalid user
Given User is on Netbanking page
When User login into application with username "pkgupta2004" and password "45765"
Then Home page is populated
And Cards displayed are "false"