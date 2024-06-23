

Feature: User tests 8 categories most popular




  Scenario: The user goes to the web home page and tests the products in 8 categories



    Given user goes to web homepage
    When scrolls the page down
    And tests that there are 15 products in the Electronics category
    Then tests that there are 11 products in the Men Fashion category
    And tests that there are 9 products in the Women Fashion category
    Then tests that there are 5 products in the Shoes category
    And tests that there are 6 products in the Furniture category
    Then tests that there are 4 products in the Travel category
    And tests that there are 5 products in the Kids Wear category
    Then tests that there are 1 products in the Grocery category
    And close page
