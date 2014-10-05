#IN='Thousand.dat'
#OUT='Thousand.png'

IN='10Million.dat'
OUT='10Million.png'



set terminal png giant size 1920,1080 enhanced font 'Helvetica,12'
set output OUT
set xlabel 'Number'
set ylabel 'Steps'
set title 'CollatzConjectur Steps to One'
set key off

plot IN with points pointtype 7 lt rgb "black"
