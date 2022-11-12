# Реализуйте RLE алгоритм: реализуйте модуль сжатия и восстановления данных. 
# Входные и выходные данные хранятся в отдельных текстовых файлах.

def Encrypt(file_name):
    with open(f'{file_name}.txt', 'r') as data:
        text = data.read()
    text_encrupt = ''
    count = 1
    for i in range(len(text)):
        if i != len(text)-1:
            if text[i] == text[i+1]:
                count += 1
            else:
                if count > 9:
                    text_encrupt += str('9')
                    text_encrupt += text[i]
                    count -= int(9)
                    text_encrupt += str(count)
                    text_encrupt += text[i]
                    count = 1
                else:
                    text_encrupt += str(count)
                    text_encrupt += text[i]
                    count = 1
        else:
            if count > 9:
                text_encrupt += str('9')
                text_encrupt += text[i]
                count -= int(9)
                text_encrupt += str(count)
                text_encrupt += text[i]
                count = 1
            else: 
                text_encrupt += str(count)
                text_encrupt += text[i]
                count = 1
    with open(f'{file_name}.rle', 'w') as data:
        data.write(str(''.join(text_encrupt)))

def Decrypt(file_name):
    with open(f'{file_name}.rle', 'r') as data:
        text_encrypted = data.read()
    text_decrupt = ''
    for i in range(0,len(text_encrypted),2):
            text_encrypted[i]
            for k in range(int(text_encrypted[i])):
                text_decrupt += text_encrypted[i+1]
    with open(f'{file_name}.txt', 'w') as data:
        data.write(str(''.join(text_decrupt)))



file_name = 'text'
Encrypt(file_name)
Decrypt(file_name)
