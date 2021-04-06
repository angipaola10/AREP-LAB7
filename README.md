# Laboratory 7 - Amazon Gateway and Lambda

This project is implement a basic converter temperature app to learn about Amazon Gateway and Lambda services.

## Getting started
### Prerequisites
* Git
* Maven
* Java SE Development Kit 8
* Java SE Runtime Environment 8

### Installing
1. To use this project, you must clone it in your computer. Use the folliwing command:

       git clone https://github.com/angipaola10/AREP-LAB7.git

2. You must install dependencies and build the project, for that you enter to the directory 'AREP-LAB7' in the command terminal and run the following command:

       mvn clean install

3.  Once the project is built, you can execute it with Maven in the following way:

        mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.SparkServer"

### Test 
 ![demo](https://media.giphy.com/media/580nt6qRVEkQaVz6X0/giphy.gif)

## Build With
* [Maven](https://maven.apache.org/) - Dependency Management
* CircleCI for CI 
  [![CircleCI](https://circleci.com/gh/angipaola10/AREP-LAB7.svg?style=svg)](https://circleci.com/gh/angipaola10/AREP-LAB7)
* [Spark](http://sparkjava.com/) - Spark Java Framework

## Documentation
This repository contains a [paper](/Document.pdf) that describes the proccess performed to make the program, but if you need aditional iformation in the directory [docs](/docs) you find the documentation of site. 

### Instructions 
If you want generate the documentation of this program, you must follow the next steps:
1. Run the next command to create the documenation:

       mvn javadoc:javadoc
       
2. Now, if you want, you can generate a site to see the documentation. Use the next command: 

       mvn site
       
3. To see the site created, you must run the next command:

       mvn site:run
       
    Enter http://localhost:8080 in your browser to see the site with the documentation.

## Author
* Angi Paola Jiménez Pira - Student at the *Colombian School of Engineering Julio Garavito.*

## License
This project is licensed under the GNU v3.0 - see the [LICENSE.md](LICENSE.md) file for details

    