import re

#Searching string start and end

#Check if the string starts with "The" and ends with "Spain":
# This will return a match object if the string matches the pattern, otherwise it returns None.
txt = "The rain in Spain"
x = re.search("^The.*Spain$", txt)

#Return a list of all matches of the pattern in the string:
re.findall()

#Return a Match object if there is a match anywhere in the string
re.search()

