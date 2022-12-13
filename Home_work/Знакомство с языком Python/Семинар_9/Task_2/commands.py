from telegram import Update
from telegram.ext import ApplicationBuilder, CommandHandler, ContextTypes
import functions as f
import logger as log


async def start_command(update: Update, context: ContextTypes.DEFAULT_TYPE):
    log.print_start(update.effective_user.first_name,update.effective_user.id,'/start')
    await update.message.reply_text(f'Привет {update.effective_user.first_name}!\n'
                                    f'Введи /help для помощи\n'
                                    f'Или /calc "пример без кавычек" для рассчета')

async def help_command(update: Update, context: ContextTypes.DEFAULT_TYPE):
    log.print_start(update.effective_user.first_name,update.effective_user.id,'/help')
    await update.message.reply_text(f'/start - начало работы\n'
                                    f'/help - помощь по командам\n'
                                    f'/calc "введите пример для рассчета без кавычек" - доступные действия: + - * / ( ) '
                                        'например 1+2 или ((1+2)-4+2)*(2+3*2) и т.д.')

async def calc_command(update: Update, context: ContextTypes.DEFAULT_TYPE):
    msg = update.message.text
    log.print_start(update.effective_user.first_name,update.effective_user.id,msg)
    msg = msg.replace('/calc ', '')
    msg = msg.replace(' ', '')
    result = str(f.calc(msg))
    log.print_result(update.effective_user.first_name,update.effective_user.id,result)
    await update.message.reply_text(f'{msg} => {result}')