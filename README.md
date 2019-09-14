# MS3_project
Contains MS3 coding challenge
READ ME
MS3 Interview Assignment

The goal of my app was to take a CSV file, parse it, and then insert into an SQLite table. My app does not accomplish this. 
However, I made some progress into what I thought an app would start with. First, I wanted to break down the goal of this into separate 
classes in order to avoid monolith code. The five classes are: (1) parser class to read in the class and store in it a list that can be
manipulated, (2) a table class that creates the SQLite table and contacts the SQLite database, (3) a data class that will classify the 
information in the list, (4) a SQLite connection class that will ensure the database can be contacted without error, (5) and lastly a main 
class to run everything together.


I have a more than a couple major issues with regards to the app working overall. I wasn’t sure how to take the parsed CSV file and then 
both make a table and populate it. Furthmore, my code doesn't produce any usable output.
