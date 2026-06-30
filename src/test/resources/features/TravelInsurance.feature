Feature: Travel Insurance

  Scenario: Display lowest 3 student travel insurance plans

    Given User launches PolicyBazaar website
    When User selects Travel Insurance
    And User selects European country "United Kingdom"
    And User selects travel dates
    And User selects 2 travellers aged 22 and 21
    And User enters dummy details
    Then Display lowest 3 insurance providers and premium amount