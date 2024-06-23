


  Feature: user goes to the web home page and wishlists a product


    Scenario: user goes to the web homepage and adds a product to their wishlist and tests whether it has been added




      Given user goes to web home page
      And will log in to the user account
      When clicks on any product
      And puts the product on the wish list
      Then goes to the wish list and tests if the product has been added
      And clicks the buy now button and removes the product from the wish list
      Then tests if the product has been removed from the wishlist
      And user clicks on any product again
      Then clicks the add to cart button
      And clicks your card link and tests whether the added product is there
      Then removes the product from the card payment section
      And tests whether the product has been removed
      Then closes the page




