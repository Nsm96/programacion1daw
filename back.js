const contenedor = document.getElementById("productos");
const botonesFiltro = document.querySelectorAll(".boton-filtro");

const imagenes = {
  "Baos": "../public/img/baos.png",
  "Bibimbap": "../public/img/bidimbap.png",
  "Cinnabao rolls": "public/img/cinnabaorolls.png",
  "Cookies de sésamo y chocolate": "public/img/cookiesdesesamoychocolate.png",
  "Cookies de matcha": "public/img/cookiesmatcha.png",
  "Dorayaki": "public/img/dorayakis.png",
  "Edamames": "public/img/Edamanes.png",
  "Focaccia oriental": "public/img/focaccia.png",
  "Gimbap": "public/img/gimbap.png",
  "Gyozas": "public/img/gyozas.png",
  "Kare pan": "public/img/karepan.png",
  "Katsu tofu": "public/img/katsutofu.png",
  "Mapo tofu": "public/img/mapotofu.png",
  "Mochi brownie": "public/img/mochibrownie.png",
  "Pastel de fresas y nata": "public/img/pasterfresas.png",
  "Pato a la naranja": "public/img/patoalanaranja.png",
  "Pato Pekín": "public/img/patopekin.png",
  "Ramen": "public/img/ramen.png",
  "Rollitos de primavera": "public/img/rollitoprimavera.png",
  "Sopa de huevo china": "public/img/sopadehuevochina.png",
  "Sopa de miso tofu con soja y miel": "public/img/sopademiso.png",
  "Sopa de wontons": "public/img/sopadewotons.png",
  "Sunomono": "public/img/sunomono.png",
  "Tamago sando": "public/img/tamagosando.png",
  "Tartar de atún": "public/img/tartardeatun.png",
  "Tiramisú de matcha": "public/img/tiramisu.png",
  "Tostadas estilo Hong Kong": "public/img/tostadasestilohongkong.png",
  "Wontons fritos": "public/img/wotonsfritos.png",
  "Wontons picantes": "public/img/wotonspicantes.png",
  "Bingsu de matcha":"public/img/bingsumatcha.png"
};

let todasLasComidas = [];

function renderizarProductos(lista) {
  contenedor.innerHTML = "";

  lista.forEach(producto => {
    const div = document.createElement("div");
    div.className = "producto";

    const imagen = imagenes[producto.nombre] || "";

    div.innerHTML = `
      <div class="cara cara-texto">
        <h2>${producto.nombre}</h2>
        <p><strong>Descripción:</strong> ${producto["descripción"]}</p>
        <p><strong>Tipo:</strong> ${producto.tipo}</p>
        <p><strong>Kcal:</strong> ${producto.kcal}</p>
        <p><strong>Alérgenos:</strong> ${producto.alergenos.length ? producto.alergenos.join(", ") : "Ninguno"}</p>
        <p><strong>Precio:</strong> ${producto.precio} €</p>
      </div>

      <div class="cara cara-imagen">
        ${
          imagen
            ? `<img src="${imagen}" alt="${producto.nombre}" class="imagen-comida">`
            : `<p class="sin-imagen">Sin imagen disponible</p>`
        }
      </div>
    `;

    contenedor.appendChild(div);
  });
}

fetch("./comidas.json")
  .then(response => response.json())
  .then(data => {
    todasLasComidas = data.Comidas;
    renderizarProductos(todasLasComidas);
  })
  .catch(error => {
    contenedor.innerHTML = `<p class="error">Error al cargar el menú.</p>`;
    console.error(error);
  });

botonesFiltro.forEach(boton => {
  boton.addEventListener("click", () => {
    botonesFiltro.forEach(b => b.classList.remove("activo"));
    boton.classList.add("activo");

    const tipoSeleccionado = boton.dataset.tipo;

    if (tipoSeleccionado === "Todos") {
      renderizarProductos(todasLasComidas);
    } else {
      const filtrados = todasLasComidas.filter(producto => producto.tipo === tipoSeleccionado);
      renderizarProductos(filtrados);
    }
  });
});
