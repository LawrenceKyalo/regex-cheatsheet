let regex;

/* matching a specific string */
regex = /hello/;  ////looks for the string between the forward slashes (case-sensitive)... matches "hello", "hello123", "123hello123", "123hello"; doesn't match for "hell0", "Hello" 
regex = /hello/i;
regex = /hello/g;

