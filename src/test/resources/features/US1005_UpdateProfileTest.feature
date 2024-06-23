

  Feature: US1005 profile must be update




    Scenario: TC5 the user goes to home page from the webApp and updates profile

      Given user goes to web App homepage
      When clicks account link
      And fills login email box
      And fills login password box
      Then clicks sgiIn button
      And updates first name
      And updates last name
      And updates email
      And fills the number box
      Then selects photo for profile
      And clicks update button
      Then close page


