$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/2023Selenium/CucumberProject/Features/Hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Hooks in cucumber",
  "description": "",
  "id": "hooks-in-cucumber",
  "keyword": "Feature"
});
formatter.before({
  "duration": 156900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add new customer",
  "description": "",
  "id": "hooks-in-cucumber;add-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on add customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User fills in the customer details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Customer is added",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitions.user_is_on_add_customer_page()"
});
formatter.result({
  "duration": 70735400,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.user_fills_in_the_customer_details()"
});
formatter.result({
  "duration": 67000,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.customer_is_added()"
});
formatter.result({
  "duration": 59200,
  "status": "passed"
});
formatter.after({
  "duration": 79000,
  "status": "passed"
});
formatter.before({
  "duration": 92600,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Edit Customer",
  "description": "",
  "id": "hooks-in-cucumber;edit-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User is on Edit Customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User edits contact details",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Contact details updated",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitions.user_is_on_Edit_Customer_page()"
});
formatter.result({
  "duration": 52000,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.user_edits_contact_details()"
});
formatter.result({
  "duration": 39800,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.contact_details_updated()"
});
formatter.result({
  "duration": 47400,
  "status": "passed"
});
formatter.after({
  "duration": 61300,
  "status": "passed"
});
formatter.before({
  "duration": 102200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Delete Customer",
  "description": "",
  "id": "hooks-in-cucumber;delete-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User is on delete customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User delete the customer",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Customer is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitions.user_is_on_delete_customer_page()"
});
formatter.result({
  "duration": 94700,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.user_delete_the_customer()"
});
formatter.result({
  "duration": 60200,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.customer_is_deleted()"
});
formatter.result({
  "duration": 46900,
  "status": "passed"
});
formatter.after({
  "duration": 66300,
  "status": "passed"
});
});