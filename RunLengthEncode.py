
# Online Python - IDE, Editor, Compiler, Interpreter
def encode(inp):
    result = ""
    length = len(inp)
    for i in range(length):
        count = 1
        while (i < length - 1 and inp[i] == inp[i + 1]):
            count += 1
            i += 1
        if count > 4:
            result += "/" + str(count).zfill(2) + inp[i]
        else:
            result += inp[i] * count
    return result

input_str = input("Enter between 0 and 50 characters: ")
encoded_str = encode(input_str)
print(encoded_str)