# This is a comment in a Feature File
Feature: Add Reimbursment

  #Employee Add Reimbursement User Story
  Scenario: Add Reimbursement works
    Given The User is on the Employess Home Page
    When The User enters First Name
    And The User enters Last Name
    And The User enters Date
    And The User enters Time
    And The User enters Location
    And The User enters Description
    And The User enters Cost
    And The User enters Grading Format
    And The User enters Event Type
    And The User clicks Add Reimbursement
    Then The Reimburstment request should be added