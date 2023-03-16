Feature: Hooks in cucumber

Scenario: Add new customer
Given User is on add customer page
When User fills in the customer details 
Then Customer is added

Scenario: Edit Customer
Given User is on Edit Customer page
When User edits contact details
Then Contact details updated

Scenario: Delete Customer
Given User is on delete customer page
When User delete the customer
Then Customer is deleted
