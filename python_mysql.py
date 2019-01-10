#!/usr/bin/python
# filename: main.py
# Stript pra estudo da conexão python + mysql
# Author: KIK
# Fonte: https://www.jeremymorgan.com/tutorials/python-tutorials/how-to-connect-to-mysql-with-python/

# Pra instalar essa biblioteca: 
# https://stackoverflow.com/questions/25865270/how-to-install-python-mysqldb-module-using-pip
import MySQLdbs

def main():
	# Estabalecendo conexão com o banco de dados
	db = MySQLdb.connect(host="localhost", user="root", passwd="", db="test")

	# Python usa o 'cursor' pra realizar as operações CRUD no DB
	cur = db.cursor()

	# Utiliza o elemento cur pra execurar um comando SQL
	cur.execute("SELECT firstname,lastname FROM test.name")

	exibe(cur)

	sair(cur, db)

# EXIBIÇÃO:
# Loop para ler os dados do banco, armazenados no 'cur'
def exibe(cursor):
	for row in cursor.fetchall() :
		firstname = str(row[0])
		lastname  = str(row[1])

		print ("The first name is: " + firstname)
		print ("The last  name is: " + lastname + "\n")

# Fechando conexões
def sair(cursor, db):
	cursor.close()
	db.close()

if __name__ == "__main__":
	main()