function getUsuarios() { //viene de learnmore.html
    
    // Obtener los valores del formulario
    const nombre = document.getElementById("name").value;
    const apellidos = document.getElementById("apellidos").value;
    const email = document.getElementById("email").value;
    const msg = document.getElementById("mensaje").value;

    // Comprobar si el nombre de usuario ya existe
   

   
    
    // Crear un objeto usuario
    const usuario = {
      "nombre": nombre,
      "apellidos": apellidos,
      "email":email,
      "mensaje":msg
    };
  
    // Realizar una solicitud POST para agregar el usuario
    fetch("/usuarios", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(usuario)
    })
      .then(response => {
        if (response.ok) {
          // Si la respuesta es exitosa, ocultar el formulario de registro y mostrar el formulario de inicio de sesión
          return response.json();
        } else {
          throw new Error('Error en la solicitud');
        }
        
      })
      .then(data => {
        // El usuario ha sido agregado exitosamente
        console.log(data);
      })
      .catch(error => {
        console.error(error);
      });
  };


