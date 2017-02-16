#!/bin/bash

if [ -d "$1" ]
	then
		for file in "$1"/*".in"
		do
			echo "Ordenando $file"
			arquivo="${file##*/}"
			java Main < "$file" > "resultados/"${arquivo%.*}".out"
			echo "Resultado salvo em \'""resultados/"${arquivo%.*}".out""\'"
		done
	else
		echo "Ordenando $1"
		file="${1##*/}"
		java Main < "$1" > "resultados/"${file%.*}".out"
		echo "Resultado salvo em '""resultados/"${file%.*}".out""'"
fi


