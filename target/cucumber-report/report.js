$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/abc/eclipse-workspace/Myntra/src/test/java/Cucumber/Myntra/Myntra.feature");
formatter.feature({
  "line": 3,
  "name": "Myntra Testing",
  "description": "",
  "id": "myntra-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 29078043100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Login the myntra wesite",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Go to The myntra website",
  "keyword": "Given "
});
formatter.match({
  "location": "Myntra.go_to_the_myntra_website()"
});
formatter.result({
  "duration": 15980752700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#And Click on the login"
    },
    {
      "line": 8,
      "value": "#When Enter the Login Credentials"
    },
    {
      "line": 9,
      "value": "#And Click on the Login button"
    }
  ],
  "line": 11,
  "name": "checking the results",
  "description": "",
  "id": "myntra-testing;checking-the-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "search for the iteam \"shirts\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "select any random iteam",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "shirts",
      "offset": 22
    }
  ],
  "location": "Myntra.search_for_the_iteam_something(String)"
});
formatter.result({
  "duration": 20741791200,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d97.0.4692.99)\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027DESKTOP-VA7NTH0\u0027, ip: \u0027192.168.4.114\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 97.0.4692.99, chrome: {chromedriverVersion: 97.0.4692.71 (adefa7837d02a..., userDataDir: C:\\Users\\abc\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:54862}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9cc68f76167770a11d0abd2e633324df\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027desktop-query\u0027]//input}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat POM.Homepage.searchForShirts(Homepage.java:24)\r\n\tat StepDefination.Myntra.search_for_the_iteam_something(Myntra.java:39)\r\n\tat ???.Given search for the iteam \"shirts\"(C:/Users/abc/eclipse-workspace/Myntra/src/test/java/Cucumber/Myntra/Myntra.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Myntra.select_any_random_iteam()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 121100,
  "status": "passed"
});
});