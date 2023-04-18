Feature: login

  Scenario: Sucessfull login with valid credentials
    Given user opens firefox browser
    #When user opens url "https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2Flogout%2F"
    When user opens url "https://www.hackerrank.com/auth/login"
    #When user opens url "https://www.lenskart.com/eyeglasses/promotions.html?utm_source=google&utm_medium=cpc&utm_campaign=Google-MainAcc-LK-HomeBrand-Search-150119&utm_content=lenskart_exact&utm_source=google&utm_medium=cpc&utm_campaign=Google-MainAcc-LK-HomeBrand-Search-150119&utm_channel=search&gclid=EAIaIQobChMImeqm4I-D_gIVTQ4rCh3mIASMEAAYASAAEgJwavD_BwE "
    And user enters email as "tarunkosuri8@gmail.com" and password as "2020@Grad"
    And click on login
    #Then page title should be "Dashboard | HackerRank"
    Then go to search bar and click and then enter java
    #Then page title should be "Dashboard | HackerRank"
    Then select java inheritance from the dropdown
  	And close browser