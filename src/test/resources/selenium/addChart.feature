@Chart
  Feature: Chart

    @add-to-chart
    Scenario:  Add product to chart
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      When user click login button
      Then user is on homepage
      When user click an element add to chart button
      Then number in cart icon increase

    @remove-from-chart
    Scenario:  remove product from chart
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      When user click login button
      Then user is on homepage
      When user click an element add to chart button
      Then number in cart icon increase
      When user click an element remove button
      Then number in cart is decrease
