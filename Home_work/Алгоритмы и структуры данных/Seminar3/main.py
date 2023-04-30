# Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).

class Node:
    def __init__(self, value=None):
        self.value = value
        self.next_node = None
        self.previous = None

    def __str__(self):
        return self.value


class LinkedList:
    def __init__(self):
        self.previous = None
        self.head = None

    def add_to_end(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
            return
        last_node = self.head
        while last_node.next_node:
            last_node = last_node.next_node
        last_node.next_node = new_node

    def print_linked_list(self):
        node = self.head
        if node is None:
            return "LinkedList is Empty"
        result = ""
        while node:
            result += f"{node.__str__()}" + " "
            node = node.next_node
        return result

    def reverse_list(self, value):
        current = self.head
        next_node = current.next_node
        while current:
            current.next_node = self.previous
            self.previous = current
            current = next_node
            if next_node:
                next_node = next_node.next_node
        self.head = self.previous


a = LinkedList()
a.add_to_end(1)
a.add_to_end(2)
a.add_to_end(3)
a.add_to_end(4)
a.add_to_end(5)
a.add_to_end(6)
print(f"Linked list: {a.print_linked_list()}")
a.reverse_list(a)
print(f"Reverse linked list: {a.print_linked_list()}")
