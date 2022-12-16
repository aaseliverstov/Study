from telegram import Update
from telegram.ext import ApplicationBuilder, CommandHandler, ContextTypes
import functions as f
import logger as log


async def start_command(update: Update, context: ContextTypes.DEFAULT_TYPE):
    log.print_start(update.effective_user.first_name,update.effective_user.id,'/start')
    await update.message.reply_text(f'Привет {update.effective_user.first_name}!\n'
                                    f'Введи /help для помощи\n'
                                    f'Или "/calc полином1 | полином2" без кавычек, для сложения полиномов')

async def help_command(update: Update, context: ContextTypes.DEFAULT_TYPE):
    log.print_start(update.effective_user.first_name,update.effective_user.id,'/help')
    await update.message.reply_text(f'/start - начало работы\n'
                                    f'/help - помощь по командам\n'
                                    f'/calc введите полиномы для рассчета без кавычек через символ |  - доступные символы: + ^ = | \n'
                                        'например: 9x^2 + 1x + 2 = 0 | 10x^2 + 5x + 1 = 0\n'
                                        'важно: функционал предназначен для сложения одинаковых по длинне полиномов')

async def calc_command(update: Update, context: ContextTypes.DEFAULT_TYPE):
    msg = update.message.text
    log.print_start(update.effective_user.first_name,update.effective_user.id,msg)
    msg = msg.replace('/calc ', '')
    
    msg_tmp = msg.split('|')
    lst1 = msg_tmp[0]
    lst2 = msg_tmp[1]

    if lst2[0] == ' ':
        lst2 = lst2[1:]

    if lst1[len(lst2)-1] == ' ':
        lst1 = lst1[:-1]

    result = str(f.calc(lst1, lst2))
    log.print_result(update.effective_user.first_name,update.effective_user.id,result)
    await update.message.reply_text(f'{msg} => {result}')