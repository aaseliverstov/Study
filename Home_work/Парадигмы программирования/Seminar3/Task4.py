# Шаблон Наблюдатель:
# Реализуйте паттерн Наблюдатель на языке Python для системы уведомлений. 
# Создайте класс NotificationSystem (наблюдаемый объект), который будет иметь методы 
# для добавления наблюдателей и уведомления о событиях. Создайте несколько наблюдателей, 
# реагирующих на уведомления.


class Observer():
    def update(self, message):
        print(f"Notify:", message)

class NotificationSystem:
    _observers = []

    def attach(self, observer):
        self._observers.append(observer)

    def notify(self, message):
        for observer in self._observers:
            observer.update(message)

notification_subject = NotificationSystem()

observer1 = Observer()
observer2 = Observer()
observer3 = Observer()

notification_subject.attach(observer1)
notification_subject.attach(observer2)
notification_subject.attach(observer3)

notification_subject.notify("Hello")