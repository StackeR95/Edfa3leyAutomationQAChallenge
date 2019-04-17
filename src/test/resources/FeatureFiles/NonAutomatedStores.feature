@Testing


Feature: Adding One Non Automated Store
  Scenario: Validating the message of non automated store
    When User focus on Item url input
    And User Waits for seconds
    And User writes "https://www.nike.com/eg/t/air-max-deluxe-se-shoe-9KH3LX" in Item url input
    And User gets an apology that the store is not available