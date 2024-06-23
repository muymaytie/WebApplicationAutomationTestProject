

  Feature: US1003 must be positive login



    Scenario: TC3 the user goes to the home page from the webApp and login positively


      Given user goes to web App homepage
      When clicks account link
      And fills login email box
      And fills login password box
      Then clicks sgiIn button
      And tests if there is a positive login
      Then close page