### Disable
git config --global core.autocrlf false

## to unatache file
git rm -r --cached sts vault
git commit -m "Excluyendo sts y vault del repositorio"
git push origin main

### In Windows
To execute all app with gateway is necesary defined host name , for example
#Esto para resolver el gateway en windows
127.0.0.1  LAPTOP-JKHF1ESL.mshome.net