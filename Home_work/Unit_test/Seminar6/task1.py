class NumsLists:
    def __init__(self, lst1, lst2):
        self.lst1 = lst1
        self.lst2 = lst2

    def get_averages(self):
        average_list1 = sum(self.lst1) / len(self.lst1)
        average_list2 = sum(self.lst2) / len(self.lst2)

        return average_list1, average_list2

    def compare_lists(self) -> None:
        average_list1, average_list2 = self.get_averages()
        if average_list1 > average_list2:
            print('Первый список имеет большее среднее значение')
        elif average_list1 < average_list2:
            print('Второй список имеет большее среднее значение')
        else:
            print('Средние значения равны')
