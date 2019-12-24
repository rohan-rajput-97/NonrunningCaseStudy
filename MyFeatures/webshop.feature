Feature: Webshopping

@register
Scenario: User registration
Given Demowebshop website is launched
And user clicks on register up button
When user enters required data
Then  clicks on register button

@login @cart
Scenario: User access to login for registered member
Given registered user clicks on signin button
Then he provides valid data for login requiremnet input fields
And clicks on login button for the login validation 

@searching
Scenario: User searching for item in search bar
Given user clicks on Search Store 
Then user enters the item name
And clicks on Search button

@cart
Scenario: User adds the desired item to cart
Given user selects the item from the given number of list
Then user clicks on add to cart
 