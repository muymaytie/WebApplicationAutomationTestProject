

  Feature: US1004 must be negative login


    Scenario:TC4 the user goes to home page from the webApp and login negatively

      Given user goes to web App homepage
      When clicks account link
      And fills login email box
      And fills login password box
      Then clicks sgiIn button
      And tests if there is a negative login
      Then close page


