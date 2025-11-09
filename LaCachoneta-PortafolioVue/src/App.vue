<script setup>
import NavBar from "./components/NavBar.vue";
import HeroEquipo from "./components/HeroEquipo.vue";
import SobreNosotros from "./components/SobreNosotros.vue";
import IntegrantesEquipo from "./components/IntegrantesEquipo.vue";
import ProyectosComponente from "./components/ProyectosComponente.vue";
import ContactoComponente from "./components/ContactoComponente.vue";
</script>

<template>
  <div id="app">
    <NavBar />

    <HeroEquipo />
    <main>
      <section id="sobre-nosotros">
        <SobreNosotros />
      </section>

      <section id="equipo">
        <IntegrantesEquipo />
      </section>

      <section id="proyectos">
        <ProyectosComponente />
      </section>

      <section id="contacto">
        <ContactoComponente />
      </section>
    </main>

    <footer class="footer">
      <a href="#top">↑ Volver arriba</a>
      <p>
        © {{ new Date().getFullYear() }} La Cachoneta Mendoza — Todos los derechos
        reservados
      </p>
    </footer>
  </div>
</template>

<style scoped>
#app {
  font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
  background-color: #000000;
  color: white;
}

.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 2rem;
  text-align: center;
  background: linear-gradient(135deg, #000000 0%, #1a0033 100%);
  color: white;
  border-top: 2px solid #9929ea;
}

.footer a {
  color: #faeb92;
  text-decoration: none;
  margin-bottom: 0.8rem;
  font-weight: bold;
  transition: all 0.3s ease;
}

.footer a:hover {
  text-shadow: 0 0 10px #9929ea;
  transform: translateY(-2px);
}

.footer p {
  margin: 0;
  font-size: 0.95rem;
  color: #cccccc;
}

@media (max-width: 768px) {
  .footer {
    padding: 1.5rem;
  }
}
</style>
