Feature:  LoginPage
@sanity,@regression,@smoke
Scenario: LoginPageSuccess
Given Enter the firstname "Nikhil" and lastname "Thakur" Email "nik@ymail.com" contact "9876543210" Address "Hno 551,Malkajgiri" City "Hyderabad" state "Maharashtra"
When clicked on SubmitDetails
Then forward to next page
When Enter Projectname "BankingApplication" Clientname "ICICI Bank" TeamSize "3"
Then display alert box with message SuccessfullyRegistered

@sanity
Scenario: LoginPageFail1
Given Enter the firstname "Nikhil" and lastname "Thakur" Email "nik@ymail" contact "9876543210" Address "Hno 551,Malkajgiri" City "Hyderabad" state "Telangana"
When clicked on SubmitDetails
Then display invalid email

@smoke
Scenario: LoginPageFail2
Given Enter the firstname "Nikhil" and lastname "Thakur" Email "nik@ymail.com" contact "9876543210" Address "Hno 551,Malkajgiri" City "Hyderabad" state "AndhraPradesh"
When clicked on SubmitDetails
Then forward to next page
When Enter Projectname "BankingApplication" Clientname "ICICI Bank" TeamSize "three"
Then display invalid teamsize
