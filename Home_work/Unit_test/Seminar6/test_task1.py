import pytest

from task1 import NumsLists


@pytest.fixture
def list1():
    return [1, 2, 3, 4, 5]


@pytest.fixture
def list2():
    return [2, 3, 4, 5, 6]


def test_init(list1, list2):
    """Проверка корректной инициализации класса"""
    nums_list = NumsLists(list1, list2)
    assert nums_list.lst1 == list1
    assert nums_list.lst2 == list2


def test_get_averages(list1, list2):
    """Проверка средних значений списков размером больше 1"""
    nums_list = NumsLists(list1, list2)
    assert nums_list.get_averages() == (3, 4)


def test_first_average_more(list1, list2, capfd):
    """Проверка сообщения когда среднее значение первого списка больше второго"""
    nums_list = NumsLists(list2, list1)
    nums_list.compare_lists()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Первый список имеет большее среднее значение'


def test_second_average_more(list1, list2, capfd):
    """Проверка сообщения когда среднее значение второго списка больше первого"""
    nums_list = NumsLists(list1, list2)
    nums_list.compare_lists()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Второй список имеет большее среднее значение'


def test_equal_averages(list1, capfd):
    """Проверка сообщения когда средние значения списков равны"""
    nums_list = NumsLists(list1, list1)
    nums_list.compare_lists()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Средние значения равны'