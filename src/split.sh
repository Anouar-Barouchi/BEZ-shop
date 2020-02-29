#!/bin/bash
 
str="Learn to Split a String in Bash Scripting"
 
IFS='.' # space is set as delimiter
read -ra ADDR <<< "$1" # str is read into an array as tokens separated by IFS
for i in "${ADDR[@]}"; do # access each element of array
    #echo "$i"
    echo "${ADDR[0]}"
done
