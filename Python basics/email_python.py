#!/usr/bin/env python
# -*- coding: utf-8 -*-
#Envio de correos con Python
import smtplib
desde ='alvarodelasherasfer@gmail.com'
hacia='neoncommander25252353dg@gmail.com'
asunto = 'GII_RP_Heras_Alvaro_alvarodelasherasfer@gmail.com'
contenido = "Las barras de msg van al reves\n\
#!/usr/bin/env python\n\
# -*- coding: utf-8 -*-\n\
#Envio de correos con Python\n\
import smtplib\n\
desde ='alvarodelasherasfer@gmail.com'\n\
hacia='rpr@uah.es'\n\
asunto = 'GII_Heras_Alvaro_alvarodelasherasfer@gmail.com'\n\
contenido = 'Este codigo'\n\
msg = 'Subject: %s/n/n%s' % (asunto, contenido)\n\
username='alvarodelasherasfer@gmail.com'\n\
password='************'\n\
servidor= smtplib.SMTP('smtp.gmail.com:587')\n\
servidor.starttls()\n\
servidor.login(username,password)\n\
servidor.sendmail(desde,hacia,msg)\n\
servidor.quit"
try:
    msg = 'Subject: %s\n\n%s' % (asunto, contenido)
    username='alvarodelasherasfer@gmail.com'
    password='alvarohf'
    servidor= smtplib.SMTP('smtp.gmail.com:587')
    servidor.starttls()
    servidor.login(username,password)
    servidor.sendmail(desde,hacia,msg)
    servidor.quit
except:
    print('hola')


