"""-----------------------------------------------
*                Alvaro de las Heras             *
*            Spain 2019 - Cryptography           *
-----------------------------------------------"""

import base64
import binascii

"""Base64 translation at byte level:
    0-25  | A-Z
    26-51 | a-z
    52-61 | 0-9
    62-63 | +,/
    All of these are Ascii chars
"""

""" Base64 uses ASCII chars grouping data in 6 bits blocks
    ABC in 8 bits is: 01000001 | 01000010 | 01000011
    ABC in 6 bits is: 010000 | 010100 | 001001 | 000011
    BASE64:              Q   |    U   |   J    |    D
    
    padding is marked with = signs, it repeats the number of bytes needed to be multiple of 3 bytes
    Example:
    "ABC" padding is 0 so we wont have a = char at the end
    "ABCD" padding is 2, because we need 2 bytes to have 6 bytes so we will have == at the end
    "ABCDE" padding is 1, because we only need 1 byte to have 6 bytes so we will have = at the end
"""


def base64_string_encode(p_input_text,p_format):
    # Each = sign indicates padding between length and the nearest multiple of 3 bytes
    return base64.b64encode(bytes(p_input_text, p_format)).decode("ascii")


print("Your encoded text in base64 is: {:s}".format(base64_string_encode("Vmtkb2NHTjVRbkJqZVVJd1lqSTRaMXBYUm5wbFVUMDk=", "utf-8")))
print("Your decoded text in base64 is: {:s}".format(base64.b64decode("VGhpcyBpcyB0b28gZWFzeQ==").decode('utf-8')))

# Multiple base64 applied
text_encoded = "VWtkc2EwbEliSFprVTBJeFl6SlZaMWxUUW5OaU1qbDNVSGM5UFFvPQo="
while True:
    try:
        text_encoded = base64.b64decode(text_encoded).decode('utf-8')
        print(text_encoded)
    except binascii.Error:
        print("Last one: {:s}".format(text_encoded))
        break

"""
with open("C:\\Program Files\\VideoLAN\\VLC\\vlc.exe", "rb") as f:
    byte = f.read()
    print(base64.b64encode(byte))
"""