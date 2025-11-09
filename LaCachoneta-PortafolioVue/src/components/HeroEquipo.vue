<script setup>
import CachonetaImg from '/src/assets/cachoneta.png'
const nombreEquipo = 'LA CACHONETA'
const subtitulo = 'Creadores de experiencias digitales ✦ Apasionados por el código ✦ Estudiantes UTN'
const descripcion = 'Llevamos acumulado más de 8 años creando softwares centrado en el usuario. Nos enfocamos en el diseño accesible, rendimiento extremo y soluciones escalables. Cuando no codificamos, diseñamos, enseñamos o exploramos nuevas tecnologías emergentes.'
</script>

<template>
  <section class="hero">
    <div class="content">
      <h1>{{ nombreEquipo }}</h1>
      <p class="sub">{{ subtitulo }}</p>

      <div class="about-card">
        <img :src=CachonetaImg alt="La Cachoneta" class="hero-img" />
        <div class="text">
          <h2>Sobre Nosotros</h2>
          <p>{{ descripcion }}</p>
          <div class="buttons">
            <a href="/docs/info-grupal.pdf" target="_blank" class="btn primary">
              Descargar Información Grupal (PDF)
            </a>
            <a href="#contacto" class="btn secondary">Contactar</a>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<style scoped>
.hero {
  background-color: #0a0a0a;
  color: #dcdcdc;
  min-height: 100vh;
  display: flex;
  align-items: center;
  justify-content: center;
  text-align: center;
  padding: 0 2rem;
}

.content {
  max-width: 1000px;
}

h1 {
  font-family: 'Courier New', monospace;
  font-size: 4rem;
  font-weight: 900;
  color: #cc8cff;
  text-shadow: 0 0 25px rgba(204, 102, 218, 0.5);
  margin-bottom: 0.5rem;
}

.sub {
  font-size: 1rem;
  color: #b8b8b8;
  margin-bottom: 3rem;
  letter-spacing: 0.5px;
}

.about-card {
  background: rgba(255, 255, 255, 0.05);
  border: 1px solid rgba(204, 102, 218, 0.2);
  border-radius: 16px;
  padding: 2rem;
  display: flex;
  align-items: center;
  gap: 2rem;
  text-align: left;
  box-shadow: 0 0 40px rgba(153, 41, 234, 0.1);
  backdrop-filter: blur(8px);
}

.hero-img {
  width: 100%;
  max-width: 320px;
  height: auto;
  border-radius: 12px;
  box-shadow: 0 0 25px rgba(153, 41, 234, 0.25);
}

.text h2 {
  color: #b78aff;
  font-size: 2rem;
  margin-bottom: 1rem;
}

.text p {
  color: #cfcfcf;
  line-height: 1.7;
  margin-bottom: 1.8rem;
  font-size: 1rem;
}

.buttons {
  display: flex;
  flex-wrap: wrap;
  gap: 1rem;
}

.btn {
  display: inline-block;
  text-decoration: none;
  padding: 0.8rem 1.6rem;
  border-radius: 25px;
  font-weight: bold;
  transition: all 0.3s ease;
  border: 2px solid transparent;
}

.btn.primary {
  background: linear-gradient(135deg, #9929ea, #cc66da);
  color: #fff;
  box-shadow: 0 0 20px rgba(153, 41, 234, 0.4);
}

.btn.primary:hover {
  background: linear-gradient(135deg, #b64cf2, #d37ef5);
  transform: translateY(-3px);
}

.btn.secondary {
  background: transparent;
  border-color: #cc66da;
  color: #cc66da;
}

.btn.secondary:hover {
  background: rgba(153, 41, 234, 0.1);
  box-shadow: 0 0 15px rgba(153, 41, 234, 0.3);
}

@media (max-width: 768px) {
  h1 {
    font-size: 2.4rem;
  }

  .about-card {
    flex-direction: column;
    text-align: center;
  }

  .hero-img {
    max-width: 260px;
  }

  .text h2 {
    font-size: 1.6rem;
  }

  .buttons {
    justify-content: center;
  }
}
</style>
