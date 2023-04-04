1. Changed the name from example to Soft_Industry for better understanding
2. Removed 'history' folder(even if it is a mandatory folder it should be put to the git ignore) 
3. Removed 'target' folder and put folder to gitignore. It should be present with project but should not been pushed to remote repo
4. Removed '.github' folder. This project will not use remote job for maven or gradle(for the gitlab there is a special file which will be placed into root folder)
5. Removed '.m2' folder with settings xml for few reasons.
5.1 Id - central. Central repository is not require specific authentication.
5.2 For the gitlab it will be enough to use docker for this purposes
6. Removed 'gradle' folder and all correspond gradle files like:
'build.gradle',
'gradlew',
'gradlew.bat' accordingly to the test task requirements(required framework Serenity + Maven)
7. Removed 'LICENSE' file because this test task does not contain any proprietary software(and license is not necessary)
8. Removed CarsAPI. As I understood - this class should represents some Steps(actions) with  ProductsAPI.
In this small task i'm not sure that it's necessary. Just because we will receive one class with one or two methods.
9. Clean up pom.xml:
- Remove JUnit, Hamcrest, Assertj(some of them are not used for this task, some of them is presented inside serenity dependency)
10. Add lombok library for reducing syntax sugar
11. Add Jackson library for working with Deserialized response from API calls
12. Rework positive tests with Example table
13. Rework negative test for verification response code and verification that error section is present

