Log Wrapper for Java
====================

This is a generic wrapper to manage any target log system. At this moment it has two target implementations:
- slf4j -> This is most suitable for development environments or production environments not in the Cloud.
- loggr (http://loggr.net/) -> This is the well known cloud logging service Loggr

Installation:
  - Open a GIT client tool (eg. GIT bash)  
  - Clone the project located at: https://github.com/rfvallina/log-wrapper
  - Open a command line window and go to log-wrapper root folder
  - Install it via maven run:  mvn clean install [-Pprod]   (note: it's advisable to add prod profile if the package goes to production. 
  This simply changes the log level to INFO)
 
Dependencies
  - None

Configuration
  1. config.properties allows to select the default logger implementation to be used.
  2. log4j.xml is the configuration file for target log system slf4j
  3. loggr.properties is the configuration file for target log system Loggr
  
How to add a new target log system
  1. Create a new package for the new log
  2. Write a custom class that implements Logger.java interface and save it in the newly created package
  3. Add a new type in LoggerType class for your new log implementation
  4. Add a new case in the getLogger method of ApplicationLogger class
  5. Add a new properties file for the new log system configuration (only if necessary)
  
Requirements
  1. Maven
  2. JDK 1.7
 
  

  


