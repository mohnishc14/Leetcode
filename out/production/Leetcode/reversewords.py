def reverseWords(s):
    lst = s.split(" ")
    lst = list(filter(lambda x: x != '', lst))
    lst.reverse()
    string = ""
    for i in lst:
        if i != "":
            string += i + " "
    return string.rstrip()

if __name__ == "__main__":
    print(reverseWords("a good   example"))
    print(reverseWords("the sky is blue"))
    print(reverseWords("  hello world  "))
