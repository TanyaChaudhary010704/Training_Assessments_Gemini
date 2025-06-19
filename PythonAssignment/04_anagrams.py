from collections import Counter

# This program checks if two strings are anagrams of each other.
def is_anagram(str1, str2):
    """Check if two strings are anagrams, ignoring case and non-alphanumeric characters."""
    
    def clean_string(s):
        return ''.join(ch.lower() for ch in s if ch.isalnum())

    clean_str1 = clean_string(str1)
    clean_str2 = clean_string(str2)

    return Counter(clean_str1) == Counter(clean_str2)

#input two strings to check if they are anagrams
print(is_anagram(input("Enter first string: "), input("Enter second string: ")))            