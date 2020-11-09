Kompilasi java file
```
javac -cp .:/Users/edwardsuwirya/Downloads/commons-lang3-3.11/commons-lang3-3.11.jar -d target src/main/java/com/enigmacamp/simplemaven/Main.java src/main/java/com/enigmacamp/simplemaven/utils/ConsolePrinter.java
```

Membuat jar
```
jar cvf target/app.jar target/com/enigmacamp/simplemaven/Main.class target/com/enigmacamp/simplemaven/utils/ConsolePrinter.class

alternatif

jar cvf target/app.jar -C target/com .

```

Menjalankan manual dengan bantuan class path
```
 java -cp :/Volumes/Ed0128GB/Enigma-Projects/java-mandiri/simple-maven/target/my-app.jar:/Users/edwardsuwirya/Downloads/commons-lang3-3.11/commons-lang3-3.11.jar com.enigmacamp.simplemaven.Main
```

Untuk membuat executable Jar

Buat Folder lib di target
Copy file dependency yang dibutuhkan ke folder lib
Buat file manifest

```
Manifest-Version: 1.0
Created-By: 12.0.1 (Oracle Corporation)
Main-Class: com.enigmacamp.simplemaven.Main
Class-Path: lib/commons-lang3-3.11.jar
```
```
 jar cfm MyJar.jar manifest.txt com/enigmacamp/simplemaven/Main.class com/enigmacamp/simplemaven/utils/ConsolePrinter.class lib/commons-lang3-3.11.jar
```

Untuk menjalankan
```
 java -jar MyJar.jar
```