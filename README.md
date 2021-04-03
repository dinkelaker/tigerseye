This is the source code release of the TigersEye DSL Framework.


Apache License
Version 2.0, January 2004
http://www.apache.org/licenses/LICENSE-2.0


# INSTALLATION
To complete the installation you new to copy the following files into /lib:

javalogo.jar
From: http://sourceforge.net/projects/javalogo/
Our via direct link: https://sourceforge.net/projects/javalogo/files/javalogo/0.1/javalogo.zip/download?use_mirror=autoselect


# GETTING STARTED
To build TigersEye, simply use the embedded gradle wrapper:
in the root directory "tigerseye" in which the build.gradle file is located,
you need to run from command line the following:
> gradlew build test 

To set up the project structure:
>gradlew cleanEclipse eclipse


# PITFALLS

## Windows 10

### Could not open/create prefs
When: when exeuting gradle compile for analysis sub-project

Error Message: 

    WARNING: Could not open/create prefs root node Software\JavaSoft\Prefs..."

Solution:
* https://github.com/julienvollering/MIAmaxent/issues/1
* https://stackoverflow.com/questions/16428098/groovy-shell-warning-could-not-open-create-prefs-root-node

