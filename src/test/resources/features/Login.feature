Feature: User logins in Homepage

Scenario Outline: Login in Homepage

  Given that User is on the site
  When 	user enters "<Email>" and "<Password>"
  And 	user clicks on login button
  Then  user is on the Home page
  
  Examples:
   
 | 		Email					|	Password	|
 | testautomation024@gmail.com 	|	Test@123	|