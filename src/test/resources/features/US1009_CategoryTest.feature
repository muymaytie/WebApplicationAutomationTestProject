

  Feature: US1009 user should test category one by one


    Scenario:TC9 user tests 10 categories and tests the number of products that should be found


      Given user goes to web App homepage
      When clicks on the electronics category and tests that there are 16 products
      And clicks on the men fashion category and tests that there are 11 products
      Then clicks on the women fashion category and tests that there are 9 products
      And clicks on the shoes category and tests that there are 5 products
      And clicks on the furniture category and tests that there are 6 products
      Then clicks on the travel category and tests that there are 4 products
      And clicks on the kids wear category and tests that there are 7 products
      Then clicks on the kids wear boys category and tests that there are 1 products
      And clicks on the kids wear girls category and tests that there are 1 products
      Then clicks on the grocery category and tests that there are 1 products
      And close page



