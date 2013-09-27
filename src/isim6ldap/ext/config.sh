echo off
echo Configuring Properties
echo Env $1
echo Server $2
echo Username $3
echo Password ####
echo ISIM DN $5
echo Base DN $6
echo Object Filter $7
java -cp .:../lib/bcprov-jdk16-140.jar:../lib/commons-codec-1.5.jar:../lib/objects-0.0.1-SNAPSHOT.jar:../lib/util-0.0.1-SNAPSHOT.jar:../lib/commons-cli-1.2.jar:../lib/log4j-1.2.16.jar:./isim6ldap.jar com.prolifics.isim.ldap.LdapShell -config -env $1 -server $2 -username $3 -password $4 -isimDN $5 -baseDN $6 -objectFilter $7