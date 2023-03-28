$(document).ready(function () {
    // lista
});

// Aca programamos la parte lógica
async function registrarUsuario() {

    let datos = {};
    datos.nombre = document.getElementById('nombre').value;
    datos.apellido = document.getElementById('apellido').value;
    datos.email = document.getElementById('email').value;
    datos.telefono = document.getElementById('telefono').value;
    datos.password = document.getElementById('password').value;

  const request = await fetch('usuarios', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  location.reload();

  //const usuarios = await request.json();

}

