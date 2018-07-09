### Big Read ME

---
### PHPExel
https://forum.processmaker.com/viewtopic.php?f=41&t=710297

### HTTP Codes
* 200 OK—Everything went fine.
* 301 Moved Permanently—The requested URL has been moved, and the client should re-request it at the URL specified in the response.
* 400 Bad Request—The format of the client’s request is invalid and needs to be fixed.
* 401 Unauthorized—The client has asked for something it does not have permission to view. It should try again authenticating the request first.
* 403 Forbidden—For whatever reason, the server is refusing to process this request. This is not the same as 401, where the client can try again with authentication.
* 404 Not Found—The client has asked for something that does not exist.
* 500 Internal Server Error—Something happened resulting in the server being unable to process the request. You typically use this error for situations in which you know the code has entered some sort of inconsistent or buggy state and needs developer attention.
* 503 Service Unavailable—This indicates some sort of runtime failure, such as temporar- ily low on memory or having troubles with network resources. It’s still a fatal error like 500, but it does suggest the client could try again in a while.

### Tag Lines
* Problems in a different tool
* Shiping the errors

### Mail ID for gip team
abwesenheiten@gipmbh.de;appel@gipmbh.de;blees@gipmbh.de;elmiger@gipmbh.de;gramlich@gipmbh.de;guetlich@gipmbh.de;knies@gipmbh.de;andor.marton@gipmbh.de;munir@gipmbh.de;wolff@gipmbh.de;ziegler@gipmbh.de

### Run Kitchen from command line:
kitchen.bat /file:D:\Projects\IC_GUI_Migration\Migration.kjb /level:Basic
pan.bat /file:"D:\Samples\KTRs\MetaInjectibleKidicap\MI_transform.ktr" /param:file_name=D:\Samples\KTRs\MetaInjectibleKidicap\test /param:rest_url=http://sro-misc1-gb:57180 /param:query_name=PNR /level:Basic

### Nodepad ++ move lines up and down
The hot-keys to move lines up and down respectively are ctrl+shift+up and ctrl+shift+down

### Node, Express, Postgres, CRUD
http://mherman.org/blog/2016/09/12/testing-node-and-express
### Node, Express, Postgres, PASSPORT Local
http://mherman.org/blog/2016/09/25/node-passport-and-postgres
promise generator async functions

### Node install nvm (Node Virtual Manager)
curl -o- https://raw.githubusercontent.com/creationix/nvm/v0.33.2/install.sh | bash

### Node install node (NodeJs) using nvm
First install nvm and then --> nvm ls-remote --> nvm install <version>

### Node install,uninstall,update a package (use -g for global)
npm install -g generator-galvanize-express
npm install -g mocha chai yo gulp
npm uninstall -g gulp
npm up -g gulp

### Node list packages
npm ls
npm ls --depth=0 (list packages without dependencies)

### Postgres delete all tables
DROP SCHEMA public CASCADE;
CREATE SCHEMA public;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO public;

### Postgres list all databases
SELECT datname FROM pg_database WHERE datistemplate = false;
### Postgres list all tables in current database
SELECT table_schema,table_name FROM information_schema.tables ORDER BY table_schema,table_name;

### Postgres connection string with schema, username, password and port etc.
jdbc:postgresql://[user]:[passoword]@localhost:5432/mydatabase?currentSchema=myschema

postgresql://[user[:password]@][netloc][:port][/dbname][?param1=value1&...]
postgresql://
postgresql://localhost
postgresql://localhost:5433
postgresql://localhost/mydb
postgresql://user@localhost
postgresql://user:secret@localhost
postgresql://other@localhost/otherdb?connect_timeout=10&application_name=myapp

### Android Show Log/ View Log
adb logcat

### HTTP Headers:
This is to get json with FB url instead of being redirected X-Requested-With: XMLHttpRequest

### Facebook Oauth generic
web browser: (response_type parameter here can be token or code)
https://facebook.com/dialog/oauth?response_type=code&client_id=1060627710736377
  &redirect_uri=fb1060627710736377://authorize&scope=email&state=1234zyx
Native app:
fbauth2://authorize?response_type=code&client_id=CLIENT_ID
  &redirect_uri=REDIRECT_URI&scope=email&state=1234zyx
Response:
fb00000000://authorize#code=AUTHORIZATION_CODE&state=1234zyx
This AUTHORIZARION code can be now exchanged with a token by calling fb oath again.

##Sublime Text
#### Install Plugin : 
Ctrl+Shift+P and type "package control"
#### Format React Native Code :  
    Install HTML-CSS-JS Prettify plugin >> Preferences > Package Settings > HTML\CSS\JS Prettify > Set Prettify Preferences #### The setting is: "e4x": true in the "js" section of the settings file
#### SUBLIME TEXT 3 DEFAULT SYNTAX HIGHLIGHTING FOR FILE TYPES
View > Syntax > Open all with current extension as > CSS

### Git Extentions
Close current project : Ctrl + W
Show current branch only: Ctrl + U
Show all branches : Ctrl + A

###JDK Paths
C:\Program Files\Java\jdk1.8.0_121
C:\Program Files\Java\jdk1.7.0_80

### Find ports occupied with java process
jps -v

### Sign a jar file
Add a new keystore named “testkeys”
keytool -genkey -keystore testKeys -alias jdc

Assign keystore to Jar file
Attached newly keystore “testkeys” to your “TestJnlp.jar” file
jarsigner -keystore testKeys TestJnlp.jar jdc

### Verify a jar file
jarsigner -verify TestJnlp.jar jdc


### Gradle Example Gradle file for creating the build.gradle for Pentaho:
https://github.com/mattyb149/pentaho-plugin-skeletons/blob/master/pdi-step-plugin-skeleton/build.gradle

### Gradle Using different gradle configurations (gradle profile) without changing the .gradle directory :
gradlew -g "D:\Task Breakup\Gradle - Pentaho dependencies using Gradle\myconf" cDC
gradlew -g "D:\Task Breakup\Gradle - Pentaho dependencies using Gradle\gipconf" cDC

### How do I tell Gradle to use specific JDK version?
compileJava.options.fork = true
compileJava.options.forkOptions.executable =C:\Program Files\Java\jdk1.8.0_121

### Gradle always take latest dependency
--refresh-dependencies  Refresh the state of dependencies.

### Gradle This is the line that publishes the batch.
publishing.publications.mavenJava.setArtifacts([])  

### Gradle call ant task
Add this line at the top after plugins <BR/>
``` ant.importBuild 'build_manual.xml'  ```<BR/>
and then call gradle <ant task name>

### Gradle copy task
```
task copyDepsCompile(type: Copy) {
    from configurations.compile
    into "$buildDir/depsCompile"
}
```

### Grade tasks to list all the repositories configured:
task listrepos << {
    println "Repositories:"
    project.repositories.each { println "Name: " + it.name + "; url: " + it.url }
}

### Gradle task to display the caches
task showMeCache << {
  configurations.installer.each { println it }
}

### Gradle dependency tree gip
gralew hDR

### Ant specify build file
ant -buildfile test.xml dist

### Ant print line
<echo>my result is : ${myresult}</echo>

### Sample database mysql,oracle,postges,sql server
ChinookDatabaseSchema

### Oracle - Read a dump file
* Command line
    * impdp SYSTEM/manager DIRECTORY=DUMPDIR dumpfile=NEO_APP_PLATFORM_RZV_57_20170404.dmp logfile=import_log.txt sqlfile=ddl_dump.txt
* SQL Developer
    * view ->DBA
    * create a connection with system priviledge
    * expand connection --> data pump --> right click --> export/import wizard


### Database Find column name (column_name) in database tables oracle
select table_name from dba_tab_columns where column_name='THE_COLUMN_YOU_LOOK_FOR';
select table_name,column_name from all_tab_columns where column_name like '%TAT_ID%';

### Unix SEARCH
grep -r --color 'job_min_temporary_slider' *

### Unix CREATE DIRECTORY
mkdir ./StubGeneration
mkdir ./StubGeneration/classes
mkdir -p ./StubGeneration/classes/a/b/c/d/f

### Unix COPY FILE
cp -v ./HaysGeneralComponent/classes/hays/emailServiceClient/EmailData.java ./StubGeneration/classes/hays/emailServiceClient/EmailData.java

### Unix DELETE DIRECTORY
rmdir StubsGeneration
rm ./HaysGeneralComponent/classes/hays/linkedIn_consent/com/microsoft/schemas/_2003/_10/serialization/ObjectFactory.*

### Unix FIND STRING INSIDE FILE
find . -name "*.java" -type f | xargs -L10 grep '@javax'

### STRING REPLACE
find . -name "*.htm" -type f | xargs -0 grep '\.widget\.' >> test.txt
find . -name "*.htm" -type f -print0 | xargs -0 sed -i 's/\.widget\./\.widget_/g'
find . -name "*.htm" -type f -print0 | xargs -0 sed -i 's/old_word/new_word/g'

### Unix CONNECT TO A SERVER
ssh -Y username@hostname [cygwin]
ssh -X username@hostname [gow]

### Unix FIND VHOST FILES
find -type f -name 'vhost*.conf'

### Unix  List all cfg files
echo **/*.cfg
mkdir configs
cp -v **/*.cfg ./configs
---windows
for /r %x in (*.cfg,*.cfg) do copy "%x" targetDir\

### Unix If you want to determine the name of a Windows machine without DNS, you should try Nbtstat. But that will only work on Windows:
NBTSTAT -A 10.10.10.10
On Linux, you should try nmblookup that does nearly the same.

### Unix TOP HOGGING PROCESSes
ps aux --sort=-%cpu | more

### Unix Unclog open ports
Generating a list of network ports that are in the Listen state on a Linux server is simple with netstat:
netstat -lnp

### Unix Listing today's files only
ls -al --time-style=+%D | grep 'date +%D'

### Unix Space in current directory
df -Ph . | tail -1 | awk '{print $4}'

### Unix Count word in a file.
grep -o "JoobleBot" IdcLog19.htm | wc -c

### Unix transfer contents
rsync --dry-run --remove-source-files -zvahr --exclude 'archive.hda' . drcns@10.190.9.196:/shared_UCM/oracle/dr/dr_consump/ucm_cluster/cs/archives/contentfromcontribution/
scp -r prdctb@HRMNXPD1175.sguk.hays.loc:/oracle/prd/middleware/user_projects/domains/prd_contrib/ucm/cs/archives/contentfordrconsump/ drcns@10.190.9.196:/shared_UCM/oracle/dr/dr_consump/ucm_cluster/cs/archives/contentfromcontribution

rsync --remove-source-files -zvahr --exclude 'archive.hda' . oatcns@10.190.9.196:/shared_UCM/oracle/oat/oat_consump/ucm_cluster/cs/archives/contenttransfertest/

### Unix Delete empty directories
find . -depth -type d -empty -delete

### Unix to check free disk space
df -h

### Unix to check free ram
free -t -g

### Unix sets the modification time of newfile to that of oldfile.
touch -r oldfile newfile

### Unix This command will tell top to run 4 times, with a delay of 60 seconds, and send the output to top.out.
top -b -d 60 -n 4 > top.out

### Unix Watch file count every 5 seconds.
This will first clear the screen, then display the command in the upper left hand corner, and the date/time the command was last run in
the upper right hand corner, followed by the count.
$ watch -n 5 'ls | wc -l'

### Unix Please use below command to split the log file and download only sizable chunks.
where, 1000k is the size of new file IdcLog23.htm is the name of log file Segment is the name of new file created in split
split -b 1000k IdcLog23.htm segment

### Unix Delete trash files from environment
find -type f -regex '\(.*backup.*.zip\|.*.old\|.*bkp.*\|.*Backup.*\|.*backup.*\)' -delete
find . -type d -regex '\(.*backup.*.zip\|.*.old\|.*bkp.*\|.*Backup.*\|.*backup.*\|.*svn\)' -print0|xargs -0 rm -rf --

### Unix Current JAVA HEAP size
java -XX:+PrintFlagsFinal -version | grep -iE 'HeapSize|PermSize|ThreadStackSize'

### Unix  List files with size
du -sh *

### Linux check version information
uname -a

### Windows Show windows 10 wifi password
netsh wlan show profile name="gm-secure-net" key=clear | findstr Key
GM14C12C4CB5WIFI

### Proxy GIP
192.168.4.10
8080

### Ubuntu apt-get not working
Try to set proxy <br/>
Enter this line in the terminal prior to using apt-get (substitute your details for yourproxyaddress and proxyport). <br/>
`export http_proxy=http://yourproxyaddress:proxyport ` <br/>
To make this permanent add the line to /etc/environment file <br/>
Replace `archive.ubuntu.com` and `security.ubuntu.com` with `old-releases.ubuntu.com` and call `sudo apt-get update`
If you normally use sudo to run apt-get you will need to login as root first for this to work unless you also add some explicit environment settings to /etc/sudoers, e.g.<br/>
`Defaults env_keep = "http_proxy https_proxy ftp_proxy"`

### Software Keepass setup
1.) Download and install keepass from http://keepass.info/ 
2.) Download cloud plugin KeeAnyWhere from plugin page and keep plgx file in the same dir as in keepass
3.) Download keepasshttp plugin http://keepass.info/plugins.html#keepasshttp and do same as above.
4.) Restart keepass, you will see an option to open cloud file.
5.) In crome install chromeIPass plugin, it uses keepasshttp

### Mail Fonts Setup:
Georgia/Segoe UI, #333333, 15px

### Tools and Softwares
* Git : Git Extensions
* Passwords : Keepass 
* Text Editors : Sublime Text, Edit Plus, Notepad ++
* Database :  DB Visualizer, Squerrel, SQL Developer
* Command : ConEmu64
* File Explorer : Free Comander XE, Q-Dir(the quad explorer), Explorer++
* REST API Test : Soap UI
* Chrome Extensions : chromeIPass, Full Page Screen Capture, AdBlock Plus
* Cloud File Explorer : CloudBuckit
* PDF Shuffling and Extracting : PDFSam Basic

### Git gitignore example (content of a .gitignore file)
`build/
target/
*.log
*.bak
*~`

### Git modify date of a commit
LC_ALL=C GIT_COMMITTER_DATE="$(date)" git commit --amend --no-edit --date "$(date)"

### Git Delete a branch
git push origin --delete <your_branch>
git branch -D <branch_name> 


### Spoon White-labelling
#### Mehtod 1
* All the images are picked from kettle-ui-swt.jar file.
* Take source code from http://nexus.pentaho.org/content/groups/omni/pentaho-kettle/kettle-ui-swt/6.1.0.1-196/
* Make a java project.
* Start looking at org\pentaho\di\ui\core\dialog\Splash.java
* Change images and icons. Size should be same.
* Build Jar file again.

* For splash screen :  kettle_splash.png (this image also serves the purpose of help screen.)
* For icon : spoon.ico
* License Text :  org\pentaho\di\ui\core\dialog\license\license.txt
* Title of application :  src\org\pentaho\di\ui\spoon\messages\messages_en_US.properties (key = Spoon.Application.Name)
* Start spoon using spoonDebug.bat
#### Mehtod 2
* <Pentaho Installation>\data-integration\ui\images:
  Images placed in <Pentaho Installation>\data-integration\ui\images will override the images from jar file discussed above in method 1
* <Pentaho Installation>\data-integration\ui\laf.properties
  This file contains the relative paths of the images to be used for various purposes in PDI.
* laf.properties (laf stands for Look and Feel) can have an extra property LAFpackage.
  whatever package name is given in this property, that value will replace "org.pentaho.di" while resolving the properties file.
  this is done in LAFMessageHandler class replacePackage method.
* Check in the Pentaho code how the string is being resolved. 
  Case 1:
  BasePropertyHandler.getProperty("splash_image"); --> anything accessed like this can be overriden by just writing that key in laf.properties again.
  Case 2:
  BaseMessages.getString( PKG, "Spoon.Application.Name" ); --> 
  	1.) Find the message properties file in pentaho source code and also the key of the string.
  	2.) make a new java project
  	3.) make same package structure in the project but replace org.pentaho.di with your package name
  	    i.e. Pentaho --> src-ui/org/pentaho/di/ui/spoon/messages/messages_en_US.properties
  		     Your code > com/example/book/ui/spoon/messages/messages_en_US.properties
  	4.) Override the desired the string in your project.
  	5.) Export the java project as jar file into some classpath of PDI
  	6.) add below line in laf.properties
  		LAFpackage=com.example.book

### Debug spoon plugin
* Modify spoon.bat and add following to JAVA_OPTS <BR/>
   ``` -Xdebug" "-Xnoagent" "-Djava.compiler=NONE" "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=1044 ```
* Start spoon and connect the eclipse using debug configurations --> remote application.

### Install spoon from comand line
``` java -jar -DINSTALL_PATH=C:\Users\munir\pentaho\pdi-ee-client-6.1.0.1-196_test\ installer.jar -options-system ```

### Install spoon patches from comand line
``` Installer.exe -i silent -DEULA_ACCEPT=true -DUSER_INSTALL_DIR=C:\Users\munir\pentaho\pdi-ee-client-6.1.0.1-196\data-integration -DEULA_ACCEPT=true -DSILENT_LOG=C:\Users\munir\pentaho\pdi-ee-client-6.1.0.1-196\pentaho-installer.log ```

### Set JAVA_HOME explicitely for spoon
add this line at the top in set-pentaho-env.bat<BR/>
``` set PENTAHO_JAVA_HOME=C:\Program Files\Java\jdk1.8.0_121 ```

### Jboss Wildfly restart via CLI
./jboss-cli.sh -c --command=:'shutdown(restart=true)'

### Start JBoss Wildfly in debug mode
standalone.bat --debug --server-config=standalone.xml<BR/>
Default port to debug in eclipse: 8787<BR/>

### Start Tomcat from the same window
catalina.bat run<BR/>

### Start transformation from java code

```
System.setProperty("KETTLE_PLUGIN_BASE_FOLDERS", "D:\\PentahoA\\design-tools\\data-integration\\plugins");
KettleEnvironment.init();
TransMeta metaData = new TransMeta(
        "D:/Samples/KTRs/IC_Transfer/content/PrengelGerd/KRZ_BehindertenzeitraumListe000.ktr");
Trans trans = new Trans(metaData);
trans.execute(null);
trans.waitUntilFinished();
if (trans.getErrors() > 0) {
    System.out.print("Error Executing transformation");
}
```

### How to address a letter in Germany
Upper left corner: address of the sender. “Abs.” is an abbreviation of “Absender” and means “sender”.<BR/>
Upper right corner: stamp<BR/>
Lower right corner: address of the recipient. “An” means “To”.<BR/>

### Eclipse INI
```
-clean
-startup
plugins/org.eclipse.equinox.launcher_1.3.200.v20160318-1642.jar
--launcher.library
plugins/org.eclipse.equinox.launcher.win32.win32.x86_64_1.1.400.v20160518-1444
-product
org.eclipse.epp.package.jee.product
--launcher.defaultAction
openFile
-vm
C:/Program Files/Java/jdk1.8.0_121/bin/javaw.exe
-showsplash
org.eclipse.platform
--launcher.defaultAction
openFile
--launcher.appendVmargs
-vmargs
-Dosgi.requiredJavaVersion=1.8
-XX:+UseG1GC
-XX:+UseStringDeduplication
-Dosgi.requiredJavaVersion=1.8
-Xms768m
-Xmx4096m
-XX:MaxPermSize=768m
```

### Eclipse install plugin
Help--> Eclipse Marketplace
Gradle [BuildShip,EGradle]

### windows shortcuts
* windows show properties dialog - Win + Puase Break
* window extend screen - Win + P

### Markdown

# H1
### H2
#### H3
##### H4
###### H5
####### H6
Emphasis, aka italics, with *asterisks* or _underscores_.  
Strong emphasis, aka bold, with **asterisks** or __underscores__.  
Combined emphasis with **asterisks and _underscores_**.  
Strikethrough uses two tildes. ~Scratch this~  

1. First ordered list item
2. Another item
  ⋅⋅* Unordered sub-list. 
3. Actual numbers don't matter, just that it's a number
  ⋅⋅1. Ordered sub-list
4. And another item.
* Unordered list can use asterisks
- Or minuses
+ Or pluses
> block text
> [I'm an inline-style link](https://www.google.com)

Inline-style: 
![alt text](https://github.com/adam-p/markdown-here/raw/master/src/common/images/icon48.png "Logo Title Text 1")

Reference-style: 
![alt text][logo]

[logo]: https://github.com/adam-p/markdown-here/raw/master/src/common/images/icon48.png "Logo Title Text 2"

Inline `code` has `back-ticks around` it.  
```javascript  
var s = "JavaScript syntax highlighting";  
alert(s);  
```

### Docker Commands
docker ps -a --format "{{.ID}}: {{.Status}}: {{.Names}}: {{.Ports}}" | grep '54_'