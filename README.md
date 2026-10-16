-Juan Ledezma creó el repositorio y quien lo clono fue Andrés Moncada 
-se usó la forma de organización C ya que cada uno tenía más conocimiento en ciertos temas que el otro y así se aseguraba una buena estructura 
-iniciábamos un punto en específico , lo analizábamos y buscábamos quien tenía mayor conocimiento para que iniciara y ya lo terminara el otro 
-No tuvimos ninguna dificultad en sincronizar o integrar el trabajo

Juan José Araujo 
1- predicción 
Si cambiamos obtendríamos un error 404 por qué la URL no es igual a la del backend 
2- depuración 
Las 2 causas más probables son 
Que el token no se está enviando o el token es inválido o expiró 
3- transferencia 
Un ejemplo es WhatsApp ya que cuando iniciamos sesión la aplicación mantiene credenciales o tokens de autenticación
estos se almacenan de forma interna y se envían al servidor cuando es necesario 
4. Lectura de código
getCurrentUser recibe el token como parámetro porque así la función es más flexible, reutilizable y fácil de probar
5. Justificación de diseño
Guardar el token en SharedPreferences sin cifrar representa un riesgo porque, si alguien obtiene acceso a los archivos privados de la aplicación,
podría extraerlo y utilizarlo para hacerse pasar por el usuario y acceder a información protegida.
