#!/bin/bash

if [ -d "$1" ]
	then
		for file in "$1"/*".in"
		do
			echo "$file"
			java Main < "$file"
		done
	else
		java Main < "$1"
fi


