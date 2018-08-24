$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("app.feature");
formatter.feature({
  "line": 1,
  "name": "LoginPage",
  "description": "",
  "id": "loginpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "LoginPageSuccess",
  "description": "",
  "id": "loginpage;loginpagesuccess",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity,"
    },
    {
      "line": 2,
      "name": "@regression,"
    },
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Enter the firstname \"Nikhil\" and lastname \"Thakur\" Email \"nik@ymail.com\" contact \"9876543210\" Address \"Hno 551,Malkajgiri\" City \"Hyderabad\" state \"Maharashtra\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "clicked on SubmitDetails",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "forward to next page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter Projectname \"BankingApplication\" Clientname \"ICICI Bank\" TeamSize \"3\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "display alert box with message SuccessfullyRegistered",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Nikhil",
      "offset": 21
    },
    {
      "val": "Thakur",
      "offset": 43
    },
    {
      "val": "nik@ymail.com",
      "offset": 58
    },
    {
      "val": "9876543210",
      "offset": 82
    },
    {
      "val": "Hno 551,Malkajgiri",
      "offset": 103
    },
    {
      "val": "Hyderabad",
      "offset": 129
    },
    {
      "val": "Maharashtra",
      "offset": 147
    }
  ],
  "location": "AppStory.enter_the_firstname_and_lastname_Email_contact_Address_City_state(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 4311094954,
  "status": "passed"
});
formatter.match({
  "location": "AppStory.clicked_on_SubmitDetails()"
});
formatter.result({
  "duration": 18922,
  "status": "passed"
});
formatter.match({
  "location": "AppStory.forward_to_next_page()"
});
formatter.result({
  "duration": 14753,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BankingApplication",
      "offset": 19
    },
    {
      "val": "ICICI Bank",
      "offset": 51
    },
    {
      "val": "3",
      "offset": 73
    }
  ],
  "location": "AppStory.enter_Projectname_Clientname_TeamSize(String,String,String)"
});
formatter.result({
  "duration": 243746708,
  "status": "passed"
});
formatter.match({
  "location": "AppStory.display_alert_box_with_message_SuccessfullyRegistered()"
});
formatter.result({
  "duration": 16356,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "LoginPageFail1",
  "description": "",
  "id": "loginpage;loginpagefail1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Enter the firstname \"Nikhil\" and lastname \"Thakur\" Email \"nik@ymail\" contact \"9876543210\" Address \"Hno 551,Malkajgiri\" City \"Hyderabad\" state \"Telangana\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "clicked on SubmitDetails",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "display invalid email",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Nikhil",
      "offset": 21
    },
    {
      "val": "Thakur",
      "offset": 43
    },
    {
      "val": "nik@ymail",
      "offset": 58
    },
    {
      "val": "9876543210",
      "offset": 78
    },
    {
      "val": "Hno 551,Malkajgiri",
      "offset": 99
    },
    {
      "val": "Hyderabad",
      "offset": 125
    },
    {
      "val": "Telangana",
      "offset": 143
    }
  ],
  "location": "AppStory.enter_the_firstname_and_lastname_Email_contact_Address_City_state(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 3178223055,
  "status": "passed"
});
formatter.match({
  "location": "AppStory.clicked_on_SubmitDetails()"
});
formatter.result({
  "duration": 11225,
  "status": "passed"
});
formatter.match({
  "location": "AppStory.display_invalid_email()"
});
formatter.result({
  "duration": 10905,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "LoginPageFail2",
  "description": "",
  "id": "loginpage;loginpagefail2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Enter the firstname \"Nikhil\" and lastname \"Thakur\" Email \"nik@ymail.com\" contact \"9876543210\" Address \"Hno 551,Malkajgiri\" City \"Hyderabad\" state \"AndhraPradesh\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "clicked on SubmitDetails",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "forward to next page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter Projectname \"BankingApplication\" Clientname \"ICICI Bank\" TeamSize \"three\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "display invalid teamsize",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Nikhil",
      "offset": 21
    },
    {
      "val": "Thakur",
      "offset": 43
    },
    {
      "val": "nik@ymail.com",
      "offset": 58
    },
    {
      "val": "9876543210",
      "offset": 82
    },
    {
      "val": "Hno 551,Malkajgiri",
      "offset": 103
    },
    {
      "val": "Hyderabad",
      "offset": 129
    },
    {
      "val": "AndhraPradesh",
      "offset": 147
    }
  ],
  "location": "AppStory.enter_the_firstname_and_lastname_Email_contact_Address_City_state(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 3238209431,
  "status": "passed"
});
formatter.match({
  "location": "AppStory.clicked_on_SubmitDetails()"
});
formatter.result({
  "duration": 13471,
  "status": "passed"
});
formatter.match({
  "location": "AppStory.forward_to_next_page()"
});
formatter.result({
  "duration": 9301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BankingApplication",
      "offset": 19
    },
    {
      "val": "ICICI Bank",
      "offset": 51
    },
    {
      "val": "three",
      "offset": 73
    }
  ],
  "location": "AppStory.enter_Projectname_Clientname_TeamSize(String,String,String)"
});
formatter.result({
  "duration": 243981798,
  "status": "passed"
});
formatter.match({
  "location": "AppStory.display_invalid_teamsize()"
});
formatter.result({
  "duration": 15395,
  "status": "passed"
});
});