

  Feature: US1008 Must be able to contact for help


    Scenario:TC8 the user goes to home page from the webApp and must be contact for help

      Given user goes to web App homepage
      When clicks account link
      And fills login email box
      And fills login password box
      Then clicks sginIn button
      When clicks need help contact us now link
      And tests whether the address is visible
      And tests whether the phone number is visible
      And tests whether the email address is visible
      Then tests the presence of our registration name in the full name box
      Then tests the presence of our registration email in the email address box
      And fills subject box
      And fills message box
      Then clicks send message button
      Then close page
