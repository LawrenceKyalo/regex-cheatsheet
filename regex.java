String regex;

/* matching a specific string */
regex = /hello/;  //looks for the string between the forward slashes (case-sensitive)... matches "hello", "hello123", "123hello123", "123hello"; doesn't match for "hell0", "Hello" 
regex = /hello/i; //looks for the string between the forward slashes (case-insensitive)... matches "hello", "HelLo", "123HelLO"
regex = /hello/g; //looks for multiple occurrences of string between the forward slashes...

/* wildcards */
regex = /h.llo/; // the "." matches any one character other than a new line character... matches "hello", "hallo" but not "h\nllo"
regex = /h.*llo/; // the "*" matches any character(s) zero or more times... matches "hello", "heeeeeello", "hllo", "hwarwareallo"

/* shorthand character classes */
regex = /\d/;  // matches any digit
regex = /\D/;  // matches any non-digit
regex = /\w/;  // matches any word character (a-z, A-Z, 0-9, _)
regex = /\W/;  // matches any non-word character
regex = /\s/;  // matches any white space character (\r (carriage return),\n (new line), \t (tab), \f (form feed))
regex = /\S/;  // matches any non-white space character

/* specific characters */
regex = /[aeiou]/; // matches any character in square brackets
regex = /[ck]atherine/; // matches catherine or katherine
regex = /[^aeiou]/; // matches anything except the characters in square brackets

/* charaacter ranges */
regex = /[a-z]/; // matches all lowercase letters
regex = /[A-Z]/; // matches all uppercase letters
regex = /[e-l]/; // matches lowercase letters e to l (inclusive)
regex = /[F-P]/; // matches all uppercase letters F to P (inclusive)
regex = /[0-9]/; // matches all digits
regex = /[5-9]/; // matches any digit from 5 to 9 (inclusive)
regex = /[a-zA-Z]/; // matches all lowercase and uppercase letters
regex = /[^a-zA-Z]/; // matches non-letters

/* matching repetition using quantifiers */
regex = /(hello){4}/; // matches "hellohellohellohello"
regex = /hello{3}/; // matches "hellooo" and "helloooo" but not "helloo"
regex = /\d{3}/; // matches 3 digits ("312", "122", "111", "12312321" but not "12")
regex = /\d{3,7}/; // matches digits that occur between 3 and 7 times (inclusive)
regex = /\d{3,}/; // matches digits that occur at least 3 times

/* matching repetitions using star and plus */
regex = /ab*c/; // matches zero or more repetitions of "b" (matches "abc", "abbbbc", "ac")
regex = /ab+c/; // matches one or more repetitions of "b" (matches "abc", "abbbbc", but not "ac")

/* matching beginning and end items */
regex = /^[A-Z]\w*/; // matches "H", "Hello", but not "hey"
regex = /\w*s$/; // matches "cats", "dogs", "avocados", but not "javascript"

/* matching word boundaries 

positions of word boundaries:
1. before the first character in string (if first character is a word character)
2. after the last character in the string, if the last character is a word character
3. between two characters in string, where one is a word character and the other isn't */
regex = /\bmeow\b/; // matches "hey meow lol", "hey:meow:lol", but not "heymeow lol"

/* groups */
regex = /it is (ice )?cold outside/; // matches "it is ice cold outside" and "it is cold outside"
