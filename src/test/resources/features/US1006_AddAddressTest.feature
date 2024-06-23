
  Feature: US1006 Must be able to add address


    Scenario: TC6 user goes to home page from the webApp and add address

      Given user goes to web App homepage
      When clicks account link
      And fills login email box
      And fills login password box
      Then clicks sginIn button
      And clicks mange address link
      Then clicks add address link
      And fills enter name box
      Then fills enter your address box
      And fills enter your address optional box
      Then fills select country dropdown
      And fills select satate dropdown
      Then fills enter city box
      Then fills enter postcode box
      Then clicks add address button
      And close page
