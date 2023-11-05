Feature: THIS IS LOGIN FEATURE


Scenario: Verify user can login successfully
## Make it unique than the others to avoid conflict

Given Launch <"URL"> 
And Click LogIn 
Then Type UserName PassWord and click Login
And Verify user can login successfully