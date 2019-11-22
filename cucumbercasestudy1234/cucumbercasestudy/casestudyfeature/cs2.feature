Feature:Login feature
Scenario Outline: TestMe App Login
Given Login page is avaliable
When User enter "<username>" and"<password>"
When click on login button
Then TestMe App Homepage is open
Examples:
|usename|   |password|
|lalitha|   |password123|