# Edfa3leyAutomationQAChallenge
 Edfa3ley QA Challenge is a challenge about adding two automated sites in the cart list and validate that the items are added 
 and adding one non automated site and validate that this site cannot be added to the cart list.
 
 ## Prerequisites
 ```
 1-Chrome webdriver:
 
Mac : brew cask install chromedriver
Windows : a-Install from http://chromedriver.chromium.org/downloads
          b-include the ChromeDriver location in your PATH environment variable
          
2-Safari webdriver : 

Mac : https://developer.apple.com/documentation/webkit/testing_with_webdriver_in_safari
Windows : Not supported by apple

3-Maven :

Mac & Windows : http://maven.apache.org/

4-Java :
Mac :https://java.com/en/download/mac_download.jsp 
Windows : https://www.java.com/en/download/

5-Intellij IDE or Eciplse : " I prefer Intellij"

```
## Running the project.
There are two ways to run the project either from Maven command line or from the IDE itslef.


### Maven
 Inside the project file open the terminal to the directry that contains pom.xml and run this command line
 ```
 mvn test
 ```
 
 ### Intellij IDE
 ```
 1-Open Intellij
 2-Right click on TestRunner
 3-Hover over run
 4-Run TestRunner using Junit
 ```
 ![Alt Step 1](https://i.ibb.co/HztNfKB/Webp-net-gifmaker.gif)
 
 ## Architecture
 My architecutre is based on [POM](https://medium.com/tech-tajawal/page-object-model-pom-design-pattern-f9588630800b) "Page Object Model" Pattern this pattern helps for the easiness to maintain code and remove 
 redundant functions calls at least as possible
 
 ![Alt ArchiImage](https://serving.photos.photobox.com/674987464b6f2b60118c236335ec25c7e8d6343b93ad175d19a68ce08024f08e3184ef57.jpg)
 
 As for the task that was on the cart only , checkout page and login page is not implemented they are just for an example for the page object model
