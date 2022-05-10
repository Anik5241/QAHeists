Feature: searching robinhood websites

Scenario Outline: simple robinhood search

Given I am on google homepaage
When I put <"robinhood"> in search engine 
And I click on search 
And I choose the first result that pop up on the screen
Then I see the robinhood homepage

Examples:

| robinhood |
|Software Testing|
#|Quality assurance|



