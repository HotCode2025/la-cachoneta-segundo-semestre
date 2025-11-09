<script setup>
import { ref } from 'vue'
import proyectsIcon from '/src/assets/proyectosbg.jpg'

const misProyectos = ref([
  {
    id: 1,
    src: proyectsIcon,
    titulo: "Aplicación de Reservas para Restaurantes (2023)",
    descripcion: "Aplicación móvil con Flutter que permite reservar mesas en restaurantes locales",
    projectoLink: "https://www.google.com.ar",
    githubLink: "https://github.com/usuario/proyecto"
  },
  {
    id: 2,
    src: proyectsIcon,
    titulo: "Plataforma de E-learning (2022)",
    descripcion: "Plataforma de educación en línea utilizando Django y React",
    projectoLink: "https://www.google.com.ar",
    githubLink: "https://github.com/usuario/proyecto"
  },
  {
    id: 3,
    src: proyectsIcon,
    titulo: "Blog Personal con CMS (2022)",
    descripcion: "Blog personal con sistema de gestión de contenidos personalizado",
    projectoLink: "https://www.google.com.ar",
    githubLink: "https://github.com/usuario/proyecto"
  },
  {
    id: 4,
    src: proyectsIcon,
    titulo: "Aplicación de Gestión (2023)",
    descripcion: "Herramienta completa para gestión de proyectos y equipo",
    projectoLink: "https://www.google.com.ar",
    githubLink: "https://github.com/usuario/proyecto"
  }
])
</script>

<template>
  <div class="galeria">
    <h2>Nuestros Proyectos</h2>
    <ul class="proyectos-list">
      <li class="proyecto" v-for="proyecto in misProyectos" :key="proyecto.id">
        <div class="proyecto-image-container">
          <img :src="proyecto.src" :alt="proyecto.titulo" class="proyecto-img">
          <div class="overlay"></div>
        </div>
        
        <div class="proyecto-info">
          <h3>{{ proyecto.titulo }}</h3>
          <p class="proyecto-descripcion">{{ proyecto.descripcion }}</p>
          
          <div class="proyecto-links">
            <a :href="proyecto.projectoLink" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">
              Ver Proyecto →
            </a>
            <a :href="proyecto.githubLink" class="github-link" target="_blank" rel="noopener noreferrer">
              ⭐ Código
            </a>
          </div>
        </div>
      </li>
    </ul>
  </div>
</template>

<style scoped>
.galeria {
  width: 100%;
  padding: 4rem 2rem;
  background: linear-gradient(135deg, #000000 0%, #1a0033 100%);
  color: white;
}

h2 {
  text-align: center;
  font-size: 2.5rem;
  margin-bottom: 3rem;
  background: linear-gradient(135deg, var(--accent), var(--secondary), var(--primary));
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
  font-weight: bold;
}

.proyectos-list {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(320px, 1fr));
  gap: 2.5rem;
  list-style: none;
  padding: 0;
}

.proyecto {
  background: rgba(255, 255, 255, 0.08);
  border: 1px solid rgba(255, 255, 255, 0.15);
  backdrop-filter: blur(12px);
  
  border-radius: 20px;
  overflow: hidden;
  box-shadow: 0 8px 25px rgba(0, 0, 0, 0.25);
  transition: all 0.4s cubic-bezier(0.4, 0, 0.2, 1);
  display: flex;
  flex-direction: column;
  height: 100%;
  position: relative; 
}

.proyecto::before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  height: 4px;
  background: linear-gradient(90deg, var(--primary), var(--secondary), var(--accent));
  opacity: 1;
  z-index: 10;
}

.proyecto:hover {
  transform: translateY(-6px);
  box-shadow: 0 15px 40px rgba(0, 0, 0, 0.3);
  border-color: rgba(255, 255, 255, 0.25);
}

.proyecto-image-container {
  position: relative;
  width: 100%;
  height: 220px;
  overflow: hidden;
}

.proyecto-img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
  transition: transform 0.5s cubic-bezier(0.4, 0, 0.2, 1);
}

.overlay {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: linear-gradient(135deg, rgba(153, 41, 234, 0.3), rgba(204, 102, 218, 0.2));
  opacity: 0;
  transition: opacity 0.4s ease;
}

.proyecto:hover .proyecto-img {
  transform: scale(1.1);
}

.proyecto:hover .overlay {
  opacity: 1;
}

.proyecto-info {
  padding: 2rem 1.5rem;
  flex-grow: 1;
  display: flex;
  flex-direction: column;
}

.proyecto-info h3 {
  color: var(--light);
  margin: 0 0 0.8rem 0;
  font-size: 1.25rem;
  font-weight: 700;
  line-height: 1.4;
}

.proyecto-descripcion {
  color: #c0c0c0;
  margin: 0 0 1.5rem 0;
  line-height: 1.6;
  font-size: 0.95rem;
  flex-grow: 1;
}

.proyecto-links {
  display: flex;
  gap: 1rem;
  margin-top: auto;
}

.btn-ver-mas {
  flex: 1;
  background: linear-gradient(135deg, var(--primary), var(--secondary));
  color: var(--light);
  padding: 0.85rem 1.2rem;
  border-radius: 10px;
  text-decoration: none;
  text-align: center;
  font-weight: 600;
  transition: all 0.3s ease;
  border: none;
  cursor: pointer;
  font-size: 0.95rem;
}

.btn-ver-mas:hover {
  transform: translateY(-3px);
  box-shadow: 0 8px 20px rgba(153, 41, 234, 0.4);
  filter: brightness(1.1);
}

.github-link {
  flex: 1;
  color: var(--accent);
  text-decoration: none;
  text-align: center;
  font-weight: 600;
  transition: all 0.3s ease;
  border: 2px solid var(--accent);
  border-radius: 10px;
  padding: 0.85rem 1.2rem;
  font-size: 0.95rem;
  background: transparent;
}

.github-link:hover {
  background: var(--accent);
  color: var(--dark);
  transform: translateY(-3px);
  box-shadow: 0 8px 20px rgba(250, 235, 146, 0.3);
}


@media (max-width: 768px) {
  .galeria {
    padding: 2rem 1.5rem;
  }

  h2 {
    font-size: 2rem;
  }

  .proyectos-list {
    grid-template-columns: 1fr;
    gap: 1.5rem;
  }

  .proyecto-image-container {
    height: 180px;
  }

  .proyecto-info {
    padding: 1.5rem;
  }

  .proyecto-links {
    flex-direction: column;
  }

  .btn-ver-mas,
  .github-link {
    padding: 0.7rem 1rem;
  }
}
</style>
