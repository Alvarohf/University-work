import hashlib
# Hashing in MD5(Not recommended)
print(hashlib.new("md5", "HELLO".encode("utf-8")).hexdigest())
# Hashing in SHA1, It is the most common one but not secure, it uses 160 bits
print(hashlib.new("sha1", "HELLO".encode("utf-8")).hexdigest())
# Hashing in SHA256 wich provides a 256 bit hashing, highly recommended but not used because its cost are too high
print(hashlib.new("sha256", "HELLO".encode("utf-8")).hexdigest())
