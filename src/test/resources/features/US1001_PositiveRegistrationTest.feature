

  Feature: US1001 must be positive registration




    Scenario: TC1 the user goes to the home page from the webApp and registers positively

      Given user goes to web App homepage
      When clicks account link
      And  clicks sginUp link
      Then fills name box
      Then fills surname box
      Then fills email box
      Then fills password box
      Then fills confirm password box
      And  clicks sginUp button
      And  clicks account link
      Then tests if there is a positive registration
      And  close page




