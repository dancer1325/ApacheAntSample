# "The Complete Apache Ant Bootcamp" course
## Organization
* build.xml root file
  * Basic sample file
* build.xml in Sample folder
  * Basic project, including a build.xml

## How to run it?
* `ant`
  * Execute in the same path which contains build.xml
  * It will execute the build.xml
  * Since no target has been specified --> default one will be executed
* `ant NameOfTheTargetToRun`
  * Execute a target with name "NameOfTheTargetToRun"

## Notes
* Plugins / Views
  * JetBrains contains an Ant view
    * View, Tools Windows, Ant
    * Problems
      * Problem1: 'Project JDK not specified' running there directly
        * Solution: Add sdk to run it

