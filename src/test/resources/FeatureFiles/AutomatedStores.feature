@Testing


Feature: Adding Two Automated Websites
    Scenario: Adding two amazon websites
      When User focus on Item url input
      And User writes "http://www.amazon.com/dp/B01DBGVB7K/ref=twister_dp_update?ie=UTF8&psc=1" in Item url input
      And User clicks on Add Item
      And User Waits for seconds
      And User writes "http://www.amazon.com/dp/B06XK2SVFP/ref=twister_dp_update?ie=UTF8&psc=1" in Item url input
      And User clicks on Add Item
      And User Waits for seconds