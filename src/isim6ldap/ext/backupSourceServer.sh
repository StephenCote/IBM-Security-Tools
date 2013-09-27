echo off
echo Backup Source Server

java -cp .:../lib/bcprov-jdk16-140.jar:../lib/commons-codec-1.5.jar:../lib/objects-0.0.1-SNAPSHOT.jar:../lib/util-0.0.1-SNAPSHOT.jar:../lib/commons-cli-1.2.jar:../lib/log4j-1.2.16.jar:./isim6ldap.jar com.prolifics.isim.ldap.LdapShell -sourceEnv $1 -backup