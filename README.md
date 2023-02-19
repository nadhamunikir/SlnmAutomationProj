# SlnmAutomationProj
My coding exercise for selenium test automation

Readme:
Application under test: https://buggy.justtestit.org/

Description: Buggy Cars Rating is an online web application which provides details of Popular Make, Popular Model and Overall Rating of the car models. 
             User can vote his favourite model and provide the comments. This application displays the overall rating and votes for the registered models.
             
Technologies used in the test automation:

•	Java version 8


•	Selenium-java version: '4.5.3'

•	Cucumber-java version: '7.11.1'

•	Junit version '4.13.2'

•	Cucumber-junit version: '7.11.1'

•	Cucumber-runner version: '1.3.5

•	Chrome Browser Version 110.0.5481.104

•	Chrome Web driver version 110.0.5481.77

•	Microsoft Edge Browser version  110.0.1587.50

•	MS Edge Web Driver version 110.0.1587.50

•	IntelliJ IDE

•	Gradle plugin 

•	Junit plugin

•	Cucmber plugin 



Prerequisites:
1.	Download and install Java 1.8 or later version and set the Environment variables. 
Please refer https://www.toolsqa.com/selenium-webdriver/install-java/

2.	Download and install IntelliJ Community edition. 
Please refer https://www.jetbrains.com/idea/download/#section=windows

3.	Clone the git hub repository to your local machine using the following command
    "git clone https://github.com/nadhamunikir/SlnmAutomationProj.git"

4.	Open the project in IntelliJ by double clicking the build.gradle file and exporting the project.

5.	Download the correct chrome driver version depending upon the chrome version on your local computer from https://chromedriver.chromium.org/downloads.
    Extract and copy the chromedriver.exe file to the IntelliJ project folder “src/test/resources/drivers”
    
6.	If you want to use Microsoft Edge, download the correct version driver from https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/. 
    Extract and copy the msedgedriver.exe file to the IntelliJ project folder “src/test/resources/drivers”
    
7.	Add a new JUnit configuration in the IntelliJ project and give the command as below:

    If the browser is Chrome:
    
    -DbrowserName="Chrome" -Durl="https://buggy.justtestit.org/"
    
    If the browser is Microsoftedge:
    
    -DbrowserName="Edge" -Durl="https://buggy.justtestit.org/"
    
    
    ![image](https://user-images.githubusercontent.com/125521343/219924823-db07f65f-5e3f-4a04-90f7-718a0776da90.png)

        
8.	Run the configuration by clicking on the Green button
    ![image](https://user-images.githubusercontent.com/125521343/219924952-86f183fb-2bc5-4e31-97a8-25712b2bae17.png)

 
9.	Test report can be found at /build/reports/cucumber/cucumber-html-report.html
 
    ![image](https://user-images.githubusercontent.com/125521343/219925058-7966c9bb-6017-45ae-90f0-610e929aa803.png)

