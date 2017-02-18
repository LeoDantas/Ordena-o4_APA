#!/bin/bash

if [ -d "$1" ] #vê se é arquivo ou diretório
	then
		for file in "$1"/*".in" #caso seja um diretório
		do
			echo "Ordenando '$file'"
			arquivo="${file##*/}"  #retira o diretório da string
			java Main < "$file" > "resultados/"${arquivo%.*}".out" #pega apenas o nome do arquivo, adiciona .out e salva no diretório de resultados
			echo "Resultado salvo em '""resultados/"${arquivo%.*}".out""'"
		done
	else #caso seja apenas um arquivo
		echo "Ordenando '$1'"
		file="${1##*/}" #retira o diretório da string
		java Main < "$1" > "resultados/"${file%.*}".out" #pega apenas o nome do arquivo, adiciona .out e salva no diretório de resultados
		echo "Resultado salvo em '""resultados/"${file%.*}".out""'"
fi


