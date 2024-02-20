<h1>Introduction</h1>

Java Project constructed on 2 parts, that uses a REST API to get country data and builds Java Application

<h1>API</h1>

[restcountries](https://restcountries.com/)

<h1>Dependencies</h1>

* Gson (for the JSON -> POJO Deserialization).
>        <dependency>
>            <groupId>com.google.code.gson</groupId>
>            <artifactId>gson</artifactId>
>            <version>2.10.1</version>
>        </dependency>

* JUnit (for writing Unit Tests)
>        <dependency>
>            <groupId>junit</groupId>
>           <artifactId>junit</artifactId>
>            <version>4.13.2</version>
>            <scope>test</scope>
>        </dependency>

<h1>Maven Coordinates</h1>
To add this library as a dependency add the following maven coordinates into your pom.xml file

>	  <dependency>
>        <groupId>org.example</groupId>
>        <artifactId>CountryRESTAPIProject</artifactId>
>        <version>0.0.1-SNAPSHOT</version>
>     </dependency>

# CountriesApp
An Application to utilize the .jar library i constructed in the 1st part of the project

