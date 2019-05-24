$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPage.feature");
formatter.feature({
  "line": 2,
  "name": "run a simple test",
  "description": "",
  "id": "run-a-simple-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@allTests"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Search on google",
  "description": "",
  "id": "run-a-simple-test;search-on-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "that I am on the google home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter BPDTS in the search engine",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "results should show",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.thatIAmOnTheGoogleHomePage()"
});
formatter.result({
  "duration": 125502889,
  "error_message": "java.lang.NullPointerException\n\tat utilities.UtilityMethods.navigateToURL(UtilityMethods.java:23)\n\tat pageobjects.LoginPage.navigateToMainPage(LoginPage.java:22)\n\tat stepDef.LoginStepDefs.thatIAmOnTheGoogleHomePage(LoginStepDefs.java:58)\n\tat ✽.Given that I am on the google home page(LoginPage.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefs.iEnterBPDTSInTheSearchEngine()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.resultsShouldShow()"
});
formatter.result({
  "status": "skipped"
});
});