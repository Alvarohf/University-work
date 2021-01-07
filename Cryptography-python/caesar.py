"""-----------------------------------------------
*                Alvaro de las Heras             *
*            Spain 2019 - Cryptography           *
-----------------------------------------------"""


def caesar_encode(p_offset, p_input_text):
    """
    Encode a text using caesar method with an specific offset
    :param p_offset: offset that will be used with the alphabet
    :param p_input_text: text that will be cyphered
    :return: the text cyphered
    """
    alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    output_text = ""
    # It will take a char from the alphabet with the offset added
    for i in p_input_text:
        pos = alphabet.find(i)
        output_text += alphabet[(pos + p_offset) % len(alphabet)]
    return output_text


offset = int(input("Write your offset to cypher: "))
input_text = input("Write your message to cypher: ")
print("The message cyphered is: {:s}".format(caesar_encode(offset, input_text)))


def caesar_decode(p_input_text):
    """
    Decode a text encoded in caesar using all of the possibilities
    :param p_input_text: text that will be decoded
    """
    alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    output_text = ""
    # It will print all the options
    for i in range(0, len(alphabet)):
        for j in p_input_text:
            pos = alphabet.find(j)
            output_text += alphabet[(pos + i) % len(alphabet)]
        print("Shift {:d}: {:s}".format(len(alphabet)-i, output_text))
        output_text = ""


caesar_decode("MYXQBKDEVKDSYXC")
