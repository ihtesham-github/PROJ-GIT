Feature: Dell features validation

Scenario Outline: Dell homepage features validation 

Given  I as User visit Dell homepage
When I clicks on contact us and navigates back to homepage
When I mouse hovers on products and mouse hovers on laptops and clicks on rugged laptops
When I  types "<laptop type>" and press enter
When I scroll down to page navigation and click next page 
When I navigates to back page and navigates to forward page and click on dell technologies to navigate to homepage
Then I lands on dell homepage

Examples:
|laptop type|
|latitude rugged laptop|