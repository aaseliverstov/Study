from itertools import groupby

def join_str(string):
    tmp = [''.join(g) for _, g in groupby(string, str.isalpha)]
    return tmp

def calc(tmp, tmp2):

    lst = list(tmp.split())
    lst2 = list(tmp2.split())

    lenght_lst = 0
    result_lst = []

    if len(lst) > len(lst2):
        lenght_lst = len(lst)
    else:
        lenght_lst = len(lst2)

    for i in range(0, lenght_lst - 2, 2):
        tmp = join_str(lst[i])
        tmp2 = join_str(lst2[i])
        result_tmp = (str(int(tmp[0]) + int(tmp2[0])))
        for k in range(1, len(tmp)):
            result_tmp += tmp[k]
        result_lst.append(f'{result_tmp} + ')


    tmp = str(join_str(result_lst[len(result_lst) - 1])).replace(' + ', '').replace("['", '').replace("']", '')
    result_lst.pop()
    result_lst.append(tmp)
    result_lst.append(' = ')
    result_lst.append(str(int(lst[lenght_lst-1]) + int(lst2[lenght_lst-1])))

    result_lst = str(result_lst)
    result_lst = result_lst.replace('[','')
    result_lst = result_lst.replace(']','')
    result_lst = result_lst.replace(',','')
    result_lst = result_lst.replace("'",'')

    return result_lst