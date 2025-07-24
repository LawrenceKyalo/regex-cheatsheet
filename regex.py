import re

#Searching string start and end

#Check if the string starts with "The" and ends with "Spain":
# This will return a match object if the string matches the pattern, otherwise it returns None.
txt = "The rain in Spain"
x = re.search("^The.*Spain$", txt)

