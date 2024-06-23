

  Feature: user goes to web homepage and buys product


    Scenario: the user goes to the web homepage clicks on the product enters card information and purchases the product



      Given user goes to web home page
      Then user account will log in
      When scrolls down the page and clicks on any product
      And clicks the buy now button
      Then clicks the purchase confirmation button
      Then clicks the billing address button and fills out and selects the address formula
      And selects the address we saved before for Delivery Address
      Then selects fast sending from the shipping features and tests whether extra money is added
      And it tests whether 7 different card payment methods are available from the payment features
      Then write the necessary instructions in the Write order instructions box
      And return and Refund Policy And Clicks the Terms and Conditions I accept button
      Then presses the order now button and tests whether she ordered successfully or not
      And closes the page




