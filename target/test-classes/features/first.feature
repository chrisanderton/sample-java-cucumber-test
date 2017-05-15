Feature: 
  Sample test feature

  Background: 
    Given the user is on the sky web site

  @test
  Scenario: Verify Home Page Title
    Then the page title is valid

#  @test
#  Scenario: Verify Shop links
#    When the user select the "Shop" link
#    Then the user should see the following links
#      | TV bundles            |
#      | Channels & shows      |
#      | Features & equipment  |
#      | Installation & set-up |
#      | Switch to Sky TV      |
