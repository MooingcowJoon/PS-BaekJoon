def solution(cipher, code):
    decoded = cipher[code - 1::code]
    return decoded