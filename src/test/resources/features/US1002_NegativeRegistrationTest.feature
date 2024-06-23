

  Feature: US1002 must be negative registration


    Scenario: TC2 the user goes to home page from the webApp and registers negatively


      Given user goes to web App homepage
      When clicks account link
      And clicks sginUp link
      Then fills name box
      And fills surname box
      And fills email box
      And fills password box
      And fills confirm password box
      Then clicks sginUp button
      Then tests if there is a negative registration
      And close page


