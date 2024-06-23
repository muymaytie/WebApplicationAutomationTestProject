
  Feature: US1007 Must be able to change password


    Scenario:TC7 the user goes to home page from the webApp and change password

      Given user goes to web App homepage
      When clicks account link
      And fills login email box
      And fills login password box
      Then clicks sginIn button
      And clicks change password link
      Then fills old password box
      And fills new password box
      Then fills confirm password box
      And clicks update button
      Then close page
