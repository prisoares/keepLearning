#Touch Surgery - Priscilla's QA Web Assignment
----
This project is for the purpose of recruitment of a QA person.

## Project Description
It is a simple test project, which has actually 1 test scenario implemented.

It runs only using Chrome browser, based on this study https://en.wikipedia.org/wiki/Usage_share_of_web_browsers, ~ 80% of the people use Chrome, so I decided, just for this assignment, to use ChromeDriver only. It can be improved in the next versions to run in other browsers. 

This application simulates a person who wants to give his vote to the second Top Reddit Post about Gaming. 
It can Print the Most Upvoted Reddit Post about Gaming. This Application can also check if the user has already voted on the second post and choose another option that was not voted by him yet to vote on it.

The tests were based on the following User Story:

   1. As an User I want to open the website `https://www.reddit.com/`
   
   2. Search for a subreddit called "`gaming`"
   
   3. Open the sub-reddit
   
   4. Print out the top most post's title
   
   5. Perform a login
   
   6. Downvote the second post if it's upvoted already, upvote otherwise.	
   

## Running the Tests
You need to have at least Java 8 installed in your system.
You need to have maven installed in your system.
To run all the tests you need to run the following command in your terminal `mvn test`. (This command will run all the tests scenarios already implemented, you only need to access the folder you have downloaded the project and run the maven command.). 

Or, you can also Run As Junit the Runner class from `$root/src/test/java/com/touchsurgery/reddit/RunCukesTest.java`

## Improvements
The system is not oriented to test automation. Lack of testability in the application. An improvement would be to use `id` or `name` of non-dynamic objects. Because of these dynamic objects I had to use many xPaths to navigate and find the elements, and it could be a problem because if the site structure changes then absolute Xpath will not work. 
geckodriver 

## Missing implementation
The `chromedriver` could be installed when the tests are executed at the first time, in the local machine it is being executed, instead of putting it on the project root.

This test application could use Firefox driver `(geckodriver)` in the next versions to run in other browser.  
	
## Expanding this framework
To expand this project you can create new test scenarios into the `RedditFrontPage.feature` file already created in `$root/src/test/resources/com/touchsurgery/reddit/` or, you can create new `feature-files` for each new system's functionality, or also, you can expand this project just creating new validations. 


### If you want to expand creating new scenarios, use the structure below:

   - `$feature file` = $root/src/test/resources/com/touchsurgery/reddit -> Here you need to create your scenario in a feature-file (To learn how to use BDD to write scenarios you can use https://cucumber.io/training);
   
   - `$RedditFrontPage class` =  $root/src/test/java/com/touchsurgery/reddit/pageobject/RedditFrontPage.java -> Here you need to create or reuse the steps to interact with the page according your scenario. This class has only the responsibility of mapping the fields. (If any question on how to create a correct page object pattern you can go to http://stackoverflow.com/questions/10315894/selenium-webdriver-page-object.);
   
   - `$RedditFrontPageStepDefs` class =  $root/src/test/java/com/touchsurgery/reddit/stedefs/RedditFrontPageStepDefs.java -> Here you need to implement the steps of your scenario;
  
If you have to expand creating new assertions, use the structure below:
   - `$RedditFrontPageStepDefs` class =  $root/src/test/java/com/touchsurgery/reddit/stedefs/RedditFrontPageStepDefs.java -> Here you need to implement the steps of your scenario and add your assertions.


### If you have to expand creating new `feature-files`, use the structure below:

   - `$feature-file` class= $root/src/test/resources/com/touchsurgery/reddit/ -> Here you need to create your `feature-file`.
To create a new `feaure-file` you need to do right click on reddit folder, choose New > File, write your feature name and don't forget to write this exactly ".feature" in the end of your feature's name. After that, you can save this file. Now you have to write your feature, write a description for your feature and create your scenarios according your necessity. (To learn how to use BDD for writing features and scenarios you can go to https://cucumber.io/training);

   - `$RedditFrontPage class` =  $root/src/test/java/com/touchsurgery/reddit/pageobject/RedditFrontPage.java -> Here you need to create or reuse the steps to interact with the page according your scenario. This class has only the responsibility of mapping the fields. (If any question on how to create a correct page object pattern you can go to http://stackoverflow.com/questions/10315894/selenium-webdriver-page-object.);
   
   - `$RedditFrontPageStepDefs` class =  $root/src/test/java/com/touchsurgery/reddit/stedefs/RedditFrontPageStepDefs.java -> Here you need to implement the steps of your scenario.
