# 2.	Прикрутить бота к задачам с предыдущего семинара:
# Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, 
# добавив в него систему логирования

from telegram import Update
from telegram.ext import ApplicationBuilder, CommandHandler, ContextTypes
import commands as com


key = input('Enter your telegram token: ')

app = ApplicationBuilder().token(f"{key}").build()

app.add_handler(CommandHandler("start", com.start_command))
app.add_handler(CommandHandler("help", com.help_command))
app.add_handler(CommandHandler("calc", com.calc_command))

print('server start')
app.run_polling()

#  Запустить виртуальное окружение, запустить сервер "python main.py"
