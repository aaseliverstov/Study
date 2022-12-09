import view as v

def name_db():
    name = v.name_db()
    if name == '':
        v.name_db_is_null()
        name = name_db()
    return name

def add_data():
    temp = v.print_add_data()
    if temp == '':
        v.error()
        temp = add_data()
    return temp