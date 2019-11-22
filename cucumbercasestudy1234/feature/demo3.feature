Feature: Login Action 
Scenario Outline:Successful Login valid credentials
Given user will open the credentials
When user click on login
And user enter "<username>" and "<password>"
Then message displayed login successfully

Examples:
|username                  |password|
|aravind.guggila57@gmail.com|aravind|
|aravindkumarguggila@gmail.com|Arvind@123|