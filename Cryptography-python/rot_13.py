"""-----------------------------------------------
*                Alvaro de las Heras             *
*            Spain 2019 - Cryptography           *
-----------------------------------------------"""


def rot_13(p_input_text):
    """
    cypher a text in rot13, it is a caesar version with 13 pass
    :param p_input_text: text that will be cyphered
    :return: the cypher text
    """
    alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    output_text = ""
    rot_offset = int(len(alphabet)/2)
    for i in p_input_text:
        pos = alphabet.find(i)
        output_text += alphabet[(pos + rot_offset) % len(alphabet)]
    return output_text


input_text = input("Write your message to cypher: ")
print("The message cyphred is {:s}".format(rot_13(input_text)))
print("The message decyphred is {:s}".format(rot_13(rot_13(input_text))))