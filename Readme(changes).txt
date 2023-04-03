1. Change the name from example to Soft_Industry for better understading
2. Removed 'history' folder(even if it is a mandatory folder it should be put to the git ignore) 
3. Removed 'target' folder and put folder to gitignore. It should be present with project but shouldnot been pushed to remote repo
4. Removed '.github' folder. This project will not use remote job for maven or gradle
5. Removed '.m2' folder with settings xml for few reasons. 1- id - central. Central repository is not require specific authentication
6. Removed 'gradle' folder and all correspond gradle files like:
'build.gradle',
'gradlew',
'gradlew.bat' accordingly to the test task requirements(required framework Serenity + Maven)
7. Removed 'LICENSE' file because this test task does not contain any proprietary software(and license is not necessary)

