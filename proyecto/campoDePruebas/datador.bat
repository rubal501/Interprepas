move CreadorDeExamenes\src\data\Preguntas.sql C:\xampp\mysql\bin

cd C:\xampp
mysql_start.bat
cd mysql/bin
mysqladmin -u root create DataDePrueba
mysqldump -u root DataDePrueba < Preguntas.sql
exit
