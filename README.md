# Relayr assignment

First part of the assignment is documented in `Relayr_task.pdf`
For the automation task, please checkout the project `automation-task`

## Set up
- Install Java 8 and Gradle
- Install ChromeDriver. For further references visit: https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver
- Install Firefox Driver. For further reference: https://github.com/SeleniumHQ/selenium/wiki/FirefoxDriver

## Run tests
### Chrome
Run in the terminal, in the directory where the project is downloaded `gradle relayrTest -Dbrowser=chrome` 
### Firefox
Run in the terminal, in the directory where the project is downloaded `gradle relayrTest -Dbrowser=firefox` 

*Note:* Tested on Firefox 61.0.2 and Chrome 68.0.3440.106