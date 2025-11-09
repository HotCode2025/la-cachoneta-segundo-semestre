<template>
  <div class="sobre-nosotros">
    <div class="container">
      <h2>Sobre Nosotros</h2>
      <p>
        Somos <strong>La Cachoneta</strong>, un colectivo de desarrolladores y
        estudiantes de la UTN unidos por una pasión: transformar ideas en
        experiencias digitales. No nos conformamos con "que funcione".
        Buscamos crear software
        <strong>eficiente, escalable y centrado en el usuario</strong>.
        <br /><br />
        Para nosotros, cada línea de código es un paso hacia una solución más
        inteligente. Estamos en un viaje constante de aprendizaje, explorando las
        últimas tecnologías para construir las herramientas del mañana.
      </p>
    </div>
  </div>
</template>

<style scoped>
.sobre-nosotros {
  background: linear-gradient(180deg, #0a0014 0%, #000000 100%);
  color: #e0e0e0;
  text-align: center;
  padding: 4rem 1rem;
}

.container {
  max-width: 900px;
  margin: 0 auto;
  padding: 0 1rem;
}

p {
  margin: 0 auto;
  line-height: 1.8;
  font-size: 1.15rem;
  color: #c0c0c0;
}

strong {
  color: var(--primary);
  font-weight: 700;
}

@media (max-width: 768px) {
  .sobre-nosotros {
    padding: 3rem 1rem;
  }

  p {
    font-size: 1rem;
  }
}
</style>