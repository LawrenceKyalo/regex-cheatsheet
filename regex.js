let regex;

/* matching a specific string */
regex = /hello/;
regex = /hello/i;  //looks for the string between the forward slashes (case-insensitive)... matches "hello", "HelLo", "123HelLO"
regex = /hello/g;  //looks for multiple occurrences of string between the forward slashes...