#Analysis of a text file to count lines, words, and characters
def analyze_file(file_path):
    try:
        #read file
        with open(file_path, 'r', encoding='utf-8') as file:
            lines = file.readlines()

            #Count lines, words, and characters
            num_lines = len(lines)
            num_words = sum(len(line.split()) for line in lines)
            num_chars = sum(len(line) for line in lines)

            #Display the results
            print(f"Total Lines: {num_lines}")
            print(f"Total Words: {num_words}")
            print(f"Total Characters: {num_chars}")

    #Handle file not found and other exceptions
    except FileNotFoundError:
        print(f"Error: The file '{file_path}' was not found.")
    except Exception as e:
        print(f"An error occurred: {e}")

#Input the file path from user
file_path = input("Enter the path to the file you want to analyze: ")
#Function call to analyze the file
analyze_file(file_path)
