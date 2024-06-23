

  Feature:US1014 The user goes to the web homepage and tests the categories available on the homepage



    Scenario:TC14 The user goes to the web homepage and tests it with the names of the categories found on the homepage

      Given user goes to web home page
      When scrolls the page down

      And Click on the electronics category
      Then Tests that there are 16 products in the electronics category

      Then Click on the Men Fashion category
      And Tests that there are 11 products in the men fashion category

      And Click on the Women Fashion category
      Then Tests that there are 9 products in the women fashion category

      And Click on the Shoes category
      Then Tests that there are 5 products in the shose category

      And Click on the Furniture category
      Then Tests that there are 6 products in the furniture category

      And Click on the Travel category
      Then Tests that there are 4 products in the travel category

      And Click on the Travel category
      Then Tests that there are 4 products in the travel category

      And scrolls categories to the right
      And Click on the Kids Wear category
      Then Tests that there are 7 products in the kids wear category

      And Click on the Grocery category
      Then Tests that there are 1 products in the grocery category
      And close page


