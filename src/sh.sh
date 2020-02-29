#!/bin/bash

#i=1
#while read line; do 
#    if [ i = 1 ];
#    then
#	echo ss
#        s="-cp bin:"
#    fi
#    #echo Line $i : $line
#    s+=$line
#    i=$(( i + 1 ))
#done < ../class
#res=$s+$1
javac $1
if [[ $? -ne 0 ]] ; then
    exit 1
fi
mv *class ../bin
cd ../bin
IFS='.' # space is set as delimiter
read -ra A <<< "$1" # str is read into an array as tokens separated by IFS
java ${A[0]}
echo hello



