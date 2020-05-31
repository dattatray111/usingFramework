Feature: Flipkart Smoke Suite
  Verify Important finctionality for flipkart

  @tag1
  Scenario: Login-Logout for Flipkart
    Given User navigate to Flipkart
    When User enter username
    And User enter password
    And Click on sign in button
    Then User should be logged in
    
  