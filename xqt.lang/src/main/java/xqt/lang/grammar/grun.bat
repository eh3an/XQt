d:
cd D:\Projects\PhD\Src\XQt\xqt.lang\src\main\java\xqt\lang\grammar
del /F *.class
javac -cp D:\Tools\IDE\AntLR\antlr45\antlr-4.5-complete.jar D:\Projects\PhD\Src\XQt\xqt.lang\src\main\java\xqt\lang\grammar\*.java
d:
cd D:\Projects\PhD\Src\XQt\xqt.lang\src\main\java\
java  -cp  D:\Tools\IDE\AntLR\antlr45\antlr-4.5-complete.jar; org.antlr.v4.runtime.misc.TestRig xqt.lang.grammar.XQt createProcessModel -gui  c:\Users\%USERNAME%\Documents\SampleProjects\project1\processes\water.xqt
cd D:\Projects\PhD\Src\XQt\xqt.lang\src\main\java\xqt\lang\grammar
@REM java -cp .;antlr-4.2.2-complete.jar org.antlr.v4.runtime.misc.TestRig Hello r -tree